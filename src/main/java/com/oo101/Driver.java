package com.oo101;

public class Driver {
    private Vehicle vehicleType;

    public Driver(Vehicle vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String speedUp(){
        return vehicleType.speedUp();
    }
}
