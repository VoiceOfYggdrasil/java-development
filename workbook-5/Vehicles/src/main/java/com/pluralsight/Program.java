package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        Moped slowBoi = new Moped();
        Car doorBoi = new Car();
        SemiTruck longBoi = new SemiTruck();
        Hovercraft hoverBoi = new Hovercraft();

        slowBoi.setColor("Blue");
        slowBoi.setFuelCapacity(5);
        slowBoi.ride();

        doorBoi.setNumberOfPassengers(3);
        doorBoi.setNumberOfDoors(4);
        doorBoi.openTrunk();

        longBoi.setCargoCapacity(5000);
        longBoi.setModel("Mack");
        longBoi.loadCargo();

        hoverBoi.setColor("Purple");
        hoverBoi.setTopSpeed(35);
        hoverBoi.hover();

        System.out.println("Color of the Moped: " + slowBoi.getColor());
        System.out.println("Number of Car passengers: " + doorBoi.getNumberOfPassengers());
        System.out.println("Cargo capacity of Semi Truck: " + longBoi.getCargoCapacity());
        System.out.println("Top speed of Hovercraft: " + hoverBoi.getTopSpeed());
    }
}
