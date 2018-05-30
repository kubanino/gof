package patterns.observer;

import java.util.ArrayList;

public class SubjectImplementation implements Subject
{
    private ArrayList<Observer> observers;
    private double currentPower;

    public SubjectImplementation()
    {
        observers = new ArrayList<>();
    }

    public Subject registerObserver(Observer o)
    {
        observers.add(o);
        return this;
    }

    public Subject setCurrentPower(double newPower)
    {
        currentPower = newPower;
        return this;
    }

    public Subject removeObserver(Observer o)
    {
        observers.remove(o);
        return this;
    }

    public Subject notifyObservers()
    {
        observers.forEach(o -> o.update(currentPower));
        return this;
    }
}
