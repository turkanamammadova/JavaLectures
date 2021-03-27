package com.tmconsulting.encapsulation;

public class ClassDemo {
    public static void main(String[] args) {
        Car bmw = new Car(); //create and initialize the object
        //try bmw.color -- not working cuz private
        //WHAT TO DO?
        //create setter getter
        bmw.setMake("BMW");
        System.out.println(bmw.getMake());

        bmw.setModel("c300");
        System.out.println(bmw.getModel());

        //this is called Encapsulation in java
        //create private variables and reach them by using getters and setters

        bmw.setYear(1800);
        System.out.println(bmw.getYear());

        //when we dont set we will get default value String null




    }
}
