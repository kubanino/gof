package com.publicclass.patterns.singletonThreadSafeLight;

public class Singleton
{
    private volatile Singleton instance;

    private Singleton()
    {

    }

    public Singleton getInstance()
    {
        if (null == instance)
        {
            synchronized (Singleton.class)
            {
                if (null == instance)
                {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
