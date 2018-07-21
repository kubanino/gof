package com.public_class.patterns.observer;

public class ObserverImplementation implements Observer
{
    private double power;
    private String observerName;

    public ObserverImplementation(String observerName)
    {
        this.observerName = observerName;
    }

    public void update(double currentPower)
    {
        this.power = currentPower;
        display();
    }

    void display()
    {
        System.out.println("Current power of " + this.observerName + ": " + this.power + "%");
    }
}