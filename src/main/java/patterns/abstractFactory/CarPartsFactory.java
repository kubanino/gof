package patterns.abstractFactory;

interface CarPartsFactory
{
    public Bumper createBumper();
    public CarExtension createExtension();
}
