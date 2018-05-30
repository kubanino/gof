package patterns.factoryMethod;

import static patterns.factoryMethod.Item.Pen;

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
