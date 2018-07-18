package com.amaljoyc.patterns.creational.factoryobject;

/**
 * Created by amaljoyc on 18.07.18.
 */
public class Service {

    private ObjectFactory factory;

    public Service(ObjectFactory factory) {
        this.factory = factory;
    }

    public MyObject getMyObject(String type) {
        MyObject myObject = factory.createMyObject(type);
        myObject.doX();
        myObject.doY();

        return myObject;
    }
}
