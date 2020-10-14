package SearchAlgorithms.Graph.Uniformed;

import AS.State;
import Problems.Problem;
import SearchAlgorithms.Graph.Informed.GreedyBestFirstSearch;

public class UniformCostSearch extends GreedyBestFirstSearch {

    @Override
    public int getNodeLoad(State s, Problem p) {
        return s.getTotalCost();
    }

}
