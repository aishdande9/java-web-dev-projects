package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem appetizer = new MenuItem(6.99,"taco","appetizer",true);
        MenuItem mainCourse = new MenuItem(9.33,"pasta","maincourse",false);
    appetizer.setCategory("soups");



        Menu menu = new Menu(new Date());
        System.out.println(menu.getLastUpdated());
        menu.addMenuItem(appetizer);
        menu.addMenuItem(mainCourse);
        System.out.println(menu.getItems());
        menu.removeMenuItems(appetizer);
        System.out.println(menu.getItems());


    }

}
