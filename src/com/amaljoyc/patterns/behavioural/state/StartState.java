package com.amaljoyc.patterns.behavioural.state;

/**
 * Created by achemparathy on 01.08.18.
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("start state");
        context.setState(this);
    }
}
