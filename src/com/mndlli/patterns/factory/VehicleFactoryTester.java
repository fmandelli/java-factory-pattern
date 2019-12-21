package com.mndlli.patterns.factory;

public class VehicleFactoryTester {
    
    public static void main (String[] args) {
        
        VehicleFactory factory = new VehicleFactory();
        
        Vehicle v1 = factory.build(VehicleType.CAR);
        Vehicle v2 = factory.build(VehicleType.MOTORCYCLE);
        Vehicle v3 = factory.build(VehicleType.TRUCK);
        
        System.out.println(v1.getType());
        v1.drive();
        
        System.out.println(v2.getType());
        v2.drive();
        
        System.out.println(v3.getType());
        v3.drive();
        
    }

}
