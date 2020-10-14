package Problems;

import AS.State;

import java.util.ArrayList;

public abstract class Problem {
    public Problem() {
    }

    public abstract boolean isGoal(State a);

    public abstract State initialState();

    public abstract int getH(State a);

    public ArrayList<State> states = new ArrayList<>();
}
