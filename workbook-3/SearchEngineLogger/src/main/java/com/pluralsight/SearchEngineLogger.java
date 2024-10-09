package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    private static final String LOG_FILE_NAME = "logs.txt";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        logAction("Launch");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a term to search (X to exit): ");
            String searchTerm = scanner.nextLine();

            if ("X".equalsIgnoreCase(searchTerm)) {
                logAction("Exit");
                break;
            } else {
                logAction("Search : " + searchTerm);
            }
        }

        scanner.close();

    }

    private static void logAction(String action) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_NAME, true));
            writer.write(FORMATTER.format(LocalDateTime.now()) + " " + action);
            writer.newLine();

            writer.close();
        } catch (Exception ex) {
            System.err.println("Error writing to the log file: " + ex.getMessage());
        }
    }


}
