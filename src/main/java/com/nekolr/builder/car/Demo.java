package com.nekolr.builder.car;

public class Demo {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();
        Builder builder = new CarBuilder();

        Car saloon = carDirector.constructSALOON(builder);

        Car suv = carDirector.constructSUV(builder);
    }
}
