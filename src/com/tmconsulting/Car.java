package com.tmconsulting;

public class Car {
    int model;
    int wheel;

    public static void main(String[] args) {
        //object - class property
        /*Car class has 3 object lets say,
        obj1, obj2, obj3..
         */

        Car obj1 =  new Car(); //it represents 1 object, new Car() is an object of Car class
        //reference variable is obj1, my body is an object, Turkana refering to this object
        Car obj2 = new Car();
        Car obj3 =  new Car();
        //copy of 2 variables on top, will be given to objects we created

        obj1.model = 2015;
        obj1.wheel = 4;

        obj2.model = 2019;
        obj2.wheel = 4;

        obj3.model = 2020;
        obj3.wheel = 4;

        System.out.println(obj1.model);
        System.out.println(obj1.wheel);

        System.out.println(obj2.model);
        System.out.println(obj2.wheel);

        //we have 1 Car class in Java memory. 3 java objects are created.
        //new keyword is used to create object
        //obj1..3 are object refernce variables

        System.out.println("after switching to references");
        obj1=obj2;
        obj2=obj3;
        obj3=obj1;

        obj1.model = 10;
        System.out.println(obj1.model); //10
        obj3.model = 20;
        System.out.println(obj1.model); //20 it replaced previous value



    }
}