package com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example2;

public class BorderWidget extends Decorator {
    public BorderWidget(Widget widget) {
        super(widget);
    }
    public void draw() {
        // 7. Delegate to base class and add extra stuff
        super.draw();
        System.out.println("  BorderDecorator");
    }
}
