package com.public_class.patterns.abstract_factory;

public class BMWFactory implements CarPartsFactory
{
    @Override
    public Bumper createBumper()
    {
        System.out.println("Creating BMW Bumper.");
        return null;
    }

    @Override
    public CarExtension createExtension()
    {
        System.out.println("Creating BMW Extension.");
        return null;
    }
}
