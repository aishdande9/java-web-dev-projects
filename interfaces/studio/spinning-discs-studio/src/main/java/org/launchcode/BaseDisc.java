package org.launchcode;

public abstract class BaseDisc implements OpticalDisc {
    private String name;
    private int storageCapacity;
    private String title;


    private int space;

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    private String diskType;

    public BaseDisc(String name, int space, int storageCapacity, String title,String diskType) {
        this.name = name;
        this.space = space;
        this.storageCapacity = storageCapacity;
        this.title = title;
        this.diskType=diskType;
    }


    public abstract void sayType();




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSpace() {
        return space;
    }

    public void remainingSpace() {
        int actualSpace = this.getSpace();
        int remainingSpace = this.getStorageCapacity()-actualSpace;
        System.out.println("remaining space for"+remainingSpace);

    }




}
