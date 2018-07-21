package com.public_class.patterns.observer;

public class ExampleUsage
{
    public static void main(String args[])
    {
        Subject powerStation = new SubjectImplementation();
        Observer clientOne = new ObserverImplementation("Client 1");
        powerStation.
                registerObserver(clientOne).
                registerObserver(clientOne).
                registerObserver(clientOne).
                setCurrentPower(3);
        powerStation.notifyObservers();
    }
}
