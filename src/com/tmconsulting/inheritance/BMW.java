package com.tmconsulting.inheritance;

public class BMW extends Car {
    //if you want to make relationship between car and bmw use extends keyword
    //extends keyword

    //Method overriding
    //when same method is present in parent class as well as in child class, with same name and same number of arguments
    //--its called Method Overriding
    public void start(){  //overridden method
        System.out.println("BMW--Start");
    }

    public void theftSafety(){
        System.out.println("BMW - safety");
    }
}
