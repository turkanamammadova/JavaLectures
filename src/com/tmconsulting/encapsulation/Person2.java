package com.tmconsulting.encapsulation;

public class Person2 {
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
