package com.pluralsight;

public class SemiTruck extends Vehicle{
    private String cargo;
    private boolean hasTailer;
    private float cargoWeight;

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
