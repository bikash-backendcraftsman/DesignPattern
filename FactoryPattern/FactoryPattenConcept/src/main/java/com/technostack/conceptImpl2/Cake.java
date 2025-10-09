package com.technostack.conceptImpl2;

public class Cake implements Dish{
    @Override
    public void prepareDish() {
        System.out.println("Preparing Cake ..!!");
    }

    @Override
    public void serveDish() {
        System.out.println("Serving Cake..!!");
    }
}
