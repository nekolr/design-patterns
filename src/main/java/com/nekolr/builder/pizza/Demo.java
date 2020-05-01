package com.nekolr.builder.pizza;

public class Demo {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new MeatPizzaBuilder();
        PizzaDirector pizzaDirector = new PizzaDirector();

        Pizza meatPizza = pizzaDirector.constructMeatPizza(pizzaBuilder);
        Pizza veggiePizza = pizzaDirector.constructVeggiePizza(pizzaBuilder);
    }
}
