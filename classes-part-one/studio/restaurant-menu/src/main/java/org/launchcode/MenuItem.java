package org.launchcode;

public class MenuItem {

    private boolean isNew;
    private String category;
    private String name;
    private double price;
    private String description;

    public MenuItem(boolean isNew, String name, String price, String description) {
        this.isNew = isNew;
        this.name = name;
        this.price = Double.parseDouble(price);
        this.description = description;
    }

    public MenuItem(String category) {
        this.category=category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MenuItem{" + (isNew ? "[NEW]" : "" )+
                "name='" + name + '\'' +
                ", price=$" + price +
                ", description='" + description + '\'' +
                '}';
    }
}



