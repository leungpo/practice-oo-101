package com.oo101;

public class Car extends Vehicle{

    public Car(String name, int speed) {
        super(name, speed);
    }
    public Car(String name, GasolineEngine gasolineEngine) {
        super(name, gasolineEngine.getSpeed());
    }
}
