package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setElectric(true);
        hovercraft.setNumberOfPassenger(6);
        hovercraft.setHoverHeight(2f);

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setElectric(false);
        semiTruck.setGasoline(true);
        semiTruck.setHasTailer(true);

        Vehicle vehicle = new Vehicle();
        vehicle.getSpeedMax();
    }
}
