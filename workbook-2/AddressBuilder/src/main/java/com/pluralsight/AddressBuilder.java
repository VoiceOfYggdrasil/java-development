package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

        StringBuilder address = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        //Gotta grab all the info first in this SKYSCRAPER of code.

        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String name = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billZip = scanner.nextLine();

        System.out.print("Shipping Street: ");
        String shipStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shipCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shipState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shipZip = scanner.nextLine();

        //Now we actually append the code.

        address.append(name).append("\n");

        address.append("\n");

        address.append("Billing Address:\n");
        address.append(billStreet).append("\n");
        address.append(billCity + ", " + billState + " " + billZip).append("\n");

        address.append("\n");

        address.append("Shipping Address:\n");
        address.append(shipStreet).append("\n");
        address.append(shipCity + ", " + shipState + " " + shipZip).append("\n");

        //MAY THE PRINTING COMMENCE.

        String addressFull = address.toString();
        System.out.println(addressFull);

    }
}
