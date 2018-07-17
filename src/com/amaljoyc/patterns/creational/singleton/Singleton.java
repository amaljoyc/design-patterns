package com.amaljoyc.patterns.creational.singleton;

/**
 * Created by amaljoyc on 17.07.18.
 */
public final class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
