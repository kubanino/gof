package patterns.strategy;

public class HeroImplementation implements Hero
{
    private Weapon currentWeapon;
    private String name;

    public HeroImplementation(String name)
    {
        this.name = name;
    }

    @Override
    public void setWeapon(Weapon newWeapon)
    {
        currentWeapon = newWeapon;
    }

    @Override
    public void killEnemy()
    {
        if (null != currentWeapon)
        {
            System.out.println("Killing enemy with: " + currentWeapon.describe());
        }
        else
        {
            System.out.println("Has no weapon!");
        }

    }
}
