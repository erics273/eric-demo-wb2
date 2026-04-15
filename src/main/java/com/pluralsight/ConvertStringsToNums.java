package com.pluralsight;

public class ConvertStringsToNums {


    public static void main(String[] args) {
        // string contains "id|description|quantity|price"
        String theString = "111|Hot Chocolate (12-count)|21|4.99";
        String[] theStringParts = theString.split("\\|");

        //get the id of the list
        int id = Integer.parseInt(theStringParts[0]);
        String description = theStringParts[1];
        int quantity = Integer.parseInt(theStringParts[2]);
        double price = Double.parseDouble(theStringParts[3]);
    }

}
