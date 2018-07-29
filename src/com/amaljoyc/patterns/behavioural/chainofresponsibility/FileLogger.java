package com.amaljoyc.patterns.behavioural.chainofresponsibility;

/**
 * Created by achemparathy on 29.07.18.
 */
public class FileLogger extends Logger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("FILE: " + message);
    }
}
