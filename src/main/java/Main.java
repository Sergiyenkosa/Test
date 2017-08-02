import org.apache.log4j.Logger;
import time.message.TimeMessage;
import time.message.impl.TimeMessageResourceImpl;

import java.util.Calendar;
import java.util.Locale;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        log.info("run method mine");

        TimeMessage timeMessage = new TimeMessageResourceImpl();

        System.out.println(timeMessage.getLocaleDayPartHelloMessage(Locale.getDefault(), Calendar.getInstance()));

        log.info("dun method mine");
    }
}