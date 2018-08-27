package com.example.user.interfacelistener.DesignPattern.StrategyDesignPattern;

public class AddOpertions implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
