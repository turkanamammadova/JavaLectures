package com.tmconsulting.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        //first type int i=9/0;

        //how do you handle exception?
        //by using try catch block
        //try is a block where we have to put all our critical statements
        try {
            int i = 9/0; //critical statement
        } //try block will follow the exception
        catch (Exception e) {
            //catch block will catch the exception
            System.out.println("Error ");
        }


        System.out.println("Bye"); //normal statement
    }
}
