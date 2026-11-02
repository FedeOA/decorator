package com.blog.example;

import com.blog.example.beverage.Beverage;
import com.blog.example.beverage.Espresso;
import com.blog.example.beverage.GreenTea;
import com.blog.example.decorator.CinnamonDecorator;
import com.blog.example.decorator.MilkDecorator;
import com.blog.example.decorator.WhippedCreamDecorator;
import com.blog.example.decorator.SyrupDecorator;

/**
 * Demonstrates the Decorator pattern applied to a coffee-shop beverage ordering system.
 * Each decorator adds an extra ingredient (and cost) to a base beverage without
 * modifying the original beverage classes.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Coffee Shop Beverage Decorator Demo ===");
        System.out.println();

        // 1. A plain espresso with no extras
        Beverage plainEspresso = new Espresso();
        printOrder(plainEspresso);

        // 2. Espresso with milk
        Beverage espressoWithMilk = new MilkDecorator(new Espresso());
        printOrder(espressoWithMilk);

        // 3. Espresso with milk, whipped cream, and caramel syrup — stacking three decorators
        Beverage loadedEspresso = new SyrupDecorator(
            new WhippedCreamDecorator(
                new MilkDecorator(new Espresso())
            ),
            "Caramel"
        );
        printOrder(loadedEspresso);

        // 4. Green tea with cinnamon — showing a completely different base component
        Beverage cinnamonTea = new CinnamonDecorator(new GreenTea());
        printOrder(cinnamonTea);

        // 5. Green tea with milk, cinnamon, and vanilla syrup — dynamic stacking
        Beverage deluxeTea = new SyrupDecorator(
            new CinnamonDecorator(
                new MilkDecorator(new GreenTea())
            ),
            "Vanilla"
        );
        printOrder(deluxeTea);

        System.out.println("===========================================");
    }

    /**
     * Prints the full description and total cost of a beverage order.
     */
    private static void printOrder(Beverage beverage) {
        System.out.printf("Order : %s%n", beverage.description());
        System.out.printf("Cost  : $%.2f%n", beverage.cost());
        System.out.println("-------------------------------------------");
    }
}
