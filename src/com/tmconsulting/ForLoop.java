package com.tmconsulting;

public class ForLoop {

    public static void main(String[] args) {

        //2. for loop (for is a keyword in java)
        for( int i = 1; i<=10; i++) { //i++ means i=i+1
            //initialization, conditional, incremental
            System.out.println(i);
        }
        //create a loop till 100
        //challenge: what if I want to print 10 to 1?
        //10 9 8 7 6 5 4 3 2 1
        for (int j = 10; j >= 1; j--){ //j-- means j = j -1
            System.out.println(j);
        }
    }
}
