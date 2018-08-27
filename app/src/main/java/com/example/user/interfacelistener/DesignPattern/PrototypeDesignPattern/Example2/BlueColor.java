package com.example.user.interfacelistener.DesignPattern.PrototypeDesignPattern.Example2;

public class BlueColor extends Color {

    public BlueColor(){
        this.colorName = "Blue";
    }

    @Override
    public void addColor() {
        System.out.println("Blue Color added");
    }

}

