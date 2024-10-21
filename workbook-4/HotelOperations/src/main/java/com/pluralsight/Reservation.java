package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;
        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.price = 124.00;
        }
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
        double totalPrice = price * numOfNights;

        if (isWeekend) {
            totalPrice *= 1.1;
        }
        return totalPrice;
    }
}
