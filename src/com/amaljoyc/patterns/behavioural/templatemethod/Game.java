package com.amaljoyc.patterns.behavioural.templatemethod;

/**
 * Created by achemparathy on 29.07.18.
 */
public abstract class Game {

    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play() {
        initialize();
        start();
        end();
    }
}
