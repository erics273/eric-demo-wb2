package com.pluralsight;

import java.util.Scanner;

public class StringBuilderExample {

    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // create a StringBuillder object
        StringBuilder mySkills = new StringBuilder();

        mySkills.append("HTML, ");
        mySkills.append("Bad dad jokes, ");
        mySkills.append("Giving Gabe a hard time, ");
        mySkills.append("java ");

        System.out.print("type a new skill: ");

        String theAnswer =  theScanner.nextLine();

        mySkills.append(theAnswer);

        System.out.println(mySkills.toString());


    }

}
