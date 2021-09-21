package com.company;

public class King extends Character{
    public King() {
        super(new ArrowandBowBehavior());
    }



    void fight(){

        System.out.println("I am king"); }
}
