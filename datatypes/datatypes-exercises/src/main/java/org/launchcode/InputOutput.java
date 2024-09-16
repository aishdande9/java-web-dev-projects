package org.launchcode;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Hello , Please enter your name :");
        String name = scr.nextLine();

        System.out.println("Hello "+name);
    }
}

