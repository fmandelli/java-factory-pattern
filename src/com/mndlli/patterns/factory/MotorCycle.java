package com.mndlli.patterns.factory;

public class MotorCycle implements Vehicle {

    @Override
    public VehicleType getType() {
        return VehicleType.MOTORCYCLE;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is now being driven...");
    }

}
