package com.pluralsight;

public class SemiTruck extends Vehicle{
    private String cargo;
    private boolean hasTailer;
    private float cargoWeight;

    public SemiTruck(String color, int numberOfPassenger, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, String cargo, boolean hasTailer, float cargoWeight) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity, vehicleType, isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.cargo = cargo;
        this.hasTailer = hasTailer;
        this.cargoWeight = cargoWeight;
    }

    public SemiTruck(){}

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isHasTailer() {
        return hasTailer;
    }

    public void setHasTailer(boolean hasTailer) {
        this.hasTailer = hasTailer;
    }

    public float getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(float cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

}
