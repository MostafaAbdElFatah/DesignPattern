package com.example.user.interfacelistener.DesignPattern.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by FCI on 2018-07-16.
 */

public class Manager implements Employee {
    private String name;
    private double salary;
    private List<Employee> employees = new ArrayList<Employee>();
    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public Employee getChild(int i) {
        return this.employees.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("-------------");

        Iterator<Employee> employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.print();
        }

    }

    @Override
    public void remove(Employee employee) {
        this.employees.remove(employee);
    }
}
