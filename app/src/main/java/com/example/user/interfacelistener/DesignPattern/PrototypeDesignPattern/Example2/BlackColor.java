package com.example.user.interfacelistener.DesignPattern.PrototypeDesignPattern.Example2;

public class BlackColor extends Color{

    public BlackColor(){
        this.colorName = "Black";
    }

    @Override
    public void addColor() {
        System.out.println("Black Color added");
    }
}