package com.technostack.conceptImpl2.factory.concreteFactory;

import com.technostack.conceptImpl2.Dish;
import com.technostack.conceptImpl2.Sushi;
import com.technostack.conceptImpl2.factory.DishFactory;

public class SushiFactoryImpl implements DishFactory {
    @Override
    public Dish createDishObject() {
        return new Sushi();
    }
}
