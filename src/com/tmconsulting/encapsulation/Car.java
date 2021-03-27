package com.tmconsulting.encapsulation;

//private variables can only be accessed in the same class
//it is possible to access them if we provide public get and set methods
//syntax for both is that they start either get or set followed by name of the variable setName

public class Car { //class is a template/blueprint so we can use it to create objects
    //color
    private String color;

    //make
    private String make;

    //model
    private String model;

    //year
    private int year;


    private void increaseSpeed(){
        System.out.println("Increasing the speed");
    }

    //getter
    public String getColor() {
        return color;
    }

    //setter
    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1900) {
            this.year = year;
        }else {
            System.out.println("This is not valid year");
        }
    }

    //create a setter --> a method which is used to set the value of field or variable
    public void setMake(String make){ //sets value
        //when we put this keyword in front of a variable, it accesses class variable
        this.make = make; //white make is the make in setMake method
    }

    public String getMake(){ //returns value
        return make;
    }

    //create rest of the getters and setters by using auto generate
}
