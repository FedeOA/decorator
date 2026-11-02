package com.blog.example.beverage;

/**
 * Concrete Component: a basic espresso shot.
 * This class is completely unaware of any decorator that may wrap it.
 */
public class Espresso implements Beverage {

    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
