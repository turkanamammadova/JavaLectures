package com.tmconsulting.abstraction;

public class AbstractDemoBMW extends AbstractCars{
    //utilize abstract class
    public void setPrivateSpeed(int speed){
        super.setPrivateSpeed(10); //calling super class method
    }

    public void engineStart(){
        super.engineStart();
        System.out.println("BMW have keyless engine start");

        //we have to inherit abstract method otherwise it will give error

    }

    @Override
    public void engineStart2(String keyType, int numofGears) {
        System.out.println("This is BMW abstract method");
    }

}
