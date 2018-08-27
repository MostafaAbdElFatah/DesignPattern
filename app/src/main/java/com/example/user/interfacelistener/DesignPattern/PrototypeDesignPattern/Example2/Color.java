package com.example.user.interfacelistener.DesignPattern.PrototypeDesignPattern.Example2;

public abstract class Color implements Cloneable{

    protected String colorName;

    public abstract void addColor();

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

}
