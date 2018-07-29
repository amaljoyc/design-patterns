package com.amaljoyc.patterns.behavioural.chainofresponsibility;

/**
 * Created by achemparathy on 29.07.18.
 */
public class Main {

    private static Logger getLoggerChain() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        Logger logger = getLoggerChain();

        logger.logMessage(Logger.INFO, "This is an info");
        logger.logMessage(Logger.DEBUG, "This is a debug");
        logger.logMessage(Logger.ERROR, "This is an error!");
    }
}
