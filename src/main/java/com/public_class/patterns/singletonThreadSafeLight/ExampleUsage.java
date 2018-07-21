package com.public_class.patterns.singletonThreadSafeLight;

import com.public_class.patterns.singleton.Singleton;

public class ExampleUsage
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
    }
}
