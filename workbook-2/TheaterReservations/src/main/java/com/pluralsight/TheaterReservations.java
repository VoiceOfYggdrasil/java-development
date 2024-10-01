package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("What date will you be coming (MM/DD/YYYY): ");
        String date = scanner.nextLine();
        System.out.print("Enter ticket quantity: ");
        int ticketNum = scanner.nextInt();

        DateTimeFormatter formatter;

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate eventDate = LocalDate.parse(date, formatter);


        int spaceIndex = name.indexOf(' ');

        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);

        String ticketMessage = "";

        if (ticketNum < 2) {
            ticketMessage = "ticket ";
        } else {
            ticketMessage = "tickets ";
        }

        System.out.print(ticketNum + " " + ticketMessage + "reserved for " +
                eventDate + " under " + lastName + ", " + firstName);

    }
}
