package com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example2;


public class Gates implements AlarmListener {
    public void alarm() {
        System.out.println("gates close");
    }
}

