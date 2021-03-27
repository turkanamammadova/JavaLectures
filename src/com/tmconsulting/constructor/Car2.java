package com.tmconsulting.constructor;

public class Car2 {
    private String make;
    //define more vars after default const try
    int speed;
    int gear;

    //default no argument constructor, it always exist
    public Car2(){
        //try default variables
        this.gear = 0;
        this.speed = 0;
        System.out.println("Executing constructors without arguments");
    }
    //multiple constructors with diff arguments
    //intitializing instance variable values
    public Car2(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}
