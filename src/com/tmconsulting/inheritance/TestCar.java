package com.tmconsulting.inheritance;

public class TestCar {
    public static void main(String[] args) {

        //create object of BMW class

        BMW b = new BMW();
        //I can access start method in BMW class
        //whenever they have same name methods, preference will be given to child class
        //you have already same method, then use your own method
        b.start();
        b.stop();
        b.refuel();
        b.theftSafety();

        //after creating vehicle class
        b.engine();

        Car c = new Car();
        c.start();
        c.refuel();
        c.stop();
        //c.theft method cant access
        //parents cant inherit some properties from child

        Car c1 = new BMW(); //child class object can be referred by class reference variable
        //its called dynamic polymorphism - run time polymorphysm
        c1.start();
        c1.refuel();
        c1.stop();
        //c1.theftSafety  cant- bmw says: you can refer my object but you can not take my properties




    }
}
