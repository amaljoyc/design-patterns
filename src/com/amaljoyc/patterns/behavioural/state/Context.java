package com.amaljoyc.patterns.behavioural.state;

/**
 * Created by achemparathy on 01.08.18.
 */
public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
