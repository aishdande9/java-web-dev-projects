package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem appetizer = new MenuItem(6.99,"taco","appetizer",true);

        MenuItem mainCourse = new MenuItem(7.99,"pasta","maincourse",false);
        MenuItem dessert = new MenuItem(7.99,"ice-cream","dessert",true);
    appetizer.setCategory("soups");
        System.out.println("Appetizer :"+appetizer);


        Menu menu = new Menu(new Date());
        System.out.println(menu.getLastUpdated());
        menu.addMenuItem(appetizer);
        menu.addMenuItem(mainCourse);
        menu.addMenuItem(dessert);

        System.out.println(menu.getItems());
        menu.removeMenuItems(appetizer);
        System.out.println(menu.getItems());
        System.out.println(appetizer.equals(mainCourse));

    }

}
