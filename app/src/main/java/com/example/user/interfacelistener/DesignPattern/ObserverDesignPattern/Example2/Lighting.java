package com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example2;

public class Lighting implements AlarmListener {
    public void alarm() {
        System.out.println("lights up");
    }
}