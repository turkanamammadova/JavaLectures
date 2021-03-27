package com.tmconsulting.encapsulation;

public class Encapsulate {
    private String girlName;
    private int girlAge;
    private double girlWeight;

    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public int getGirlAge() {
        return girlAge;
    }

    public void setGirlAge(int girlAge) {
        this.girlAge = girlAge;
    }

    public double getGirlWeight() {
        return girlWeight;
    }

    public void setGirlWeight(double girlWeight) {
        this.girlWeight = girlWeight;
    }
}

//advantages of encapsulation
/*
1. Data hiding: the user will have no idea about inner implementation of the class
It will not be visible to the user that how the class is storing the values
2. Reusability: encapsulation also improves the reusablity and easy to change with new requiremennts
Its all about declaring the variables in the class as private and writing public methods in the class to set and get the
values of variables
 */