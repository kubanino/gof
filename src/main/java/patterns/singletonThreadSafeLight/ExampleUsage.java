package patterns.singletonThreadSafeLight;

import patterns.singleton.Singleton;

public class ExampleUsage
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
    }
}
