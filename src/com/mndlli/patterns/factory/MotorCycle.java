package com.mndlli.patterns.factory;


/**
 * Concrete class that implements Vehicle interface
 * 
 * @author fmandelli
 * @version 1.0
 *
 */
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
