package com.pluralsight;

public class Moped extends Vehicle{
    private boolean hasPedals;
    private String userSeatStorage;

    public Moped(String color, int numberOfPassenger, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, boolean hasPedals, String userSeatStorage) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity, vehicleType, isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.hasPedals = hasPedals;
        this.userSeatStorage = userSeatStorage;
    }

    public Moped(){};

    public String getUserSeatStorage() {
        return userSeatStorage;
    }

    public void setUserSeatStorage(String userSeatStorage) {
        this.userSeatStorage = userSeatStorage;
    }

    public boolean getPedals(){
        return hasPedals;
    }

    public void setHasPedals(){
        this.hasPedals = hasPedals;
    }
}
