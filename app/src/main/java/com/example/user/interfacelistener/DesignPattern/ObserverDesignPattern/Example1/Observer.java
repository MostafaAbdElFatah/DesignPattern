package com.example.user.interfacelistener.DesignPattern.ObserverDesignPattern.Example1;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}