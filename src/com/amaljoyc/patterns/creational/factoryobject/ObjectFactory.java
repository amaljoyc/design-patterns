package com.amaljoyc.patterns.creational.factoryobject;

/**
 * Created by amaljoyc on 18.07.18.
 */
public class ObjectFactory {

    public MyObject createMyObject(String type) {
        if (type.equals("one")) {
            return new MyFirstObject();
        } else if (type.equals("two")) {
            return new MySecondObject();
        }

        return new MyObject();
    }
}
