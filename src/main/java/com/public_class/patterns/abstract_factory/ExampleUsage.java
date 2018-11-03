package com.public_class.patterns.abstract_factory;

public class ExampleUsage
{
    public static void main(String[] args)
    {
        ShopSupplier shopSupplierWithBMWParts = new ShopSupplier(new BMWFactory());
        ShopSupplier shopSupplierWithOPELParts = new ShopSupplier(new OPELFactory());

        shopSupplierWithBMWParts.activate();
        shopSupplierWithOPELParts.activate();
    }
}
