package com.mndlli.patterns.factory;


/**
 * Concrete class that implements Vehicle interface
 * 
 * @author fmandelli
 * @version 1.0
 *
 */
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
