package com.blog.example.beverage;

/**
 * Concrete Component: a basic green tea.
 * Demonstrates that the decorator chain works with any component implementation.
 */
public class GreenTea implements Beverage {

    @Override
    public String description() {
        return "Green Tea";
    }

    @Override
    public double cost() {
        return 1.80;
    }
}
