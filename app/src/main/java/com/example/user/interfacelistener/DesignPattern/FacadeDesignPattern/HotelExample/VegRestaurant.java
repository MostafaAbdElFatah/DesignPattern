package com.example.user.interfacelistener.DesignPattern.FacadeDesignPattern.HotelExample;

public class VegRestaurant implements Hotel {
    @Override
    public String getMenus() {
        return "VegRestaurant Menu";
    }
}
