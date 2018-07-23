package com.amaljoyc.patterns.structural.decorator;

/**
 * Created by amaljoyc on 24.07.18.
 */
public class BasicWebPage implements WebPage {

    @Override
    public void display() {
        System.out.println("BasicWebPage");
    }
}
