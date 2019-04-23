package state;

public abstract class State {

    public void push(Button b) {
        b.setCurrent(Inactive.instance());
        System.out.println("    Drone is inactive");
    }
    public abstract String getCurrentState();

}
