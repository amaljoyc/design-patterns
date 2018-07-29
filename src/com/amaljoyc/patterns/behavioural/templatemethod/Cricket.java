package com.amaljoyc.patterns.behavioural.templatemethod;

/**
 * Created by achemparathy on 29.07.18.
 */
public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Initilize cricket");
    }

    @Override
    void start() {
        System.out.println("start cricket");
    }

    @Override
    void end() {
        System.out.println("end cricket");
    }
}
