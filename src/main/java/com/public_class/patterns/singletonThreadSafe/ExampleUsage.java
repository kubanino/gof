package com.public_class.patterns.singletonThreadSafe;

import com.public_class.patterns.singleton.Singleton;

public class ExampleUsage
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
    }
}
