package com.tmconsulting.constructor;

public class Mouse {
    //constructor chaining

    private int numTeeth;
    private int numWhiskers;
    private int weight;

    public Mouse(int weight){
        this(weight, 6);
    }

    public Mouse(int weight, int numTeeth){
        this(weight, numTeeth, 6);
    }

    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight=weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print(){
        System.out.println(weight + " " + numTeeth + " " + numWhiskers );
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        mouse.print();
    }

}
