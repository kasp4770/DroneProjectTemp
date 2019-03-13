package state;

public class Button {
    private State current;

    public Button() {
        current = Inactive.instance();
    }

    public void setCurrent(State s) {
        current = s;
    }

    public State getCurrent(){
        return this.current;
    }

    public void push() {
        current.push(this);
    }
}
