package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringsToDates {

    public static void main(String[] args) {

        //string representation of a date
        String aDate = "10/17/2022";

        //what is the format of the string date I am trying to use
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //use LocalDate.parse to turn the string date into a
        //LocalDateTime object
        LocalDate birthDay = LocalDate.parse(aDate, formatter);

        System.out.println(birthDay);

        //string representation of a date
        String myDate = "Aug-17-2026";

        //what is the format of the string date I am trying to use
        DateTimeFormatter formatterNew = DateTimeFormatter.ofPattern("MMM-d-yyyy");

        //use LocalDate.parse to turn the string date into a
        //LocalDateTime object
        LocalDate myDay = LocalDate.parse(myDate, formatterNew);

        System.out.println(myDay);


    }

}
