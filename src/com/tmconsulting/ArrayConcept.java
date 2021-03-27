package com.tmconsulting;

public class ArrayConcept {
    public static void main(String[] args) {

        /*int i = 20;
        i=10;
        Array is to store similar data type values in array variable
         */
        //lowest bound/index = 0;
        //upper bound/index = n - 1 (n is size of array)
        // I can store multiple variables in single variable
        //disadvantage: size is fixed --- we can assign maximum four values

        int i[] = new int[4]; //I want to store 4 values, maximum 4 values we can store
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;
//        i[4] = 50; index out of bound for length 4 Array index out of bounds exception
        //there is no i[4]

        System.out.println(i[2]);

        System.out.println(i.length);

        //print all the values of array: use for loop
        for (int j =0; j<i.length; j++)  //i.length is 4
            //i[0] = 10 zero is less than 4

            System.out.println(i[j]);


        //double array
        double d[] = new double[3];
        d[0] = 11.3;
        d[1] = 10.5;
        d[2] = 8.5;
//        d[3] = 15.5;

        System.out.println(d[2]);


        //char array
        char c[] = new char[4];
        c[0] = 'T';
        c[1] = 'U';
        c[2] = 'R';
        c[3] = 'K';
        System.out.println(c[3]);

        //boolean array
        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        //String array
        String s[] =  new String[3];
        s[0] = "woman";
        s[1] = "man";
        s[2] = "child";
        System.out.println(s.length);

        boolean boo[] = new boolean[2];
        boo[0] =true;
        boo[1] = false;
        System.out.println(b[1]);

        String str[] = new String[3];
        str[0] = "Maryam";
        str[1] = "Ismail";
        str[2] = "Ayxan";

        for (int in = 0; in < str.length; in++)
            System.out.println(str[in]);

//            for (int j =0; j<i.length; j++)  //i.length is 4
//                //i[0] = 10 zero is less than 4
//
//                System.out.println(i[j]);

    }
}
