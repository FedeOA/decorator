package com.blog.example.decorator;

import com.blog.example.beverage.Beverage;

/**
 * Concrete Decorator: adds a flavored syrup to any beverage.
 * Unlike other decorators this one accepts a runtime parameter (the syrup flavor),
 * showing that decorators can carry their own configurable state.
 */
public class SyrupDecorator extends BeverageDecorator {

    private static final double SYRUP_SURCHARGE = 0.50;
    private final String flavor;

    public SyrupDecorator(Beverage wrapped, String flavor) {
        super(wrapped);
        this.flavor = flavor;
    }

    @Override
    public String description() {
        return super.description() + " + " + flavor + " Syrup";
    }

    @Override
    public double cost() {
        return super.cost() + SYRUP_SURCHARGE;
    }
}
