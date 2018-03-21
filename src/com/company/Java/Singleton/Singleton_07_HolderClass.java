package com.company.Java.Singleton;

public class Singleton_07_HolderClass {

    private Singleton_07_HolderClass() {
        System.out.println("Creating...");
    }

    static class Holder {
        static final Singleton_07_HolderClass instance = new Singleton_07_HolderClass();
    }

    public static Singleton_07_HolderClass getInstance() {
        return Holder.instance;
    }
}
