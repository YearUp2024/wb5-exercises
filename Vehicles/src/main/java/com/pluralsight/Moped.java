package com.pluralsight;

public class Moped extends Vehicle{
    private boolean hasPedals;
    private String userSeatStorage;

    public Moped(boolean hasPedals, String userSeatStorage) {
        this.hasPedals = hasPedals;
        this.userSeatStorage = userSeatStorage;
    }

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
