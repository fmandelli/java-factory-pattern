package com.mndlli.patterns.factory;

public class Car implements Vehicle {

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }

    @Override
    public void drive() {
        System.out.println("Car is now being driven...");
    }

}
