package time.message.impl;

import org.apache.log4j.Logger;
import time.message.TimeMessage;

import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class TimeMessageResourceImpl implements TimeMessage {

    private static final Logger log = Logger.getLogger(TimeMessageResourceImpl.class);

    @Override
    public String getLocaleDayPartHelloMessage(Locale locale, Calendar calendar) {
        log.info("Run method getLocaleDayPartHelloMessage");

        ResourceBundle bundle = ResourceBundle.getBundle("message", locale);
        Integer hour24 = calendar.get(Calendar.HOUR_OF_DAY);
        String message;

        log.info("method getLocaleDayPartHelloMessage params: Locale locale = " +
                locale.getLanguage() + "; Calendar calendar = " + calendar.getTime());

        if (hour24 < 6 || hour24 == 23) {
            message = bundle.getString("NIGHT");
        } else if (hour24 < 9) {
            message = bundle.getString("MORNING");
        } else if (hour24 < 19) {
            message = bundle.getString("DAY");
        } else {
            message = bundle.getString("EVENING");
        }

        log.info("Dun method getLocaleDayPartHelloMessage, return message: " + message);

        return message;
    }
}