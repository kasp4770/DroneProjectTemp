package observer;

import logger.LoggerTest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RecieverObserver extends Observer {

    private final static Logger logger = Logger.getLogger(LoggerTest.class.getName());

    public RecieverObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){

        System.out.println("*RECIEVER* state: " + subject.getState());
        logger.log(Level.INFO, subject.getState());
    }
}
