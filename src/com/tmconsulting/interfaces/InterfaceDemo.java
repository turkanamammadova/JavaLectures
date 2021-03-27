package com.tmconsulting.interfaces;

import com.tmconsulting.abstraction.BMWCarsInterface;
import com.tmconsulting.abstraction.CarsInterface;

public class InterfaceDemo implements CarsInterface, BMWCarsInterface {

    //if you impletement interfaces you have to implement all methodstw
    @Override
    public void engineStart(String engineType, boolean isKeyLess) {
        System.out.println("This is the implementation");
    }

    @Override
    public void headsUpNavigation() {
        System.out.println("This is the headsup navigation");
    }
}
