package com.nekolr.builder.pizza;

public class PizzaDirector {

    public Pizza constructMeatPizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.addCheese();
        pizzaBuilder.addPepperoni();
        pizzaBuilder.addTomatoes();
        pizzaBuilder.addSauce();
        return pizzaBuilder.build();
    }

    public Pizza constructVeggiePizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.addOlives();
        pizzaBuilder.addPepperoni(); // 即使加入也无效
        pizzaBuilder.addTomatoes();
        pizzaBuilder.addCheese();
        return pizzaBuilder.build();
    }
}
