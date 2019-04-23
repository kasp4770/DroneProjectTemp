import logger.LoggerTest;
import observer.*;
import state.Button;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Start {

    private final static Logger logger = Logger.getLogger(LoggerTest.class.getName());

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader( System.in );
        Button btn = new Button();

        //observer objects
        Subject subject = new Subject();
        SenderObserver senderObserver = new SenderObserver(subject);
        RecieverObserver recieverObserver = new RecieverObserver(subject);


        LoggerTest.init();
        logger.log(Level.INFO, "main started");


        while (true) {
            System.out.print("Press 'Enter' to continue to the next state of the drone");
            is.read();
            btn.push();
            subject.setState(btn.getCurrent());
        }
    }
}
