package com.technostack.conceptImpl2;

public class Sushi implements Dish{
    @Override
    public void prepareDish() {
        System.out.println("Preparing Sushi..!!");
    }

    @Override
    public void serveDish() {
        System.out.println("Serving Sushi..!!");
    }
}
