package com.tmconsulting;

public class WhileLoop {

    public static void main(String[] args) {
	// If you are writing a code again and again, to avoid of repititive types, we will use concept of looping

        // 1. while loop

        int i = 2; //initialization
        while (i<=9){ //conditional
            //body of while loop
            System.out.println(i);
            i = i + 1; //incremental decremental
            //1 i
            //2 i = i+1 true print 2
            //3 i = 2 + 1, 3, 3<10, true print 3
        }
    //dis advantage: it will generate infinite loop if you give dont increment/decremental part
        int n = 0;
        while (n<10){
            System.out.println(n);
            n++;
            //n 0
            //n = n+1   0 + 1 is this less than 10, yes, print 1
            //n = n+1  1+1 is this less than 10 yes, print 2
            //n = n + 1 n was 9, 9+ 1 = 10 is less than 10 NO so dont print
        }


    }
}
