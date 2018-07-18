package com.amaljoyc.patterns.creational.factorymethod;

/**
 * Created by amaljoyc on 18.07.18.
 */
public abstract class ParentService {

    public void print() {
        MyObject myObject = createMyObject();
        myObject.hello();
    }

    public abstract MyObject createMyObject();
}
