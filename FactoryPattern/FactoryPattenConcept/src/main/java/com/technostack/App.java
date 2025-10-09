package com.technostack;

import com.technostack.conceptImpl2.Dish;
import com.technostack.conceptImpl2.factory.DishFactory;
import com.technostack.conceptImpl2.factory.concreteFactory.CakeFactoryImpl;
import com.technostack.conceptImpl2.factory.concreteFactory.PizzaFactoryImpl;
import com.technostack.conceptImpl2.factory.concreteFactory.SushiFactoryImpl;
import com.technostack.conceptimpl.Factory;
import com.technostack.conceptimpl.Vehicle;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        /**
         * Example : 1
         * Below code is executable code for Vehicle Factory Pattern present in conceptimpl package.
         */
        Vehicle vehicle = Factory.getInstance("car");
            vehicle.driveVehicle();

            vehicle = Factory.getInstance("bike");
            vehicle.driveVehicle();

            vehicle = Factory.getInstance("cycle");
            vehicle.driveVehicle();

            vehicle = Factory.getInstance("aeroplane");
            vehicle.driveVehicle();

        System.out.println();
        System.out.println("======================================");

        /**
         * Example : 2
         * Below code is executable code for Dish Factory Pattern present in conceptimpl2 package.
         */

        Dish dishObject;
        /*
        For Pizza
         */
        DishFactory pizzaFactory = new PizzaFactoryImpl();
         dishObject = pizzaFactory.createDishObject();
        dishObject.prepareDish();
        dishObject.serveDish();
        System.out.println();

        /*
        For Sushi
         */
        DishFactory sushiFactory = new SushiFactoryImpl();
        dishObject = sushiFactory.createDishObject();
        dishObject.prepareDish();
        dishObject.serveDish();
        System.out.println();

        /*
        For Cake
         */
        DishFactory cakeFactory = new CakeFactoryImpl();
        dishObject = cakeFactory.createDishObject();
        dishObject.prepareDish();
        dishObject.serveDish();

    }
}
