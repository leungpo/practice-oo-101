package com.oo101;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Cool Car",new GasolineEngine());
        Vehicle truck = new Truck("Big Truck",10);
        Driver driver1 = new Driver(car);
        Driver driver2 = new Driver(truck);
        System.out.println(driver1.speedUp());
        System.out.println(driver2.speedUp());
//        car.speedUp();
//        truck.speedUp();
    }
}
