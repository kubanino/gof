package patterns.factoryMethod;

import static patterns.factoryMethod.Item.*;

public class CheapFactory extends Factory
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
