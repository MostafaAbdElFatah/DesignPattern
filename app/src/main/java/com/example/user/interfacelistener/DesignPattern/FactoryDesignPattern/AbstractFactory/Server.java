package com.example.user.interfacelistener.DesignPattern.FactoryDesignPattern.AbstractFactory;



public class Server extends AbstractComputerFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(){

    }

    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    public void set(String ram, String hdd, String cpu){
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