package com.public_class.patterns.strategy;

public class ExampleUsage
{
    public static void main(String args[])
    {
        Hero Jakub = new HeroImplementation("Jakub");
        Jakub.killEnemy();
        Jakub.setWeapon(new Gun());
        Jakub.killEnemy();
        Jakub.setWeapon(new Axe());
        Jakub.killEnemy();
    }
}