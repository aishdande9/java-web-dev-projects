package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{


    public CD(String name, int space, int storageCapacity, String title) {
        super(name, space, storageCapacity, title);
    }

    @Override
    public void sayType() {
        System.out.println("This is CD Type");
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void remainingSpace() {

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
