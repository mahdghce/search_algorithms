package AS;

public class Action {
    private State nextS;
    private int cost;

    public Action(State nextS, int cost) {
        this.nextS = nextS;
        this.cost = cost;
    }

    public State getNextS() {
        return nextS;
    }

    public void setNextS(State nextS) {
        this.nextS = nextS;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
