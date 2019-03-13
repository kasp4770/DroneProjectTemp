import Observer.RecieverObserver;
import Observer.SenderObserver;
import Observer.Subject;
import State.Button;

import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader( System.in );
        Button btn = new Button();

        //Observer objects
        Subject subject = new Subject();
        SenderObserver senderObserver = new SenderObserver(subject);
        RecieverObserver recieverObserver = new RecieverObserver(subject);

        while (true) {
            System.out.print("Press 'Enter' to continue to the next state of the drone");
            is.read();
            btn.push();
            subject.setState(btn.getCurrent());
        }
    }
}
