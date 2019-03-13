package state;

public class Landing extends State{
    private static Landing instance = new Landing();

    private Landing() {}

    public static State instance() {
        return instance;
    }

    public String getCurrentState(){
        return "    Landing";
    }
}
