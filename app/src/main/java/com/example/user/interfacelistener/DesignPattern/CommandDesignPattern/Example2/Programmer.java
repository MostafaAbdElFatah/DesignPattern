package com.example.user.interfacelistener.DesignPattern.CommandDesignPattern.Example2;

class Programmer implements Command {
    public void execute() {
        System.out.println("sell the bugs, charge extra for the fixes");
    }
}