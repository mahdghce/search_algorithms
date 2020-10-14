package Problems;

import AS.Action;
import AS.State;

import java.util.ArrayList;

public class Problem1 extends Problem {

    private State initialState;

    public Problem1() {
        this.initialState = new State(366, "arad");
        State zerind = new State(374, "zerind");
        State oradea = new State(380, "oradea");
        State sibiu = new State(253, "sibiu");
        State timisoara = new State(329, "timisoara");
        State lugoj = new State(244, "lugoj");
        State mehadia = new State(241, "mehadia");
        State dobreta = new State(242, "doberta");
        State craivoa = new State(160, "craivoa");
        State rimnicuVilcea = new State(193, "rimnicuVilcea");
        State pitesti = new State(98, "pitesti");
        State fagaras = new State(178, "fagaras");
        State bucharest = new State(0, "bucharest");
        State urziceni = new State(80, "urziceni");
        State giurgiu = new State(77, "giurgiu");
        State hirsova = new State(151, "hirsova");
        State eforie = new State(161, "eforie");
        State vaslui = new State(199, "vaslui");
        State iasi = new State(226, "iasi");
        State neamt = new State(234, "neamt");

        initialState.getActionList().add(new Action(zerind, 75));
        initialState.getActionList().add(new Action(sibiu, 140));
        initialState.getActionList().add(new Action(timisoara, 118));

        zerind.getActionList().add(new Action(oradea, 71));
        zerind.getActionList().add(new Action(initialState, 75));

        oradea.getActionList().add(new Action(zerind, 71));
        oradea.getActionList().add(new Action(sibiu, 151));

        timisoara.getActionList().add(new Action(lugoj, 111));
        timisoara.getActionList().add(new Action(initialState, 118));

        lugoj.getActionList().add(new Action(timisoara, 111));
        lugoj.getActionList().add(new Action(mehadia, 70));

        mehadia.getActionList().add(new Action(lugoj, 70));
        mehadia.getActionList().add(new Action(dobreta, 75));

        dobreta.getActionList().add(new Action(mehadia, 75));
        dobreta.getActionList().add(new Action(craivoa, 120));

        craivoa.getActionList().add(new Action(pitesti, 138));
        craivoa.getActionList().add(new Action(rimnicuVilcea, 146));
        craivoa.getActionList().add(new Action(dobreta, 120));

        sibiu.getActionList().add(new Action(fagaras, 99));
        sibiu.getActionList().add(new Action(oradea, 151));
        sibiu.getActionList().add(new Action(rimnicuVilcea, 80));
        sibiu.getActionList().add(new Action(initialState, 140));

        rimnicuVilcea.getActionList().add(new Action(sibiu, 80));
        rimnicuVilcea.getActionList().add(new Action(pitesti, 97));
        rimnicuVilcea.getActionList().add(new Action(craivoa, 146));

        pitesti.getActionList().add(new Action(rimnicuVilcea, 97));
        pitesti.getActionList().add(new Action(craivoa, 138));
        pitesti.getActionList().add(new Action(bucharest, 101));

        fagaras.getActionList().add(new Action(sibiu, 99));
        fagaras.getActionList().add(new Action(bucharest, 211));

        bucharest.getActionList().add(new Action(pitesti, 101));
        bucharest.getActionList().add(new Action(fagaras, 211));
        bucharest.getActionList().add(new Action(giurgiu, 90));
        bucharest.getActionList().add(new Action(urziceni, 85));

        giurgiu.getActionList().add(new Action(bucharest, 90));

        urziceni.getActionList().add(new Action(bucharest, 85));
        urziceni.getActionList().add(new Action(hirsova, 98));
        urziceni.getActionList().add(new Action(vaslui, 142));

        hirsova.getActionList().add(new Action(urziceni, 98));
        hirsova.getActionList().add(new Action(eforie, 86));

        eforie.getActionList().add(new Action(hirsova, 86));

        vaslui.getActionList().add(new Action(iasi, 92));
        vaslui.getActionList().add(new Action(urziceni, 142));

        iasi.getActionList().add(new Action(vaslui, 92));
        iasi.getActionList().add(new Action(neamt, 87));

        neamt.getActionList().add(new Action(iasi, 87));

        states.add(initialState);
        states.add(zerind);
        states.add(timisoara);
        states.add(sibiu);
        states.add(lugoj);
        states.add(mehadia);
        states.add(dobreta);
        states.add(craivoa);
        states.add(rimnicuVilcea);
        states.add(pitesti);
        states.add(fagaras);
        states.add(bucharest);
        states.add(giurgiu);
        states.add(urziceni);
        states.add(hirsova);
        states.add(eforie);
        states.add(vaslui);
        states.add(iasi);
        states.add(neamt);

    }

    @Override
    public boolean isGoal(State a) {
        return a.getActionDetail().equals("bucharest");
    }

    @Override
    public State initialState() {
        return initialState;
    }

    @Override
    public int getH(State a) {
        return a.getHValue();
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    //    State craiova = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(rimnicuVilcea, 146));
//
//            return actions;
//        }
//    };
//
//    State rimnicuVilcea = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(pitesti, 97));
//
//            return actions;
//        }
//    };
//
//    State craiova = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(rimnicuVilcea, 146));
//
//            return actions;
//        }
//    };
//
//    State doberta = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(craiova, 120));
//            craiova.setParent(this);
//            return actions;
//        }
//    };
//
//    State mehadia = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(doberta, 75));
//            doberta.setParent(this);
//            return actions;
//        }
//    };
//
//    State lugoj = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(mehadia, 70));
//            actions.add(new Action(timisoara, 111));
//            mehadia.setParent(this);
//            lugoj.setParent(this);
//            return actions;
//        }
//    };
//
//    State timisoara = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(lugoj, 111));
//            actions.add(new Action(arad, 118));
//            arad.setParent(this);
//            lugoj.setParent(this);
//            return actions;
//        }
//    };
//
//    State sibiu = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(fagaras, 99));
//            actions.add(new Action(rimnicuVilcea, 80));
//            return actions;
//        }
//    };
//
//    State oradea = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(sibiu, 151));
//
//            sibiu.setParent(this);
//            return actions;
//        }
//    };
//
//    State zerind = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(oradea, 71));
//            actions.add(new Action(arad, 75));
//            oradea.setParent(this);
//            arad.setParent(this);
//            return actions;
//        }
//    };
//
//    State arad = new State(0) {
//        @Override
//        public ArrayList<Action> actionList() {
//            ArrayList<Action> actions = new ArrayList<>();
//            actions.add(new Action(zerind, 75));
//            actions.add(new Action(sibiu, 140));
//            actions.add(new Action(timisoara, 118));
//            zerind.setParent(this);
//            sibiu.setParent(this);
//            timisoara.setParent(this);
//            return actions;
//        }
//
//    };

}
