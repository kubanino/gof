package com.public_class.patterns.factory_method;

import static com.public_class.patterns.factory_method.Item.Pen;

public class ExpensiveFactory extends Factory
{
    @Override
    protected Item produceItem(String whatToProduce)
    {
        if (whatToProduce.equals("Pen"))
        {
            System.out.println("Producing Pen by Cheap Factory");
            return Pen;
        }
        else
        {
            return null;
        }
    }
}
