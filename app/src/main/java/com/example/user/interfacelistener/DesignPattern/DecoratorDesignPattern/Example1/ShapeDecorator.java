package com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example1;

public class ShapeDecorator  implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}