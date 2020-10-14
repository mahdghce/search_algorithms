package SearchAlgorithms.Graph.Uniformed;

import AS.Action;
import AS.State;
import Problems.Problem;
import SearchAlgorithms.Algorithm;

import java.util.ArrayList;

public class DFSIterativeDeepening extends Algorithm {

    @Override
    public State findGoalState(Problem p) {

        State start = p.initialState();

        if (p.isGoal(start)) {
            return start;
        }

        State lastGeneratedStateOfLastDeepening = null;
        State lastGeneratedStateOfCurrentDeepening;
        ArrayList<State> openList = new ArrayList<>();

        int limit = 0;
        while (true) {

            openList.clear();
            openList.add(start);
            getVisited().add(start);
            lastGeneratedStateOfCurrentDeepening = start;

            while (!openList.isEmpty()) {

                setMaxMemoryUsage(Math.max(getMaxMemoryUsage(), openList.size() + getExpanded().size()));
                State st = openList.remove(0);

                if (st.getHeight() >= limit) {
                    limit++;
                    continue;
                }

                getExpanded().add(st);

                for (Action a : st.actionList) {

                    State nS = a.getNextS();

                    if (similarState(openList, nS)) {
                        //limit++;
                        continue;
                    }

                    for (State s : p.states) {
                        if (s.equals(nS)) {
                            s.setParent(st);
                            s.setHeight(s.getParent().getHeight() + 1);
                            s.setTotalCost(a.getCost() + s.getParent().getTotalCost());
                            System.out.println(s.getTotalCost());
                        }
                    }

                    getVisited().add(nS);

                    if (p.isGoal(nS)) {
                        return nS;
                    }

                    openList.add(0, nS);
                    lastGeneratedStateOfCurrentDeepening = nS;
                }
            }

            if (lastGeneratedStateOfCurrentDeepening == lastGeneratedStateOfLastDeepening) {
                return null;
            } else {
                lastGeneratedStateOfLastDeepening = lastGeneratedStateOfCurrentDeepening;
            }
            limit++;
        }
    }
}
