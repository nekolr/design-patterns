package com.nekolr.builder.car;

public class Car {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Navigator navigator;

    public Car(Type type, int seats, Engine engine, Transmission transmission, Navigator navigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.navigator = navigator;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Navigator getNavigator() {
        return navigator;
    }
}
