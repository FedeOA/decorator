package com.blog.example.decorator;

import com.blog.example.beverage.Beverage;

/**
 * Concrete Decorator: adds whipped cream on top of any beverage.
 */
public class WhippedCreamDecorator extends BeverageDecorator {

    private static final double WHIPPED_CREAM_SURCHARGE = 0.75;

    public WhippedCreamDecorator(Beverage wrapped) {
        super(wrapped);
    }

    @Override
    public String description() {
        return super.description() + " + Whipped Cream";
    }

    @Override
    public double cost() {
        return super.cost() + WHIPPED_CREAM_SURCHARGE;
    }
}
