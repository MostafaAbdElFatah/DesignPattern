package com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example1;

public class RedShape extends ShapeDecorator {

    public RedShape(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}