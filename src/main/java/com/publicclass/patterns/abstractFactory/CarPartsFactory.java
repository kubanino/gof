package com.publicclass.patterns.abstractFactory;

interface CarPartsFactory
{
    public Bumper createBumper();
    public CarExtension createExtension();
}
