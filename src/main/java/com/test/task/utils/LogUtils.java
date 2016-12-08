package com.test.task.utils;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by alex on 08.12.16.
 */
public class LogUtils {

    private final Logger logger = Logger.getLogger(LogUtils.class.getName());


    public LogUtils() {
        initLoggerFileHandler();
    }

    private void initLoggerFileHandler() {
        FileHandler fh;
        final String logPath = "/home/alex/MyLogFile.log";

        try {

            fh = new FileHandler(logPath);

            logger.addHandler(fh);

            final SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String string) {

        logger.info(string);
    }


}
