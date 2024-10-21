package com.pluralsight;

public class Room {
    private int numOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setIsDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }
}
