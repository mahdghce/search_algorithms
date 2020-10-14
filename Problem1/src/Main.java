import AS.State;
import Problems.Problem;
import Problems.Problem1;
import SearchAlgorithms.Algorithm;
import SearchAlgorithms.Graph.Informed.AStar;
import SearchAlgorithms.Graph.Informed.GreedyBestFirstSearch;
import SearchAlgorithms.Graph.Uniformed.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1.BFS Graph search\n" +
                "2.BFS Tree search\n" +
                "3.DFS Graph search\n" +
                "4.DFS Tree search\n" +
                "5.DFS DL Graph search\n" +
                "6.DFS DL Tree search\n" +
                "7.DFS ID Graph search\n" +
                "8.DFS ID Tree search\n" +
                "9.Uniform Cost Graph search\n" +
                "10.Uniform Cost Tree search\n" +
                "11.Greedy Best First Graph search\n" +
                "12.Greedy Best First Tree search\n" +
                "13.AStar Graph search\n" +
                "14.AStar Tree search\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Problem1 problem1 = new Problem1();
        switch (choice) {
            case 1:
                Algorithm algorithm = new BFS().graphSearch();
                algorithm.solve(problem1);
                System.out.println("Visited states number: " + algorithm.getVisited().size());
                System.out.println("Expanded states number: " + algorithm.getExpanded().size());
                System.out.println("Best path: " + algorithm.bestPath());
                System.out.println("Best path cost: " + algorithm.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm.getGoalState().getActionDetail() + "]");
                break;
            case 2:
                Algorithm algorithm1 = new BFS().treeSearch();
                algorithm1.solve(problem1);
                System.out.println("Visited states number: " + algorithm1.getVisited().size());
                System.out.println("Expanded states number: " + algorithm1.getExpanded().size());
                System.out.println("Best path: " + algorithm1.bestPath());
                System.out.println("Best path cost: " + algorithm1.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm1.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm1.getGoalState().getActionDetail() + "]");
                break;
            case 3:
                Algorithm algorithm2 = new DFS().graphSearch();
                algorithm2.solve(problem1);
                System.out.println("Visited states number: " + algorithm2.getVisited().size());
                System.out.println("Expanded states number: " + algorithm2.getExpanded().size());
                System.out.println("Best path: " + algorithm2.bestPath());
                System.out.println("Best path cost: " + algorithm2.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm2.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm2.getGoalState().getActionDetail() + "]");
                break;
            case 4:
                Algorithm algorithm3 = new DFS().treeSearch();
                algorithm3.solve(problem1);
                System.out.println("Visited states number: " + algorithm3.getVisited().size());
                System.out.println("Expanded states number: " + algorithm3.getExpanded().size());
                System.out.println("Best path: " + algorithm3.bestPath());
                System.out.println("Best path cost: " + algorithm3.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm3.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm3.getGoalState().getActionDetail() + "]");
                break;
            case 5:
                System.out.println("Enter the limit:\n");
                Algorithm algorithm4 = new DFSDepthLimited(scanner.nextInt()).graphSearch();
                algorithm4.solve(problem1);
                System.out.println("Visited states number: " + algorithm4.getVisited().size());
                System.out.println("Expanded states number: " + algorithm4.getExpanded().size());
                System.out.println("Best path: " + algorithm4.bestPath());
                System.out.println("Best path cost: " + algorithm4.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm4.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm4.getGoalState().getActionDetail() + "]");
                break;
            case 6:
                System.out.println("Enter the limit:\n");
                Algorithm algorithm5 = new DFSDepthLimited(scanner.nextInt()).treeSearch();
                algorithm5.solve(problem1);
                System.out.println("Visited states number: " + algorithm5.getVisited().size());
                System.out.println("Expanded states number: " + algorithm5.getExpanded().size());
                System.out.println("Best path: " + algorithm5.bestPath());
                System.out.println("Best path cost: " + algorithm5.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm5.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm5.getGoalState().getActionDetail() + "]");
            case 7:
                Algorithm algorithm6 = new DFSIterativeDeepening().graphSearch();
                algorithm6.solve(problem1);
                System.out.println("Visited states number: " + algorithm6.getVisited().size());
                System.out.println("Expanded states number: " + algorithm6.getExpanded().size());
                System.out.println("Best path: " + algorithm6.bestPath());
                System.out.println("Best path cost: " + algorithm6.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm6.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm6.getGoalState().getActionDetail() + "]");
                break;
            case 8:
                Algorithm algorithm7 = new DFSIterativeDeepening().treeSearch();
                algorithm7.solve(problem1);
                System.out.println("Visited states number: " + algorithm7.getVisited().size());
                System.out.println("Expanded states number: " + algorithm7.getExpanded().size());
                System.out.println("Best path: " + algorithm7.bestPath());
                System.out.println("Best path cost: " + algorithm7.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm7.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm7.getGoalState().getActionDetail() + "]");
                break;
            case 9:
                Algorithm algorithm8 = new UniformCostSearch().graphSearch();
                algorithm8.solve(problem1);
                System.out.println("Visited states number: " + algorithm8.getVisited().size());
                System.out.println("Expanded states number: " + algorithm8.getExpanded().size());
                System.out.println("Best path: " + algorithm8.bestPath());
                System.out.println("Best path cost: " + algorithm8.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm8.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm8.getGoalState().getActionDetail() + "]");
                break;
            case 10:
                Algorithm algorithm9 = new UniformCostSearch().treeSearch();
                algorithm9.solve(problem1);
                System.out.println("Visited states number: " + algorithm9.getVisited().size());
                System.out.println("Expanded states number: " + algorithm9.getExpanded().size());
                System.out.println("Best path: " + algorithm9.bestPath());
                System.out.println("Best path cost: " + algorithm9.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm9.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm9.getGoalState().getActionDetail() + "]");
                break;
            case 11:
                Algorithm algorithm10 = new GreedyBestFirstSearch() {
                    @Override
                    public int getNodeLoad(State s, Problem p) {
                        return p.getH(s);
                    }
                }.graphSearch();
                algorithm10.solve(problem1);
                System.out.println("Visited states number: " + algorithm10.getVisited().size());
                System.out.println("Expanded states number: " + algorithm10.getExpanded().size());
                System.out.println("Best path: " + algorithm10.bestPath());
                System.out.println("Best path cost: " + algorithm10.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm10.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm10.getGoalState().getActionDetail() + "]");
                break;
            case 12:
                Algorithm algorithm11 = new GreedyBestFirstSearch() {
                    @Override
                    public int getNodeLoad(State s, Problem p) {
                        return p.getH(s);
                    }
                }.treeSearch();
                algorithm11.solve(problem1);
                System.out.println("Visited states number: " + algorithm11.getVisited().size());
                System.out.println("Expanded states number: " + algorithm11.getExpanded().size());
                System.out.println("Best path: " + algorithm11.bestPath());
                System.out.println("Best path cost: " + algorithm11.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm11.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm11.getGoalState().getActionDetail() + "]");
                break;
            case 13:
                Algorithm algorithm12 = new AStar().graphSearch();
                algorithm12.solve(problem1);
                System.out.println("Visited states number: " + algorithm12.getVisited().size());
                System.out.println("Expanded states number: " + algorithm12.getExpanded().size());
                System.out.println("Best path: " + algorithm12.bestPath());
                System.out.println("Best path cost: " + algorithm12.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm12.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm12.getGoalState().getActionDetail() + "]");
                break;
            case 14:
                Algorithm algorithm13 = new AStar().treeSearch();
                algorithm13.solve(problem1);
                System.out.println("Visited states number: " + algorithm13.getVisited().size());
                System.out.println("Expanded states number: " + algorithm13.getExpanded().size());
                System.out.println("Best path: " + algorithm13.bestPath());
                System.out.println("Best path cost: " + algorithm13.bestCost());
                System.out.println("Max memory usage (states number): " + algorithm13.getMaxMemoryUsage());
                System.out.println("Final state: [" + algorithm13.getGoalState().getActionDetail() + "]");
                break;
            default:
                System.err.println("Wrong input!");
        }
    }

}
