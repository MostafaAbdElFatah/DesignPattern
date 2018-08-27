package com.example.user.interfacelistener.DesignPattern.PrototypeDesignPattern.Example1;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, PrototypeShape> shapeMap  = new Hashtable<String, PrototypeShape>();

    public static PrototypeShape getShape(String shapeId) {
        PrototypeShape cachedShape = shapeMap.get(shapeId);
        return (PrototypeShape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
