package time.message;

import org.junit.Before;
import org.junit.Test;
import time.message.TimeMessage;
import time.message.impl.TimeMessageResourceImpl;

import java.util.GregorianCalendar;
import java.util.Locale;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TimeMessageTest {

    private TimeMessage timeMessage;
    private Locale localeXX;
    private Locale localeRu;
    private GregorianCalendar calendar;

    @Before
    public void initObjects() {
        timeMessage = new TimeMessageResourceImpl();
        localeXX = new Locale("en");
        localeRu = new Locale("ru");
        calendar = new GregorianCalendar();
    }

    private void testCalendar(int hour, int minute, Locale locale, String expectedMessage) {
        calendar.set(0, 0, 0, hour, minute);
        assertThat(timeMessage.getLocaleDayPartHelloMessage(locale, calendar), is(expectedMessage));
    }

    @Test
    public void testMessageFinishNightRu(){
        testCalendar(5, 59, localeRu, "Доброй ночи, Мир!");
    }

    @Test
    public void testMessageStartMorningEn(){
        testCalendar(6, 0, localeXX, "Good morning, World!");
    }

    @Test
    public void testMessageFinishMorningRu(){
        testCalendar(8, 59, localeRu, "Доброе утро, Мир!");
    }

    @Test
    public void testMessageStartDayEn(){
        testCalendar(9, 0, localeXX, "Good day, World!");
    }

    @Test
    public void testMessageFinishDayRu(){
        testCalendar(18, 59, localeRu, "Добрый день, Мир!");
    }

    @Test
    public void testMessageStartEveningEn(){
        testCalendar(19, 0, localeXX, "Good evening, World!");
    }

    @Test
    public void testMessageFinishEveningRu(){
        testCalendar(22, 59, localeRu, "Добрый вечер, Мир!");
    }

    @Test
    public void testMessageStartNightEn(){
        testCalendar(23, 0, localeXX, "Good night, World!");
    }
}
