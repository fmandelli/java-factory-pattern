package com.mndlli.patterns.factory;

public class Truck implements Vehicle {

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
    }

    @Override
    public void drive() {
        System.out.println("Truck is now being driven...");
    }

}
