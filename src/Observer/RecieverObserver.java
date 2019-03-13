package Observer;

public class RecieverObserver extends Observer {

    public RecieverObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("*RECIEVER* State: " + subject.getState());
    }
}
