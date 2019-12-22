package com.mndlli.patterns.factory;


/**
 * Concrete class that implements Vehicle interface
 * 
 * @author fmandelli
 * @version 1.0
 *
 */
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
