package com.blog.example.decorator;

import com.blog.example.beverage.Beverage;

/**
 * Concrete Decorator: sprinkles cinnamon onto any beverage.
 */
public class CinnamonDecorator extends BeverageDecorator {

    private static final double CINNAMON_SURCHARGE = 0.30;

    public CinnamonDecorator(Beverage wrapped) {
        super(wrapped);
    }

    @Override
    public String description() {
        return super.description() + " + Cinnamon";
    }

    @Override
    public double cost() {
        return super.cost() + CINNAMON_SURCHARGE;
    }
}
