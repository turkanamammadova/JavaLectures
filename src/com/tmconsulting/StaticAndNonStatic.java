package com.tmconsulting;

public class StaticAndNonStatic {
    String name = "Turkana"; //non static global variable
    static int age = 35; //static global variable

    public void sendMail(){
        System.out.println("send mail method");
    }

    public static void sum(){
        System.out.println("Sum method");
    }

    public static void main(String[] args) {
        //static method and variables.. how to call
        //1. direct calling
        sum();
        //2. calling by classname
        StaticAndNonStatic.sum();

        //variables
        System.out.println(age);
        System.out.println(StaticAndNonStatic.age);

        //non static variable and method -- how to call
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.sendMail();
        System.out.println(obj.name);

        //can I access static methods by using object reference
        //obj.sum(); //yes we can access but this is not right way
        //directly call or class name

        //scope of global vars will be available accross all the functionsw3ww

    }
}
