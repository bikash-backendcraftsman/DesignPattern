package com.technostack.conceptImpl2;

public class Pizza implements Dish{
    @Override
    public void prepareDish() {
        System.out.println("Preparing pizza...!!");
    }

    @Override
    public void serveDish() {
        System.out.println("Serving pizza...!!");
    }
}
