package com.blog.example.beverage;

/**
 * Component interface: the common contract for all beverages and their decorators.
 * Every beverage must provide a human-readable description and a monetary cost.
 */
public interface Beverage {

    /**
     * Returns a textual description of this beverage, including any add-ons.
     */
    String description();

    /**
     * Returns the total cost of this beverage in dollars.
     */
    double cost();
}
