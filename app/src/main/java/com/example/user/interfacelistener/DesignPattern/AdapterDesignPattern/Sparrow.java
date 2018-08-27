package com.example.user.interfacelistener.DesignPattern.AdapterDesignPattern;

public class Sparrow implements Bird {
    // a concrete implementation of bird
    public void fly() {
        System.out.println("Flying");
    }
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
