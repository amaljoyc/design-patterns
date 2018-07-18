package com.amaljoyc.patterns.creational.factorymethod;

/**
 * Created by amaljoyc on 18.07.18.
 */
public class FirstService extends ParentService {

    @Override
    public MyObject createMyObject() {
        return new FirstObject();
    }
}
