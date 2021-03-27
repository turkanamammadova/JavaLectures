package com.tmconsulting.constructor;

import com.tmconsulting.constructor.Car2;

public class ConstructorDemo {
    //it gets called on its own when object is created
    //in methods we have to make explicit calls.
    //constructors are being called on their own
    //names should be same with class
    //default consturctor is hidden no argument consturctor
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.setMake("BMW");
        System.out.println(c1.getMake());
        //default constructor didnt change anything
        System.out.println(c1.gear);
        System.out.println(c1.speed);

        System.out.println("*********");

        Car2 c2 = new Car2(10,1);
        System.out.println(c2.gear);
        System.out.println(c2.speed);
        //you can set default values for your instance variable
        //you can have different default values for different objects




    }
}
