package com.blog.example.decorator;

import com.blog.example.beverage.Beverage;

/**
 * Base Decorator: holds a reference to the wrapped Beverage and delegates
 * both description() and cost() to it.
 * Concrete decorators extend this class and add their own behavior
 * before or after delegating.
 */
public abstract class BeverageDecorator implements Beverage {

    private final Beverage wrapped;

    protected BeverageDecorator(Beverage wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String description() {
        return wrapped.description();
    }

    @Override
    public double cost() {
        return wrapped.cost();
    }
}
