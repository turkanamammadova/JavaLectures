package com.tmconsulting.inheritance;

public class Car extends Vehicle {
    //extend Vehicle later

    public void start(){
        System.out.println("Car started");
    }

    public void stop(){
        System.out.println("Car stopped");
    }

    public void refuel(){
        System.out.println("Car refuel");
    }
}
