package com.tmconsulting.constructor;

public class A {
    public A(){
        System.out.println("parent class constructor");
    }

    public A(int i){
        System.out.println("parent class constructor with value of:" + i);
    }

    //one by one
    public A(int i, int j){
        System.out.println("parent class cons value of :" + i + j);
    }
}
