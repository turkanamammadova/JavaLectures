package com.tmconsulting;

public class Functions2 {
    //functions and methos same thing

    //main method -  starting point of execution
    public static void main(String[] args) {
        Functions2 obj = new Functions2();
        //one object will be created, obj is the reference variable, referring to this object
        //after creating the object, copy of all non static methods will be given to this object
        obj.test(); //called test method
        //the other methods are not executed because we are not calling them
        obj.test2();
        int j = obj.test2();
        System.out.println(j);

        obj.qa();
        String s = obj.qa();
        System.out.println(s);

       int div =  obj.division(30,10);
        System.out.println(div);
    }

    //non static methods
    //no input no output
    public void test(){ //test is method name
        System.out.println("test method");
    }

    //void means does not return any value, remove it
    //return type of method is int
    public int test2(){
        System.out.println("test2 method");
        int a =  10;
        int b = 20;
        int c = a+b;

        return c; //will give error if its void method
    }

    public String qa(){ //no input some output
        System.out.println("qa method");
        String s = "Selenium";
        return s;
    }

    //x, y --> input arguments/parameters
    public int division(int x, int y){
        System.out.println("Division method");
        int d = x/y;
        return d;
    }
}
