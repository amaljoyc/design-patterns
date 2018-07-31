package com.amaljoyc.patterns.behavioural.state;

/**
 * Created by achemparathy on 01.08.18.
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("stop state");
        context.setState(this);
    }
}
