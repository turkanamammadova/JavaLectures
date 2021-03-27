package com.tmconsulting.abstraction;

public abstract class AbstractCars {
    //when we add a keyword abstract it becomes abstract class
    //we can not instantiate abstract classes, means we can not create object of abstract classes
    private int privateSpeed;
    public int publicSpeed;

    protected int protectedSpeed;

    int speedLimit =  100;
     public AbstractCars(){
         this(0);
     }

     public AbstractCars(int startSpeed){
         this.privateSpeed = startSpeed;
     }

     public void setPrivateSpeed(int pSpeed){
         this.privateSpeed = pSpeed;
     }

     public void engineStart(){
         System.out.println("ENGINE STARTED");
     }

     public abstract void engineStart2(String keyType, int numofGears); //no body
}
