package com.pluralsight;

public class Room {
    private int numOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numOfBeds, double price) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public void checkIn() {
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true;
        }
    }

    public void checkOut() {
        isOccupied = false;
    }

    public void cleanRoom() {
        if (!isOccupied) {
            isDirty = false;
        }
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
}
