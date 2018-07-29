package com.amaljoyc.patterns.behavioural.chainofresponsibility;

/**
 * Created by achemparathy on 29.07.18.
 */
public abstract class Logger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    private Logger nextLogger;

    protected void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    protected void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);
}
