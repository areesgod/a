package com.company;

public class Troll extends Character{
    public Troll() {
        super(new KnifeBehavior());
    }

    void fight(){
        System.out.println("I am a troll");
    }
}
