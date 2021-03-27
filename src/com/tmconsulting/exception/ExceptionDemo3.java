package com.tmconsulting.exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {
            int i = 7;
            int j = 2;
            int k = i / j;
            System.out.println("output is " + k);
        } catch (ArithmeticException e) {

            System.out.println("Error ");

        } finally { //its a block will be executed whether you are getting exception or not getting exception

            System.out.println("Bye");
        }
        //both situations it will be printed
    }
}