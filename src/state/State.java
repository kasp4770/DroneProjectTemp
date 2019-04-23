package state;

public class State {

    public void push(Button b) {
        b.setCurrent(Inactive.instance());
        System.out.println("    Drone is inactive");
    }

}
