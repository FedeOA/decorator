package com.blog.example.decorator;

import com.blog.example.beverage.Beverage;

/**
 * Concrete Decorator: adds steamed milk to any beverage.
 * Appends to the description and adds its own surcharge to the cost.
 */
public class MilkDecorator extends BeverageDecorator {

    private static final double MILK_SURCHARGE = 0.60;

    public MilkDecorator(Beverage wrapped) {
        super(wrapped);
    }

    @Override
    public String description() {
        return super.description() + " + Milk";
    }

    @Override
    public double cost() {
        return super.cost() + MILK_SURCHARGE;
    }
}
