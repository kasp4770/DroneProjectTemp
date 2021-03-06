package logger;

import java.io.IOException;
import java.util.logging.*;

public class LoggerTest {

    private final static Logger logger = Logger.getLogger(LoggerTest.class.getName());
    private static FileHandler fh = null;

    public static void init(){
        try {
            fh=new FileHandler("loggerExample.log", false);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
        Logger l = Logger.getLogger("");
        fh.setFormatter(new SimpleFormatter());
        l.addHandler(fh);
        l.setLevel(Level.CONFIG);
    }

}
