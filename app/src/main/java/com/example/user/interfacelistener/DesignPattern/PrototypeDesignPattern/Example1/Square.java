package com.example.user.interfacelistener.DesignPattern.PrototypeDesignPattern.Example1;

public class Square extends PrototypeShape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}