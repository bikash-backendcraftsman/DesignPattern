package com.technostack.conceptImpl;

public class EagerInitializationSingleton {
    //➡️ Here, object is created at class load time, even if you never call getInstance().
    private static EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton(); // created immediately

    private EagerInitializationSingleton(){

    }
    public static EagerInitializationSingleton getInstance(){
        return INSTANCE;
    }
}
