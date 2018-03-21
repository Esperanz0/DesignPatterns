package com.company.Java.Singleton;


public class Singleton_05_LazyInitThreadSafe {

    private static Singleton_05_LazyInitThreadSafe instance = null;

    private Singleton_05_LazyInitThreadSafe() {
        System.out.println("Creating...");
    }

    /**
     * Probably the easiest way to made Singleton multithreaded is synchronize the whole method
     */
    public synchronized static Singleton_05_LazyInitThreadSafe getInstance() {
        if (instance == null) {
            instance = new Singleton_05_LazyInitThreadSafe();
        }
        return instance;
    }
}
