package com.tmconsulting.exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            int i = 7;
            int j = 2;
            int k = i/j; //critical statement
            System.out.println("output is " + k);
            //if not divide by zero not critical
            //then it will print normal statement
            //try changing divide by zero, it will catch exception and directly jump onto catch
        }
        catch (ArithmeticException e) {

            System.out.println("Error ");
        }


        System.out.println("Bye"); //normal statement
    }
}
