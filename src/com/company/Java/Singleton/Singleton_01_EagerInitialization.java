package com.company.Java.Singleton;

/**
 * Singleton Eager Initialization
 * <p>
 * Instance is created when class is loaded
 * <p>
 * PROS:
 * - will try to find :)
 * <p>
 * <p>
 * Cons:
 * - instance is created even if no one will use this by getInstance()
 * - initialization may fail and we have no more change to create it
 * - no thread safe
 * - using Reflection we can easy broke this pattern creating new instance even with private constructor
 */

public class Singleton_01_EagerInitialization {

    // TODO: This should be final?
    private final static Singleton_01_EagerInitialization instance = new Singleton_01_EagerInitialization();

    /**
     * Possible Reflection fix
     * <p>
     * private Singleton_01_EagerInitialization() {
     * System.out.println("Creating...");
     * if ( instance != null) {
     * throw new RuntimeException(can't create instance, Please use getInstance()");
     * }
     * }
     */

    private Singleton_01_EagerInitialization() {
        System.out.println("Creating...");
    }

    public static Singleton_01_EagerInitialization getInstance() {
        return instance;
    }
}
