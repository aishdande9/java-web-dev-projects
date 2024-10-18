package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {

    private List<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addNewItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
        this.lastUpdated = new Date();
    }

    public boolean getMenuList() {
        System.out.println("Menu Last Updated: "+lastUpdated);
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
