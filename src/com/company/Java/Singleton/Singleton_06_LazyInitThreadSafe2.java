package com.company.Java.Singleton;

public class Singleton_06_LazyInitThreadSafe2 {

    private volatile static Singleton_06_LazyInitThreadSafe2 instance = null;

    private Singleton_06_LazyInitThreadSafe2() {

    }

    public static Singleton_06_LazyInitThreadSafe2 getInstance() {
        if (instance == null) {
            synchronized (Singleton_06_LazyInitThreadSafe2.class) {
                if (instance == null) {
                    instance = new Singleton_06_LazyInitThreadSafe2();
                }
            }
        }
        return instance;
    }
}
