package com.jorey.mytask.proxy;


public class RealVehicle implements VehicleObject {
    @Override
    public void doSomething() {
        System.out.println("realVehicle do something");
    }
}
