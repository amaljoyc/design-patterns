package com.amaljoyc.patterns.structural.composite;

import java.util.List;

/**
 * Created by amaljoyc on 23.07.18.
 */
public class Employee {

    private String name;
    private String position;
    private List<Employee> subordinates;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", subordinates=" + subordinates +
                '}';
    }
}
