package com.public_class.patterns.factory_method;

public class ExampleUsage
{
    public static void main(String args[])
    {
        CheapFactory cheapFactory = new CheapFactory();
        ExpensiveFactory expensiveFactory = new ExpensiveFactory();

        cheapFactory.productionProcess("Pen");
        expensiveFactory.productionProcess("Pen");
    }

}
