package com.company.Java.Singleton;


import java.lang.reflect.Constructor;

public class Singleton_02_Main {

    public static void main(String[] args) throws Exception {

        // Try the same with Singleton Reflection fix
        Class clazzFix = Class.forName("com.company.Java.Singleton.Singleton_02_EagerInitializationReflectionFix");
        Constructor<Singleton_01_EagerInitialization> constructorFix = clazzFix.getDeclaredConstructor();
        constructorFix.setAccessible(true);
        Singleton_01_EagerInitialization s4 = constructorFix.newInstance();

        System.out.println("Singleton with reflection fix: " + s4.hashCode());

    }
}
