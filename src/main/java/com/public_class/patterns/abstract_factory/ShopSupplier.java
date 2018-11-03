package com.public_class.patterns.abstract_factory;

public class ShopSupplier
{
    private CarPartsFactory factory;

    public ShopSupplier(CarPartsFactory factory)
    {
        this.factory = factory;
    }

    public void activate()
    {
        factory.createBumper();
        factory.createExtension();
    }
}
