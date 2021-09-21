package com.company;

public class Knight extends Character{
    public Knight() {
        super(new AxeBehavior());
    }

    void fight(){
        System.out.println("I am knight");
    }
}
