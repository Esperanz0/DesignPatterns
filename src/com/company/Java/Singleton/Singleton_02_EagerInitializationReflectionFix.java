package com.company.Java.Singleton;


public class Singleton_02_EagerInitializationReflectionFix {

    private static final Singleton_02_EagerInitializationReflectionFix instance = new Singleton_02_EagerInitializationReflectionFix();

    private Singleton_02_EagerInitializationReflectionFix() {
        System.out.println("Creating...");
        if (instance != null) {
            throw new RuntimeException("can't create instance, Please use getInstance()");
        }
    }

    public static Singleton_02_EagerInitializationReflectionFix getInstance() {
        return instance;
    }
}
