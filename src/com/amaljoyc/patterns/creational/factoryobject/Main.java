package com.amaljoyc.patterns.creational.factoryobject;

/**
 * Created by amaljoyc on 18.07.18.
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service(new ObjectFactory());

        MyFirstObject myFirstObject = (MyFirstObject) service.getMyObject("one");
        myFirstObject.printFirst();

        MySecondObject mySecondObject = (MySecondObject) service.getMyObject("two");
        mySecondObject.printSecond();

    }
}
