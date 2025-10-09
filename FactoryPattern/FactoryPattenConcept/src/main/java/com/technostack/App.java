package com.technostack;

import com.technostack.conceptimpl.Factory;
import com.technostack.conceptimpl.Vehicle;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

            Vehicle vehicle = Factory.getInstance("car");
            vehicle.driveVehicle();

            vehicle = Factory.getInstance("bike");
            vehicle.driveVehicle();

            vehicle = Factory.getInstance("cycle");
            vehicle.driveVehicle();

            vehicle = Factory.getInstance("aeroplane");
            vehicle.driveVehicle();
    }
}
