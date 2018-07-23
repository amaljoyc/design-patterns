package com.amaljoyc.patterns.structural.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amaljoyc on 23.07.18.
 */
public class Client {

    public void doPrint() {
        Adapter adapter = new Adapter();
        Map<String, String> map = new HashMap<>();
        map.put("key1", "val1");
        map.put("key2", "val2");
        adapter.printMe(map);
    }
}
