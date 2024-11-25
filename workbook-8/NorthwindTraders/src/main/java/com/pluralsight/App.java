package com.pluralsight;

import java.sql.*;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "P@ssw0rd"
        );

        Statement statement = connection.createStatement();

        String query = "SELECT ProductName FROM products";

        ResultSet results = statement.executeQuery(query);

        while (results.next()) {
            String product = results.getString("ProductName");
            System.out.println(product);
        }

        connection.close();
    }
}
