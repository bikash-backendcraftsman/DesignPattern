package com.technostack.conceptImpl2.factory.concreteFactory;

import com.technostack.conceptImpl2.Cake;
import com.technostack.conceptImpl2.Dish;
import com.technostack.conceptImpl2.factory.DishFactory;

public class CakeFactoryImpl implements DishFactory {
    @Override
    public Dish createDishObject() {
        return new Cake();
    }
}
