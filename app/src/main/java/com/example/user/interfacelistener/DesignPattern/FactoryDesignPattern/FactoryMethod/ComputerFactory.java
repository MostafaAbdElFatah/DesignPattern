package com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.FactoryMethod;

import com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.ComputerType;
import com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.FactoryMethod.Computer;
import com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.FactoryMethod.PC;
import com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.FactoryMethod.Server;

/**
 * Created by FCI on 2018-07-14.
 */

public class ComputerFactory {

    // if use SingleTon with Factory called abstract factory
    // We can keep Factory class Singleton or we can keep
    // the method that returns the subclass as static
    // if use method this is called factory method
    // Notice that based on the input parameter
    // different subclass is created and returned. getComputer is the factory method.

    public static Computer getComputer(ComputerType type , String ram , String cpu , String hdd){
        if (type == ComputerType.PC)
            return  new PC(ram, hdd, cpu);
        else if (type == ComputerType.SERVER)
            return new Server(ram, hdd, cpu);
        else
            return null;
    }

}
