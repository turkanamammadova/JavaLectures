package com.tmconsulting;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String x[][] = new String[3][4]; //3 rows 5 columns
//        System.out.println(x.length);
        //3 total number of rows
//        System.out.println(x[0].length); //total no of columns

        x[0][0] = "A";
        x[0][1] = "B"; //first row second column
        x[0][2] = "C"; //first row third column
        x[0][3] = "D";

        x[1][0] = "Turkana"; //second row first column
        x[1][1] = "Mammadova";
        x[1][2] = "Aze";
        x[1][3] = "Nax";

        x[2][0] = "A1";
        x[2][1] = "B1"; //third row row second column
        x[2][2] = "C1";
        x[2][3] = "D1";

//        System.out.println(x[1][0]);

        //use for loop to print all values of 2d array

        for(int row = 0; row<x.length;row++){
            for(int col = 0; col<x[0].length;col++){
                System.out.println(x[row][col]);
            }
        }
    }
}
