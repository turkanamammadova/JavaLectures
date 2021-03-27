package com.tmconsulting.encapsulation;

public class Person {
    private String name; //restricted access

    //Getter
    public String getName(){
        return name;
    }

    //Setter
    public void setName(String newName){
        this.name = newName;
    }
}
