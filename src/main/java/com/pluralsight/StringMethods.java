package com.pluralsight;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        //escaping quotes if you want them to appear in your string output
        String welcome = "Big Tex says \"Howdy\"!";
        System.out.println(welcome);

        //print out the string's length
        System.out.println("the length of the string is: " + welcome.length() );

        //using trim
        String username = "   danaw    ";
        System.out.println(username.trim().toUpperCase().length());

        //startsWith
        String discountCode = "FAIR-15OFF";
        if ( discountCode.startsWith("FAIR") ) {
            System.out.println("found fair");
        }

        //product code with a -
        String productCode = "ACME-12213";

        //figure out the position of the -
        int dashPosition = productCode.indexOf("-");

        System.out.println(dashPosition);

        //use the postion of the dash to find what comes before it
        String vendor = productCode.substring(0, dashPosition);
        System.out.println(vendor);
        String productNum = productCode.substring(dashPosition + 1);
        System.out.println(productNum);

        //working with split
        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split("\\|");
        System.out.println(input);
        System.out.println(Arrays.toString(cities));
        //print out just Dallas
        System.out.println(cities[0]);
        //print out just ft worth
        System.out.println(cities[1]);
        //print out just Dallas
        System.out.println(cities[2]);




    }

}
