package com.tmconsulting.abstraction;

public class AbDemo {
    public static void main(String[] args) {
        //cannot create object of abstract class
        GunelsPhone gp = new GunelsPhone();
        gp.call();
        gp.cook();
        gp.dance();
        gp.move();


    }
}

abstract class TurkanaPhone{ //abstract class
    public void call(){
        System.out.println("calling");
    }
    public abstract void move(); //abstract methods
    public abstract void dance();
    public abstract void cook();
}

abstract class TaisaPhone extends TurkanaPhone{ //abstract class

    @Override
    public void move() {
        System.out.println("moving..");
    }

}

class GunelsPhone extends TaisaPhone{ //concrete class
    public void dance(){
        System.out.println("dancing");
    }

    public void cook(){
        System.out.println("Cooking");
    }
}
