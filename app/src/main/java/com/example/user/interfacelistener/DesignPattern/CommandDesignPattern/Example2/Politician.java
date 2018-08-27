package com.example.user.interfacelistener.DesignPattern.CommandDesignPattern.Example2;

public class Politician implements Command {
    public void execute() {
        System.out.println("take money from the rich, take votes from the poor");
    }
}