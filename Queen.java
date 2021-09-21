package com.company;

public class Queen extends Character{
    public Queen() {
        super(new SwordBehavior());
    }

    public void fight(){

        System.out.printf("I am queen");
    }
}
