package com.test.task.utils;


import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;


public class TimeUtils {

    private static LogUtils logUtils;

    public static void main(String[] args) {

        logUtils = new LogUtils();
        final TimeUtils timeUtils = new TimeUtils();


        final String locale = System.getProperty("user.language");

        System.out.println(timeUtils.showGreetingMessage(timeUtils.getCurrentHour(), locale));
    }



    public String showGreetingMessage(int currentHour, String systemLocale) {


        final ResourceBundle resourceBundle = ResourceBundle.getBundle("locale/message", new Locale(systemLocale), new UTF8Control());
        String greetingMessage = "";

        if (currentHour >= HourConstant.SIX_HOURS && currentHour < HourConstant.NINE_HOURS)
            greetingMessage = resourceBundle.getString("good.morning");

        if (currentHour >= HourConstant.NINE_HOURS && currentHour < HourConstant.NINETEEN_HOURS)
            greetingMessage = resourceBundle.getString("good.day");

        if (currentHour >= HourConstant.NINETEEN_HOURS && currentHour < HourConstant.TWENTY_THREE_HOURS)
            greetingMessage = resourceBundle.getString("good.evening");

        if ((currentHour >= HourConstant.TWENTY_THREE_HOURS && currentHour < HourConstant.TWENTY_FOUR_HOURS) || (currentHour < HourConstant.SIX_HOURS && currentHour >= HourConstant.ZERO))
            greetingMessage = resourceBundle.getString("good.night");

        logUtils.log(greetingMessage);

        return greetingMessage;
    }


    private int getCurrentHour() {

        final Calendar calendar = Calendar.getInstance();

        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public interface HourConstant {

        int SIX_HOURS = 6;
        int NINE_HOURS = 9;
        int NINETEEN_HOURS = 19;
        int TWENTY_THREE_HOURS = 23;
        int TWENTY_FOUR_HOURS = 24;
        int ZERO = 0;
    }


}
