package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter # of hours worked: ");
        double hours = scanner.nextDouble();

        System.out.print("Please enter your pay rate: ");
        double rate = scanner.nextDouble();

        double grossPay = hours * rate;

        if (hours > 40) {
            double overtime = 1.5 * rate * (hours - 40);
            System.out.println(name + ", you've worked more than 40 hours. " +
                    "Your adjusted gross pay is: " + (grossPay + overtime));
        }
        else
            System.out.println(name + ", your gross pay is: " + grossPay);

    }
}
