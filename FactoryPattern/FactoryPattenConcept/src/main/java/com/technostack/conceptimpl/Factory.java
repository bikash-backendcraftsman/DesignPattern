package com.technostack.conceptimpl;

public class Factory {

    public static Vehicle getInstance(String vehicleType){
        Vehicle vehicleObj;
        if(vehicleType.equalsIgnoreCase("car")){
             vehicleObj = new Car();
        } else if (vehicleType.equalsIgnoreCase("bike")) {
             vehicleObj = new Bike();
        } else {
             vehicleObj = new Cycle();
        }
        return vehicleObj;
    }
}
