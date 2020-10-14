package SearchAlgorithms.Graph.Informed;

import AS.Action;
import AS.State;
import Problems.Problem;
import SearchAlgorithms.Algorithm;

import java.util.ArrayList;

public abstract class GreedyBestFirstSearch extends Algorithm {

    public abstract int getNodeLoad(State s, Problem p);

    private State bestFirstState(ArrayList<State> OList, Problem p1) {

        int minLoad = Integer.MAX_VALUE;
        State best = null;

        for (State st : OList) {

            int sDotLoad = getNodeLoad(st, p1);

            if (sDotLoad < minLoad) {
                minLoad = sDotLoad;
                best = st;
            }
        }

        return best;
    }

    @Override
    public State findGoalState(Problem p) {

        State start = p.initialState();

        if (p.isGoal(start)) {
            return start;
        }

        ArrayList<State> openList = new ArrayList<>();
        openList.add(start);
        getVisited().add(start);

        while (!openList.isEmpty()) {

            setMaxMemoryUsage(Math.max(getMaxMemoryUsage(), openList.size() + getExpanded().size()));
            State st = bestFirstState(openList, p);
            openList.remove(st);

            if (p.isGoal(st)) {
                return st;
            }

            getExpanded().add(st);

            for (Action a : st.actionList) {

                State nS = a.getNextS();

                if (similarState(openList, nS)) {
                    continue;
                }

                for (State s : p.states) {
                    if (s.equals(nS)) {
                        s.setParent(st);
                        s.setTotalCost(a.getCost() + s.getParent().getTotalCost());
                        System.out.println(s.getTotalCost());
                    }
                }

                getVisited().add(nS);
                openList.add(nS);
            }
        }

        return null;
    }

}
