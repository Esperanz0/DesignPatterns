package com.company.Java;

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

public class Singleton_EagerInitialization {

    // TODO: This should be final?
    private final static Singleton_EagerInitialization instance = new Singleton_EagerInitialization();

    /**
     * Possible Reflection fix
     * <p>
     * private Singleton_EagerInitialization() {
     * System.out.println("Creating...");
     * if ( instance != null) {
     * throw new RuntimeException(can't create instance, Please use getInstance()");
     * }
     * }
     */

    private Singleton_EagerInitialization() {
        System.out.println("Creating...");
    }

    public static Singleton_EagerInitialization getInstance() {
        return instance;
    }
}
