package com.technostack.concept;

public class LazyInitializationSingleton {
    //single reference that holds the one and only object of this class in memory.

    /*
    It ensures:
	•	All callers of LazySingleton.getInstance() get the same object.
	•	The object is created once, then reused every time.

    Think of it as a global pointer to one shared resource.
     */

    private static LazyInitializationSingleton instance;

    //private Constructor so that no other objects or class can access it from outside
    private LazyInitializationSingleton() {

    }

    public static LazyInitializationSingleton getInstance() {
        // check if instance is null
        if (instance == null) {
            // if instance is null, create the object
            instance = new LazyInitializationSingleton();
        }
        //Return the instance[Either newly created or existed instance]
        return instance;
    }


}
