package org.launchcode;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("please enter the no of miles they have driven :");
        double noOfMiles = scr.nextDouble();
        System.out.println("please enter amount of gas they consumed");
         double amountOfGas = scr.nextDouble();

        double milesPerGallon = noOfMiles/amountOfGas;
        System.out.println("Miles Per Gallon is : "+milesPerGallon);
    }
}
