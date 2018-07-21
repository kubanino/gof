package com.public_class.patterns.abstractFactory;

interface CarPartsFactory
{
    public Bumper createBumper();
    public CarExtension createExtension();
}
