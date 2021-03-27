package com.tmconsulting;

public class StringPractice {
    public String helloName(String name){
        return "Hello" + name;
    }

    public String hiBye(String a, String b){
        return (a+b+b+a);
    }

    public static void main(String[] args) {
        StringPractice obj = new StringPractice();
        System.out.println(obj.helloName("Turkana"));
        System.out.println(obj.hiBye("hi","bye"));
    }
}
