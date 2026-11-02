# Decorator Pattern Example — Coffee-Shop Beverage System

## Purpose

This project demonstrates the **Decorator** structural design pattern in Java
through an original coffee-shop beverage ordering scenario. The example is fully
independent from the text-formatting example described in the companion blog
post; it uses a different domain (beverages and ingredients), different class
names, different data values, and a different execution flow.

The core idea remains the same: add behavior (ingredients and their costs) to an
object at runtime via composition, without modifying the original class or
creating a combinatorial explosion of subclasses.

## Pattern Roles in This Example

| Pattern Role          | Class in this project        | Responsibility |
|-----------------------|------------------------------|----------------|
| **Component**         | `Beverage` (interface)       | Common contract: every beverage provides a `description()` and a `cost()`. |
| **Concrete Component**| `Espresso`, `GreenTea`       | Base beverage implementations with their own base cost. |
| **Base Decorator**    | `BeverageDecorator`          | Abstract class that holds a reference to a wrapped `Beverage` and delegates both methods to it. |
| **Concrete Decorator**| `MilkDecorator`, `WhippedCreamDecorator`, `CinnamonDecorator`, `SyrupDecorator` | Each adds one ingredient: extends the description string and adds a surcharge to the cost. |

## Project Structure

```
decorator/example/
├── README.md
└── src/main/java/com/blog/example/
    ├── Main.java                          # Entry point — builds and prints several beverage orders
    ├── beverage/                           # Component interface and concrete components
    │   ├── Beverage.java
    │   ├── Espresso.java
    │   └── GreenTea.java
    └── decorator/                          # Base decorator and all concrete decorators
        ├── BeverageDecorator.java
        ├── MilkDecorator.java
        ├── WhippedCreamDecorator.java
        ├── CinnamonDecorator.java
        └── SyrupDecorator.java
```

### Layer Descriptions

- **`beverage`** — Contains the `Beverage` interface (the Component) and its
  concrete implementations (`Espresso`, `GreenTea`). These classes know nothing
  about decorators.
- **`decorator`** — Contains the abstract `BeverageDecorator` (the Base
  Decorator) and all concrete decorators. Each decorator wraps any `Beverage`
  and adds a single ingredient.
- **`Main.java`** — Sits at the package root, orchestrates the demo by composing
  various decorator chains and printing the results.

## Prerequisites

- **Java 17** or later (any version >= 8 will work; no external libraries needed)

## How to Compile and Run

From the project root (`decorator/example/`):

```bash
# Compile all source files
mkdir -p out
javac -d out $(find src -name "*.java")

# Run the demo
java -cp out com.blog.example.Main
```

## Expected Output

```
=== Coffee Shop Beverage Decorator Demo ===

Order : Espresso
Cost  : $2.50
-------------------------------------------
Order : Espresso + Milk
Cost  : $3.10
-------------------------------------------
Order : Espresso + Milk + Whipped Cream + Caramel Syrup
Cost  : $4.35
-------------------------------------------
Order : Green Tea + Cinnamon
Cost  : $2.10
-------------------------------------------
Order : Green Tea + Milk + Cinnamon + Vanilla Syrup
Cost  : $3.20
-------------------------------------------
===========================================
```

## Why This Is an Independent Example

The blog post illustrates the Decorator pattern with a **text formatter** that
applies uppercase conversion, prefix insertion, and timestamp appending to
strings. This project instead models a **coffee-shop beverage system** where
each decorator represents a physical ingredient (milk, whipped cream, cinnamon,
flavored syrup) that modifies both the description and the price of a drink.
The domain, class names, method signatures, data values, and demonstration
scenario are entirely original while still teaching the same structural pattern.
