package com.technostack.conceptImpl2.factory.concreteFactory;

import com.technostack.conceptImpl2.Dish;
import com.technostack.conceptImpl2.Pizza;
import com.technostack.conceptImpl2.factory.DishFactory;

public class PizzaFactoryImpl implements DishFactory {
    @Override
    public Dish createDishObject() {
        return new Pizza();
    }
}
