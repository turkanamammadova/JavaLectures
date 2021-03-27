package com.tmconsulting;

public class LocalVsGlobalVariables {

    //Global variables or class variables
    String name = "Turkana";
    int age = 35;


    public static void main(String[] args) {
        int i = 10; //local variable of main method
        System.out.println(i); //we dont need an object to use variable

        //if you want to print value of name and age
       /* System.out.println(name); this will give error because you need to create
        object of the class */

        LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
        System.out.println(obj.name);
        System.out.println(obj.age);

        //global vars access through object

    }

    public void sum(){
        int i = 15; //local var for sum method
        int j = 20;
    }


}
