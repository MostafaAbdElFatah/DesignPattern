package com.example.user.interfacelistener.DesignPattern.FacadeDesignPattern.HotelExample;

public class NonVegRestaurant implements Hotel {
    @Override
    public String getMenus() {
        return "NonVegRestaurant Menu";
    }
}
