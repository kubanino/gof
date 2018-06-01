package com.publicclass.patterns.singletonThreadSafeLight;

import com.publicclass.patterns.singleton.Singleton;

public class ExampleUsage
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
    }
}
