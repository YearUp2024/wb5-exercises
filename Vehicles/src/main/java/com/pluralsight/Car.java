package com.pluralsight;

public class Car extends Vehicle{
    private String trunkContents;

    public Car(String color, int numberOfPassenger, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, String trunkContents) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity, vehicleType, isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.trunkContents = trunkContents;
    }

    public Car(){};

    public String getTrunkContents() {
        return trunkContents;
    }

    public void setTrunkContents(String trunkContents) {
        this.trunkContents = trunkContents;
    }
}
