package com.amaljoyc.patterns.behavioural.state;

/**
 * Created by achemparathy on 01.08.18.
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);

        State stopState = new StopState();
        stopState.doAction(context);
    }
}
