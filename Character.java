package com.company;

public abstract class Character
{
    WeaponBehavior weapon;
    public Character(WeaponBehavior weapon)
    {
        this.weapon= weapon;
    }


    public void setWeapon() {
        this.weapon.useweapon();
    }


    abstract void fight();
}



