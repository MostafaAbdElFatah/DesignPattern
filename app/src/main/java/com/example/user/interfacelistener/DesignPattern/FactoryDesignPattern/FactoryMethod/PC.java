package com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.FactoryMethod;

import com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.FactoryMethod.Computer;

/**
 * Created by FCI on 2018-07-14.
 */

public class PC extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public PC(){

    }

    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public String getRAM() {
        return this.getRAM();
    }

    @Override
    public String getCPU() {
        return this.getCPU();
    }

    @Override
    public String getHDD() {
        return this.getHDD();
    }
}
