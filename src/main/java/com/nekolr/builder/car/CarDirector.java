package com.nekolr.builder.car;

public class CarDirector {

    public Car constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setEngine(Engine.V5);
        builder.setSeats(4);
        builder.setNavigator(Navigator.GPS);
        builder.setTransmission(Transmission.AUTOMATIC);
        return builder.build();
    }

    public Car constructSALOON(Builder builder) {
        builder.setType(Type.SALOON);
        builder.setEngine(Engine.V5);
        builder.setSeats(2);
        builder.setNavigator(Navigator.BDS);
        builder.setTransmission(Transmission.AUTOMATIC);
        return builder.build();
    }

}
