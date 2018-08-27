package com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example2;

public abstract class Decorator implements Widget {
    private Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    // 5. Delegation
    public void draw() {
        widget.draw();
    }
}
