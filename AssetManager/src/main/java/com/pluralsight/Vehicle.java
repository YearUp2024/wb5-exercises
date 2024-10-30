package com.pluralsight;

import java.time.Year;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(){}

    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public Vehicle(String description, String dataAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dataAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        double valueOfCarOverYEar = 0;

        Year year1 = Year.now();

        int currentYear = year - year1.getValue();

        if(currentYear <= 3){
            valueOfCarOverYEar -= valueOfCarOverYEar * 0.03 * currentYear;
        }else if(currentYear <= 6){
            valueOfCarOverYEar -= valueOfCarOverYEar * 0.03 * currentYear;
            valueOfCarOverYEar -= valueOfCarOverYEar * 0.06 * currentYear;
        }else if(currentYear <= 10){
            valueOfCarOverYEar -= valueOfCarOverYEar * 0.03 * currentYear;
            valueOfCarOverYEar -= valueOfCarOverYEar * 0.06 * currentYear;
            valueOfCarOverYEar -= valueOfCarOverYEar * 0.08 * (currentYear - 6);
        }else{
            valueOfCarOverYEar = 1000.00;
        }

        if(odometer > 100000 && !(makeModel.equalsIgnoreCase("Honda") || makeModel.equalsIgnoreCase("Toyota"))){
            valueOfCarOverYEar *= 0.75;
        }
        return valueOfCarOverYEar;
    }
}
