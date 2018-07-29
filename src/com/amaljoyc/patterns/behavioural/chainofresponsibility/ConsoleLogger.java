package com.amaljoyc.patterns.behavioural.chainofresponsibility;

/**
 * Created by achemparathy on 29.07.18.
 */
public class ConsoleLogger extends Logger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("CONSOLE: " + message);
    }
}
