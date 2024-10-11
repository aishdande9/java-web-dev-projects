package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d) {
        this.lastUpdated = d;
        this.items = new ArrayList<>();
    }

    //public void setLastUpdated(Date lastUpdated) {
        //this.lastUpdated = lastUpdated;
    //
    // }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addMenuItem(MenuItem menuItem){
           this.items.add(menuItem);

    }

    public void removeMenuItems(MenuItem menuItem){
        this.items.remove(menuItem);

    }



}


