package com.example.user.interfacelistener.DesignPattern.CompositeDesignPattern;

/**
 * Created by FCI on 2018-07-16.
 */

public interface Employee {
    public void add(Employee employee);

    public Employee getChild(int i) ;
    public String getName() ;
    public double getSalary();
    public void print() ;
    public void remove(Employee employee) ;

}
