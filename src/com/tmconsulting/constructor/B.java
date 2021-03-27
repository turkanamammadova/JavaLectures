package com.tmconsulting.constructor;

public class B extends A {
    public B(){
        //if I want to call parent class constructor use super keyword
        //super mins parameterized constructor will be called
        super(10); //disable and see
        //super keyoword should be in child class
        //super(19, 2);
        //you can only have 1 super keyword
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        B obj = new B();

    }


}
