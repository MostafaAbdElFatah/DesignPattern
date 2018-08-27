package com.example.user.interfacelistener.DesignPattern.PrototypeDesignPattern.Example1;

public class Rectangle extends PrototypeShape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
