package observer;

import logger.LoggerTest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SenderObserver extends Observer{

    private final static Logger logger = Logger.getLogger(LoggerTest.class.getName());

    public SenderObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){

        System.out.println("*SENDER*   state: " + subject.getState());
        //logger.log(Level.INFO, subject.getState());
    }
}
