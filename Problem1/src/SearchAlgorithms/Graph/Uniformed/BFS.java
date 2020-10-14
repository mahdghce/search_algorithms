package SearchAlgorithms.Graph.Uniformed;

import AS.Action;
import AS.State;
import Problems.Problem;
import SearchAlgorithms.Algorithm;

import java.util.ArrayList;

public class BFS extends Algorithm {

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
            State st = openList.remove(0);
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

                if (p.isGoal(nS)) {
                    return nS;
                }

                openList.add(nS);
            }
        }

        return null;
    }
}
