package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        int bobSalary = 57000;
        int garySalary = 64000;
        int highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The higher salary is " + highestSalary);

        int carPrice = 23000;
        int truckPrice = 63000;
        int lowestPrice;

        lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);

        double radius = 7.25;
        double area = radius * radius * Math.PI;

        System.out.println("The area of the circle is " + area);

        double variableOne = 5.0;
        double squareRoot;

        squareRoot = Math.sqrt(variableOne);
        System.out.println("The square root is " + squareRoot);

        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1,2)+ Math.pow(y2-y1,2));

        System.out.println("The distance is " + distance);

        double negativeValue = -3.8;
        double absValue = Math.abs(negativeValue);

        System.out.println("The absolute value is " + absValue);

        double mysteryNum = Math.random();

        System.out.println("The random number is " + mysteryNum);
    }

}
