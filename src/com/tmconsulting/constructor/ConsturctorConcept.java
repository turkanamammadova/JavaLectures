package com.tmconsulting.constructor;

public class ConsturctorConcept {
    /*
    it looks like method but its not method
    name should be class name
    1. default constructor zero parameter
    2.
     */
    public ConsturctorConcept(){
        System.out.println("Default constructor");
    }

    public ConsturctorConcept(int i){
        System.out.println("Single paramemeter constructor");
        System.out.println("the value of i " + i);
    }

    public ConsturctorConcept(int i, int j){
        System.out.println("two params constructor");
        System.out.println("the value of i "+ i);
        System.out.println("the value of j " +j);
    }

    public static void main(String[] args) {
        //constructor will be called as soon as you create object of the class
        ConsturctorConcept obj = new ConsturctorConcept();
        //run this it will run default constructor first

        //if you wanna call second constructor create another object
        ConsturctorConcept obj1 = new ConsturctorConcept(10);
        //it will accept just no argument object because default

        //if you want to call another constructor create object
        ConsturctorConcept obj2 =  new ConsturctorConcept(3, 5);
        //there is no hidden 1 or 2 parameters constructors


    }
}
