package com.company.Java.Singleton;


public class Singleton_03_EagerInitializationCloneFix {

    private static final Singleton_03_EagerInitializationCloneFix instance = new Singleton_03_EagerInitializationCloneFix();

    public Singleton_03_EagerInitializationCloneFix() {
        System.out.println("Creating...");
    }

    public static Singleton_03_EagerInitializationCloneFix getInstance() {
        return instance;
    }

    /**
     * Clone method will throw CloneNotSupportedException if someone will try to clone our Singleton
     * @throws CloneNotSupportedException
     */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
