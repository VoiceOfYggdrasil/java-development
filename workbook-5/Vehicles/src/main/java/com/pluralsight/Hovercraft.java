package com.pluralsight;

public class Hovercraft extends Vehicle {
    private int airCushionPressure;

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public void hover() {
        System.out.println("Hover: Engaged.");
    }
}
