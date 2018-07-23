package com.amaljoyc.patterns.structural.adapter;

import java.util.Map;

/**
 * Created by amaljoyc on 23.07.18.
 */
public class Adapter {

    public void printMe(Map<String, String> map) {
        Server server = new Server();
        server.printMe(map.toString());
    }
}
