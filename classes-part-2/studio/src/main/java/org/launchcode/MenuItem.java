package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String toString(){
        return "{"+"price :"+this.price+","+"category :"+this.category+","+"description:"+this.description+"}"+(isNew?"[NEW]":"");
    }


    @Override
    public boolean equals(Object comparedToBe) {
        if (this == comparedToBe) return true;
        if (comparedToBe == null || getClass() != comparedToBe.getClass()) return false;
        MenuItem menuItem = (MenuItem) comparedToBe;
        return Double.compare(price, menuItem.price) == 0  && Objects.equals(description, menuItem.description);
    }



}

