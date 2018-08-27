package com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.AbstractFactory;

import com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.ComputerType;
/**
 * Created by FCI on 2018-07-14.
 */

public abstract class AbstractComputerFactory {

    // if use SingleTon with Factory called abstract factory
    // We can keep Factory class Singleton or we can keep
    // the method that returns the subclass as static
    // if use method this is called factory method
    // Notice that based on the input parameter
    // different subclass is created and returned. getComputer is the factory method.
    private static PC pc;
    private static Server server;

    public abstract String getRAM();
    public abstract String getCPU();
    public abstract String getHDD();

    @Override
    public String toString() {
        return "RAM :" + this.getRAM()+",CPU :" + this.getCPU()+",HDD :" + this.getHDD();
    }

    public  static AbstractComputerFactory getFactory(ComputerType type , String ram , String cpu , String hdd){

        AbstractComputerFactory factory = null;

        if (type == ComputerType.PC) {
            pc.set(ram,cpu,hdd);
            factory = pc;
            return factory;
        }
        else if (type == ComputerType.SERVER) {
            server.set(ram, cpu, hdd);
            factory = server;
            return factory;
        }else
            return factory;
    }

}
