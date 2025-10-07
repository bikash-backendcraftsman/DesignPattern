package com.technostack.conceptImpl;

public class ThreadSafeSingleton {
    //The single instance , initially null
    private static ThreadSafeSingleton instance;
    //Constructor is private , so that we prevent more object creation/instantiation
    private ThreadSafeSingleton(){

    }
    /**
     * public method to get the instance, with synchronized keyword
     * @return instance
     */

    public static synchronized ThreadSafeSingleton getInstance(){
        //check if instance is null
        if(instance == null){
            //if null create instance
            instance = new ThreadSafeSingleton();
        }
        //return the instance [Either newly created or existing]
        return instance;
    }
}
