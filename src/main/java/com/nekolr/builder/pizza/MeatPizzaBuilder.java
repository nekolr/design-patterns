package com.nekolr.builder.pizza;

public class MeatPizzaBuilder extends PizzaBuilder {

    public MeatPizzaBuilder() {
        this.name = "Meat Pizza";
    }

    @Override
    public PizzaBuilder addCheese() {
        this.toppings.add("cheese");
        return this;
    }

    @Override
    public PizzaBuilder addSauce() {
        this.toppings.add("sauce");
        return this;
    }

    @Override
    public PizzaBuilder addTomatoes() {
        this.toppings.add("tomatoes");
        return this;
    }

    @Override
    public PizzaBuilder addGarlic() {
        this.toppings.add("garlic");
        return this;
    }

    @Override
    public PizzaBuilder addOlives() {
        return this;
    }

    @Override
    public PizzaBuilder addSpinach() {
        return this;
    }

    @Override
    public PizzaBuilder addPepperoni() {
        this.toppings.add("pepperoni");
        return this;
    }

    @Override
    public PizzaBuilder addSausage() {
        this.toppings.add("sausage");
        return this;
    }
}
