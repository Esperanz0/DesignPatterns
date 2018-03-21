package com.company.Java.Singleton;


public class Singleton_03_Main {

    public static void main(String[] args) throws Exception {

        Singleton_03_EagerInitializationCloneFix s1 = Singleton_03_EagerInitializationCloneFix.getInstance();
        Singleton_03_EagerInitializationCloneFix s2 = (Singleton_03_EagerInitializationCloneFix) s1.clone();

        System.out.println("S1: " + s1.hashCode());
        System.out.println("S2: " + s2.hashCode());
    }
}
