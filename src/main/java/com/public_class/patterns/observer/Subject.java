package com.public_class.patterns.observer;

public interface Subject
{
    public Subject registerObserver(Observer o);
    public Subject removeObserver(Observer o);
    public Subject notifyObservers();
    public Subject setCurrentPower(double newPower);
}
