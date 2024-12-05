package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Application needs two arguments to run: " +
                    "java com.pluralsight.Main <username> <password>");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        System.out.println("Enter the last name of the actor you want to find!");
        String lastName = scanner.nextLine();

        searchByLastName(dataSource);
    }

    private static void searchByLastName(DataSource dataSource, String lastName) {
        try {
            try (Connection connection = dataSource.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(
                         """
                                 SELECT first_name, last_name
                                 FROM actor
                                 WHERE last_name LIKE ?
                                 """);
                 preparedStatement.setString(1, lastName);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                System.out.println("Categories:");
                while (resultSet.next()) {
                    int categoryId = resultSet.getInt("CategoryID");
                    String categoryName = resultSet.getString("CategoryName");
                    System.out.println(categoryId + ": " + categoryName);
                }

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the category ID: ");
                int categoryId = scanner.nextInt();

            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
