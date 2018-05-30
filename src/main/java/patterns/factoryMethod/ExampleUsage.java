package patterns.factoryMethod;

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
