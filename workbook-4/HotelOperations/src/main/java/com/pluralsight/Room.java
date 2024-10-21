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

    public boolean checkIn() {
        return isDirty && isOccupied;
    }

    public boolean checkOut() {
        if (!isOccupied){
            return cleanRoom();
        } else {
            return false;
        }
    }

    public boolean cleanRoom() {
        return !isDirty;
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
