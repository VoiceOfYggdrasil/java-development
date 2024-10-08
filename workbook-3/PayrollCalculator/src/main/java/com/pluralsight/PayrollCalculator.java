package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) throws IOException {

        String fileName = "employees.csv";

        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(fileName));
            String input;
            while ((input = buffReader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());

            }
            buffReader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
        }
    }
}
