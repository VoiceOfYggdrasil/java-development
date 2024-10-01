package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();
        System.out.println("================================================");

        String firstName = "";
        String middleName = "";
        String lastName = "";

        int firstSpaceIndex = fullName.indexOf(' ');

        if (firstSpaceIndex == -1) {
            System.out.println("Invalid Name Format!");
            return;
        } else {
            firstName = fullName.substring(0, firstSpaceIndex);

            fullName = fullName.substring(firstSpaceIndex).trim();

            int lastSpaceIndex = fullName.indexOf(' ');

            if (lastSpaceIndex == -1) {
                lastName = fullName;
            } else {
                middleName = fullName.substring(0, lastSpaceIndex);
                lastName = fullName.substring(lastSpaceIndex + 1);
            }
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + (middleName.isEmpty() ? "(none)" : middleName));
        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}
