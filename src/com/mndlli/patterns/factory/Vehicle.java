package com.mndlli.patterns.factory;


/**
 * This is a very simple interface to explain how Java factory pattern works.
 * Any other vehicle must implement this interface.
 * 
 * @author fmandelli
 * @version 1.0
 *
 */
public interface Vehicle {
    
    VehicleType getType();
    void drive();

}
