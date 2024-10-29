package com.pluralsight;

public class Car extends Vehicle{
    private String trunkContents;

    public Car(String trunkContents) {
        this.trunkContents = trunkContents;
    }

    public String getTrunkContents() {
        return trunkContents;
    }

    public void setTrunkContents(String trunkContents) {
        this.trunkContents = trunkContents;
    }
}
