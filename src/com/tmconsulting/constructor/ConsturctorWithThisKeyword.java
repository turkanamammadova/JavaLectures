package com.tmconsulting.constructor;

public class ConsturctorWithThisKeyword {
    //class variables
    String name;
    int age;

//    public  ConsturctorWithThisKeyword(){
//        System.out.println("Try");
//    }
    public ConsturctorWithThisKeyword(String name, int age){
        //wait later - if you want to use class variables use this keyword
        this.name = name; //2 names will be equal
        this.age = age;  //this keyword initializes class variables

        //without this keyword it will run constructor variables
        System.out.println(name);
        System.out.println(age);

    }

    public static void main(String[] args) {
        ConsturctorWithThisKeyword obj = new ConsturctorWithThisKeyword("Tom", 30);
        ConsturctorWithThisKeyword obj2 = new ConsturctorWithThisKeyword("Turkana", 35);
        //ConsturctorWithThisKeyword o = new ConsturctorWithThisKeyword(); try
    }
}
