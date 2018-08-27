package com.example.user.interfacelistener.DesignPattern.PrototypeDesignPattern.Example1;

public class Circle extends PrototypeShape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}