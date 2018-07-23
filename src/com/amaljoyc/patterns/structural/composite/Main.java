package com.amaljoyc.patterns.structural.composite;

import java.util.Arrays;

/**
 * Created by amaljoyc on 23.07.18.
 */
public class Main {

    public static void main(String[] args) {
        Employee ceo = new Employee("Dave", "CEO");
        Employee headTech = new Employee("John", "Tech Head");
        Employee headSales= new Employee("Bill", "Sales Head");
        ceo.setSubordinates(Arrays.asList(headTech, headSales));

        Employee dev1 = new Employee("Sam", "Developer");
        Employee dev2 = new Employee("Jane", "Developer");
        headTech.setSubordinates(Arrays.asList(dev1, dev2));

        System.out.println(ceo);
    }
}
