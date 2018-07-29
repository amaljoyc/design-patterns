package com.amaljoyc.patterns.behavioural.chainofresponsibility;

/**
 * Created by achemparathy on 29.07.18.
 */
public class ErrorLogger extends Logger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
