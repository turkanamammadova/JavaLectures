package com.tmconsulting.encapsulation;

public class EncapsulateRun {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setGirlName("Turkana");
        obj.setGirlAge(35);
        obj.setGirlWeight(182.0);

        System.out.println(obj.getGirlName());
        System.out.println(obj.getGirlAge());
        System.out.println(obj.getGirlWeight());

    }
}
