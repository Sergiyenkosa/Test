package time.message;

import java.util.Calendar;
import java.util.Locale;

public interface TimeMessage {

    String getLocaleDayPartHelloMessage(Locale locale, Calendar calendar);
}