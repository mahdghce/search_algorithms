package AS;

import java.util.ArrayList;

public class State {
    private int height;
    private int HValue;
    private int totalCost; // g(state)
    private State parent; // if this is root or start node so parent is null
    private String actionDetail; // the action detail that transit from parent to this state
    public ArrayList<Action> actionList;

    //public abstract ArrayList<Action> actionList();

    // public abstract String toString();

    // public abstract boolean equals(State s);

//    public State(int totalCost, int HValue) { // it's for root
//        this.totalCost = totalCost;
//        this.height = 0;
//        this.HValue = HValue;
//    }

//    public State(int totalCost, State parent, String actionDetail) {
//        this(totalCost);
//        this.parent = parent;
//        this.actionDetail = actionDetail;
//        this.height = parent.height + 1;
//    }

    public State(int HValue, String actionDetail) {
        this.HValue = HValue;
        this.actionDetail = actionDetail;
        this.totalCost = 0;
        this.height = 0;
        actionList = new ArrayList<>();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public State getParent() {
        return parent;
    }

    public void setParent(State parent) {
        this.parent = parent;
    }

    public String getActionDetail() {
        return actionDetail;
    }

    public void setActionDetail(String actionDetail) {
        this.actionDetail = actionDetail;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHValue() {
        return HValue;
    }

    public void setHValue(int HValue) {
        this.HValue = HValue;
    }

    public ArrayList<Action> getActionList() {
        return actionList;
    }

    public void setActionList(ArrayList<Action> actionList) {
        this.actionList = actionList;
    }
}
