package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :");
        int length = scr.nextInt();
        System.out.println("Enter the width of the rectangle");
        int width = scr.nextInt();
       int  AreaOfRectangle = length*width;
        System.out.println("Area of the rectangle is :"+AreaOfRectangle);

    }
}
