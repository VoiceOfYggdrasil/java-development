package com.pluralsight;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What story would you like to read?\n");
        String storyChoice = input.nextLine().trim();

        try {
            FileInputStream fis = new FileInputStream(storyChoice);
            Scanner txtFile = new Scanner(fis);

            String contents;
            int lineCount = 1;

            while (txtFile.hasNextLine()) {
                contents = lineCount + ". " + txtFile.nextLine();
                System.out.println(contents);
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
