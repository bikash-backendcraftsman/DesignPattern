package com.technostack.conceptImpl2.factory;

import com.technostack.conceptImpl2.Dish;

/**
 * This is an interface which is following Factory Method Design Pattern.
 */
public interface DishFactory {
    // This method is declared for creating factory objects of concrete types.
    Dish createDishObject();
}
