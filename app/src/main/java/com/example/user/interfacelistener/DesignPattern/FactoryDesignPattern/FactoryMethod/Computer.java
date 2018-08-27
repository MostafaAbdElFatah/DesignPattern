package com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.FactoryMethod;

/**
 * Created by FCI on 2018-07-14.
 */

public abstract class Computer {

    public abstract String getRAM();
    public abstract String getCPU();
    public abstract String getHDD();

    @Override
    public String toString() {
        return "RAM :" + this.getRAM()+",CPU :" + this.getCPU()+",HDD :" + this.getHDD();
    }
}
