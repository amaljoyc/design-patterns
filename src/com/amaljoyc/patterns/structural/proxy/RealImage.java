package com.amaljoyc.patterns.structural.proxy;

/**
 * Created by amaljoyc on 23.07.18.
 */
public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("displaying: " + filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("loading from disk, file: " + filename);
    }
}
