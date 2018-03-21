package com.company.Java.Singleton;


public class Singleton_04_LazyInitialization {

    /**
     * Lazy initialization
     */
    private static Singleton_04_LazyInitialization instance = null;

    private Singleton_04_LazyInitialization() {
        System.out.println("Creating...");
    }

    public static Singleton_04_LazyInitialization getInstance() {
        if (instance == null) {
            instance = new Singleton_04_LazyInitialization();
        }
        return instance;
    }
}
