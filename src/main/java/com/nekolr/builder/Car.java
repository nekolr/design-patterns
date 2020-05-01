package com.nekolr.builder;

import com.nekolr.builder.car.Engine;
import com.nekolr.builder.car.Navigator;
import com.nekolr.builder.car.Transmission;
import com.nekolr.builder.car.Type;

/**
 * 简化版的建造者模式
 */
public final class Car {

    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Navigator navigator;

    private Car(Builder builder) {
        this.type = builder.type;
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.navigator = builder.navigator;
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

    public static class Builder {
        private Type type;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private Navigator navigator;

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder withSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder withEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder withTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder withNavigator(Navigator navigator) {
            this.navigator = navigator;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
