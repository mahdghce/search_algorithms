package SearchAlgorithms;

import AS.State;
import Problems.Problem;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Algorithm {
    private boolean graphSearch;
    private State goalState;
    private int maxMemoryUsage;
    private HashSet<State> visited, expanded;

    public Algorithm() {
        this.graphSearch = true;
        this.visited = new HashSet<>();
        this.expanded = new HashSet<>();
        this.goalState = null;
    }

    public Algorithm treeSearch() {
        setGraphSearch(false);
        return this;
    }

    public Algorithm graphSearch() {
        setGraphSearch(true);
        return this;
    }

    public abstract State findGoalState(Problem p);

    public void solve(Problem p1) {
        setMaxMemoryUsage(0);
        getVisited().clear();
        getExpanded().clear();
        setGoalState(findGoalState(p1));
        if (getGoalState() == null) {
            System.err.println("Can't reach the goal state");
        }
    }

    public ArrayList<String> bestPath() {
        if (getGoalState() != null) {
            State temp = getGoalState();
            ArrayList<String> actionDetail = new ArrayList<>();
            while (temp.getParent() != null) {
                actionDetail.add(0, temp.getActionDetail());
                temp = temp.getParent();
            }
            return actionDetail;
        }
        return null;
    }

    public int bestCost() {
        if (getGoalState() != null) {
            return goalState.getTotalCost();
        } else return -1;
    }

    public boolean similarState(ArrayList<State> openList, State s) {
        if (isGraphSearch()) {
            for (State A : getExpanded()) {
                if (s.equals(A)) {
                    return true;
                }
            }
        }
        for (State A : openList) {
            if (s.equals(A)) {
                return true;
            }
        }
        return false;
    }

    public boolean isGraphSearch() {
        return graphSearch;
    }

    public void setGraphSearch(boolean graphSearch) {
        this.graphSearch = graphSearch;
    }

    public State getGoalState() {
        return goalState;
    }

    public void setGoalState(State goalState) {
        this.goalState = goalState;
    }

    public int getMaxMemoryUsage() {
        return maxMemoryUsage;
    }

    public void setMaxMemoryUsage(int maxMemoryUsage) {
        this.maxMemoryUsage = maxMemoryUsage;
    }

    public HashSet<State> getVisited() {
        return visited;
    }

    public void setVisited(HashSet<State> visited) {
        this.visited = visited;
    }

    public HashSet<State> getExpanded() {
        return expanded;
    }

    public void setExpanded(HashSet<State> expanded) {
        this.expanded = expanded;
    }
}
