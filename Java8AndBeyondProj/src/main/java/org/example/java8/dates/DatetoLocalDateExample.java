package org.example.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DatetoLocalDateExample {

    public static void main(String[] args) {

        /**
         *  java.util.Date to LocalDate and vice versa
         */

        Date date = new Date();
        System.out.println("converted Local Date : "+ date.toInstant().atZone(ZoneId.of("Asia/Kolkata")).toLocalDateTime());
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate = LocalDate.now();
        Date date1 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("java.util.date is : " + date1);


        /**
         *  LocalDate to java.sql.Date
         */

        java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println("java.sql.date is : " + date2);


        LocalDate localDate2 = date2.toLocalDate();
        System.out.println("converted Local Date : " + localDate2);

    }
}
