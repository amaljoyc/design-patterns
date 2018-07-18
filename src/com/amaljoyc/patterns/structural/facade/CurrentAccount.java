package com.amaljoyc.patterns.structural.facade;

/**
 * Created by amaljoyc on 19.07.18.
 */
public class CurrentAccount implements Account {

    @Override
    public void create() {
        System.out.println("created current account");
    }
}
