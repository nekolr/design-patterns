package com.nekolr.builder.pizza;

public class VeggiePizzaBuilder extends PizzaBuilder {

    public VeggiePizzaBuilder() {
        this.name = "Veggie Pizza";
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
        this.toppings.add("olives");
        return null;
    }

    @Override
    public PizzaBuilder addSpinach() {
        this.toppings.add("spinach");
        return null;
    }

    @Override
    public PizzaBuilder addPepperoni() {
        // never EVER add Pepperoni to veggie pizza
        return this;
    }

    @Override
    public PizzaBuilder addSausage() {
        return this;
    }
}
