package com.pluralsight;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {

        Date localTime = new Date();
        LocalDateTime today = LocalDateTime.now();
        DateFormat timeDate1 = new SimpleDateFormat("E. MMM dd, yyyy HH:mm");
        DateTimeFormatter slashFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //DateFormat s = new SimpleDateFormat("dd/MM/yyyy" + " " + " HH:mm:ss");

        timeDate1.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println("Local Time: " + localTime + "\n");
        System.out.println("Time in GMT: " + timeDate1.format(localTime));
        System.out.println();

//        SimpleTimeZone today = SimpleTimeZone.now();
//        System.out.println("Today is: " + today);
//
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("E. MMM dd, yyyy HH:mm:ss");
//
//        String formattedDate = today.format(format);
//        System.out.println("Today is: " + formattedDate);

    }
}
