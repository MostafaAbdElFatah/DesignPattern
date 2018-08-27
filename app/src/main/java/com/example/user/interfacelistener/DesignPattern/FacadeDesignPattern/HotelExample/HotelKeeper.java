package com.example.user.interfacelistener.DesignPattern.FacadeDesignPattern.HotelExample;

public class HotelKeeper {

    public String getVegMenu()
    {
        VegRestaurant v = new VegRestaurant();
        String vegMenu = v.getMenus();
        return vegMenu;
    }

    public String getNonVegMenu()
    {
        NonVegRestaurant v = new NonVegRestaurant();
        String NonvegMenu = v.getMenus();
        return NonvegMenu;
    }

    public String getVegNonMenu()
    {
        VegNonBothRestaurant v = new VegNonBothRestaurant();
        String bothMenu = v.getMenus();
        return bothMenu;
    }

}
