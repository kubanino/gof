package com.public_class.patterns.abstract_factory;

interface CarPartsFactory
{
    public Bumper createBumper();
    public CarExtension createExtension();
}
