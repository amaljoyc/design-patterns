package com.amaljoyc.patterns.structural.proxy;

/**
 * Created by amaljoyc on 23.07.18.
 */
public class ProxyImage implements Image {

    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }

}
