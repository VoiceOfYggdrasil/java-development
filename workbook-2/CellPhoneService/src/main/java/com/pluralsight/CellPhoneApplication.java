package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();


        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        phone.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        phone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        phone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        phone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        phone.setOwner(owner);


        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        scanner.close();
        System.out.println("\nPhone Details\n");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Phone Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner Name: " + phone.getOwner());
    }
}
