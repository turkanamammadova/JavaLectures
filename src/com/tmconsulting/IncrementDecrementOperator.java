package com.tmconsulting;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        // ++
        // --

        int i = 1; // i = i + 1
        int j = i++; // post increment

        System.out.println("i " + i);
        System.out.println("j " + j);

        int a = 1;
        int b = ++a; // pre increment increase the value of a by 1 and give it to b

        System.out.println("a" + a);
        System.out.println("b" + b);

        int m = 2;
        int n = m--; //post decrement first the get the value of m and give it to n, then decrease the value of m by 1
        System.out.println("m" + m);
        System.out.println("n" + n);

        int p = 2;
        int q = --p; //pre decrement,
        System.out.println(p); // decrease the value of p and give it to p
        System.out.println(q); //decrease the value of p by 1(2-1)

    }
}
