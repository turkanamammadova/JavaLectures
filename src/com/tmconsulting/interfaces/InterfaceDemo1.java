package com.tmconsulting.interfaces;

import com.tmconsulting.abstraction.CarsInterface;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        CarsInterface myInterface = new InterfaceDemo();
        myInterface.engineStart("6Cycl", true);
    }
}
