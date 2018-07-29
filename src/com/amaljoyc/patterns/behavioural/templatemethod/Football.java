package com.amaljoyc.patterns.behavioural.templatemethod;

/**
 * Created by achemparathy on 29.07.18.
 */
public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("Initilize football");
    }

    @Override
    void start() {
        System.out.println("start football");
    }

    @Override
    void end() {
        System.out.println("end football");
    }
}
