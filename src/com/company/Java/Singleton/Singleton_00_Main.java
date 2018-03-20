package com.company.Java.Singleton;


import java.lang.reflect.Constructor;

public class Singleton_00_Main {

    public static void main(String[] args) throws Exception {

        Singleton_01_EagerInitialization s1 = Singleton_01_EagerInitialization.getInstance();
        Singleton_01_EagerInitialization s2 = Singleton_01_EagerInitialization.getInstance();

        // Like we can see Singleton was created only once and getInstance() returning the same hashcode
        System.out.println("Singleton 1: " + s1.hashCode());
        System.out.println("Singleton 2: " + s2.hashCode());

        // Broke Singleton using Reflection
        Class clazz = Class.forName("com.company.Java.Singleton.Singleton_01_EagerInitialization");
        Constructor<Singleton_01_EagerInitialization> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton_01_EagerInitialization s3 = constructor.newInstance();

        // Aaaaaand done :)
        System.out.println("Singleton 3: " + s3.hashCode());

        // Try the same with Singleton Reflection fix
        Class clazzFix = Class.forName("com.company.Java.Singleton.Singleton_02_EagerInitializationReflectionFix");
        Constructor<Singleton_01_EagerInitialization> constructorFix = clazzFix.getDeclaredConstructor();
        constructorFix.setAccessible(true);
        Singleton_01_EagerInitialization s4 = constructorFix.newInstance();

        System.out.println("Singleton with reflection fix: " + s4.hashCode());

        // TODO: Looks like it works but is it really helpful ?

    }
}
