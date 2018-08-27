package com.example.user.interfacelistener.DesignPattern.DecoratorDesignPattern.Example2;

public class ScrollWidget extends Decorator {
    public ScrollWidget(Widget widget){
        super(widget);
    }

    public void draw() {
        super.draw(); // 7. Delegate to base class and add extra stuff
        System.out.println("  ScrollDecorator");
    }

}
