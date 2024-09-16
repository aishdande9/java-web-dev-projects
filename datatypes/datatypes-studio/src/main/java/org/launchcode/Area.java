package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

    System.out.println("Enter the radius :");


       double radius  = scr.nextDouble();


    while(radius<=0) {
        System.out.println("please enter the right number");
       radius = scr.nextDouble();
    }
        System.out.println("this is the right number");
    double areaOfCircle = Circle.getArea(radius);
        System.out.println("Area of circle is :" + areaOfCircle);

    }
}
