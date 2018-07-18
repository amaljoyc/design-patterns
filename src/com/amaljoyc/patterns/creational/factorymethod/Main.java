package com.amaljoyc.patterns.creational.factorymethod;

/**
 * Created by amaljoyc on 18.07.18.
 */
public class Main {

    public static void main(String[] args) {
        FirstService firstService = new FirstService();
        firstService.print();

        SecondService secondService = new SecondService();
        secondService.print();
    }
}
