package com.mndlli.patterns.factory;

public class VehicleFactory {
    
    public Vehicle vehicle = null;
    
    public Vehicle build(VehicleType type) {
        
        switch (type) {
        case CAR:
            vehicle = new Car();
            break;
            
        case MOTORCYCLE:
            vehicle = new MotorCycle();
            break;

        case TRUCK:
            vehicle = new Truck();
            break;
        
        default:
            break;
        }
        
        return vehicle;        
    }

}
