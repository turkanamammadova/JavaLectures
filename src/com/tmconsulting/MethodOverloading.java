package com.tmconsulting;

public class MethodOverloading {

    //Method overloading: when method name is same with different arguments
    // within the same class is called method overloading
    //you can not create method inside a method (try)
    //duplicate methods --> same method name with same number of arguments

    public static void main(String[] args) {
    MethodOverloading obj = new MethodOverloading();

    obj.sum();
    obj.sum(10);
    obj.sum(2,5);
    }

    //OVERLOAD METHODS
    public void sum(){ //0 input parameter
        System.out.println("SUM method zero param");
    }

    //duplicate methods are not allowed
    public void sum(int i){ //1 input parameter
        System.out.println("Sum method 1 input");
    }

    public void sum(int k, int l){
        System.out.println("Sum method 2 input");
    }

    public void sum(double d) { //1 input but different data type
        System.out.println("Different data type");
    }

}
