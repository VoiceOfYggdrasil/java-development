package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, double price, int numOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        return price * numOfNights;
    }
}
