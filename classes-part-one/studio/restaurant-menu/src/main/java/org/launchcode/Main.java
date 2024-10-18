package org.launchcode;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Menu menu = new Menu();


    //boolean isNew, String category, String name, double price, String description

    MenuItem menuItem1 = new MenuItem(true,  "taco", "3.99", "Tasty taco");
    MenuItem menuItem2 = new MenuItem(true,"hot wings", "6.99", "Buffalo style chicken wings");
    MenuItem menuItem3 = new MenuItem(false,  "pasta", "9.99", "very tasty pasta");
    MenuItem menuItem4 = new MenuItem(false, "ice cream", "6.33", "Chocolate Flavoured");
MenuItem menuItem = new MenuItem("APPETIZER");
    System.out.println(menuItem.getCategory());

    menu.addNewItem(menuItem1);
    menu.addNewItem(menuItem2);
    menu.addNewItem(menuItem3);
    menu.addNewItem(menuItem4);

    System.out.println(menu.getMenuList());
  }
}