package com.pluralsight;

public class Vehicle {
    private String color;
    private int numberOfPassenger;
    private int cargoCapacity;
    private int fuelCapacity;
    private String vehicleType;
    private boolean isGasoline;
    private boolean isElectric;
    private boolean isManual;
    private float speedCurrent;

    public Vehicle(String color, int numberOfPassenger, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax) {
        this.color = color;
        this.numberOfPassenger = numberOfPassenger;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.vehicleType = vehicleType;
        this.isGasoline = isGasoline;
        this.isElectric = isElectric;
        this.isManual = isManual;
        this.speedCurrent = speedCurrent;
        this.speedMax = speedMax;
    }

    public float getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(float speedMax) {
        this.speedMax = speedMax;
    }

    public boolean isGasoline() {
        return isGasoline;
    }

    public void setGasoline(boolean gasoline) {
        isGasoline = gasoline;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public float getSpeedCurrent() {
        return speedCurrent;
    }

    public void setSpeedCurrent(float speedCurrent) {
        this.speedCurrent = speedCurrent;
    }

    private float speedMax;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public String getVehicleType(){
        return vehicleType;
    }
}
