package patterns.abstractFactory;

public class OPELFactory implements CarPartsFactory
{
    @Override
    public Bumper createBumper()
    {
        System.out.println("Creating OPEL Bumper.");
        return null;
    }

    @Override
    public CarExtension createExtension()
    {
        System.out.println("Creating OPEL Extension.");
        return null;
    }
}
