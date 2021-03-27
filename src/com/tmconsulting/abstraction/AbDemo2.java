package com.tmconsulting.abstraction;

public class AbDemo2 {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.showConfig();
    }
}

abstract class Phone{
    public abstract void showConfig();
}

class Iphone extends Phone{

    @Override
    public void showConfig() {
            System.out.println("1GB, IOS 13.10");

    }
}
