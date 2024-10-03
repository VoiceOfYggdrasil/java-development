package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone();

        System.out.println("\nEnter info for first phone: ");


        System.out.print("\nWhat is the serial number? ");
        int serialNumber = scanner.nextInt();
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);


        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);


        //============================================================
        System.out.println("\nEnter info for second phone: ");

        System.out.print("\nWhat is the serial number? ");
        int serialNumber2 = scanner.nextInt();
        cellPhone2.setSerialNumber(serialNumber2);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model2 = scanner.nextLine();
        cellPhone2.setModel(model2);

        System.out.print("Who is the carrier? ");
        String carrier2 = scanner.nextLine();
        cellPhone2.setCarrier(carrier2);

        System.out.print("What is the phone number? ");
        String phoneNumber2 = scanner.nextLine();
        cellPhone2.setPhoneNumber(phoneNumber2);

        System.out.print("Who is the owner of the phone? ");
        String owner2 = scanner.nextLine();
        cellPhone2.setOwner(owner2);


        cellPhone2.setSerialNumber(serialNumber2);
        cellPhone2.setModel(model2);
        cellPhone2.setCarrier(carrier2);
        cellPhone2.setPhoneNumber(phoneNumber2);
        cellPhone2.setOwner(owner2);

        scanner.close();

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        cellPhone3.phoneOverload(123123123, "Smasnug", "AT&T",
                "4125801077", "Aaron");
        display(cellPhone3);

        //System.out.println("\n" + cellPhone1.getOwner()
        //        + "'s phone is calling " + cellPhone1.getDial());
    }

    public static void display(CellPhone phone) {
        System.out.println("\nPhone Details\n");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Phone Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner Name: " + phone.getOwner());
    }
}
