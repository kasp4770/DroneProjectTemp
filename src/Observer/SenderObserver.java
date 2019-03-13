package Observer;

public class SenderObserver extends Observer{

    public SenderObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("*SENDER*   State: " + subject.getState());
    }
}
