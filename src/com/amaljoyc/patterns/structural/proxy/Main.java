package com.amaljoyc.patterns.structural.proxy;

/**
 * Created by amaljoyc on 23.07.18.
 */
public class Main {

    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("cat.png");
        proxyImage.display();
        proxyImage.display();
        proxyImage.display();
    }
}
