package com.nekolr.builder;

import com.nekolr.builder.car.Engine;
import com.nekolr.builder.car.Navigator;
import com.nekolr.builder.car.Transmission;
import com.nekolr.builder.car.Type;

public class Demo {
    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .withEngine(Engine.V5)
                .withSeats(2)
                .withType(Type.SALOON)
                .withNavigator(Navigator.GPS)
                .withTransmission(Transmission.AUTOMATIC)
                .build();

        Car car2 = new Car.Builder()
                .withEngine(Engine.V5)
                .withSeats(4)
                .withType(Type.SUV)
                .withNavigator(Navigator.BDS)
                .withTransmission(Transmission.AUTOMATIC)
                .build();
    }
}
