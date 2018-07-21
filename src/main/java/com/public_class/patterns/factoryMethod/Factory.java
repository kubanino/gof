package com.public_class.patterns.factoryMethod;

public abstract class Factory
{
    public Item productionProcess(String whatToProduce)
    {
        System.out.println("Pre production phases");
        return produceItem(whatToProduce);
    }

    abstract protected Item produceItem(String whatToProduce);
}
