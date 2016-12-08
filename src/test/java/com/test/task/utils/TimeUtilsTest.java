package com.test.task.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by alex on 12/7/16.
 */
public class TimeUtilsTest {

    private TimeUtils timeUtils;

    @Before
    public void initData() {

        timeUtils = new TimeUtils();

    }

    @Test
    public void showGreetingMessageTest() {



        /*for english locale*/
        String lang = "en";

          /*test for morning*/
        int hour = 6;

        assertTrue(timeUtils.showGreetingMessage(hour, lang).equals("Good morning, World!"));

           /*test for day*/
        hour = 11;

        assertTrue(timeUtils.showGreetingMessage(hour, lang).equals("Good day, World!"));

           /*test for evening*/
        hour = 21;

        assertTrue(timeUtils.showGreetingMessage(hour, lang).equals("Good evening, World!"));

           /*test for night*/
        hour = 23;

        assertTrue(timeUtils.showGreetingMessage(hour, lang).equals("Good night, World!"));

        /*for ru locale*/
        lang = "ru";

         /*test for morning*/
        hour = 6;

        assertTrue(timeUtils.showGreetingMessage(hour, lang).equals("Доброе утро, Мир!"));

           /*test for day*/
        hour = 11;

        assertTrue(timeUtils.showGreetingMessage(hour, lang).equals("Добрый день, Мир!"));

           /*test for evening*/
        hour = 21;

        assertTrue(timeUtils.showGreetingMessage(hour, lang).equals("Добрый вечер, Мир!"));

           /*test for night*/
        hour = 23;

        assertTrue(timeUtils.showGreetingMessage(hour, lang).equals("Доброй ночи, Мир!"));
    }

}