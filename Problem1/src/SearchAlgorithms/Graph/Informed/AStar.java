package SearchAlgorithms.Graph.Informed;

import AS.State;
import Problems.Problem;

public class AStar extends GreedyBestFirstSearch {

    @Override
    public int getNodeLoad(State s, Problem p) {
        return s.getTotalCost() + p.getH(s);
    }

}
