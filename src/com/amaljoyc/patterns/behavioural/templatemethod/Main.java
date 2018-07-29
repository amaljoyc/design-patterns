package com.amaljoyc.patterns.behavioural.templatemethod;

/**
 * Created by achemparathy on 29.07.18.
 */
public class Main {

    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();

        Game football = new Football();
        football.play();
    }
}
