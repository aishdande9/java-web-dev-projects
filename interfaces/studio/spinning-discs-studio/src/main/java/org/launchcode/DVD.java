package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {


    public DVD(String name, int space, int storageCapacity, String title) {
        super(name, space, storageCapacity, title);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

   

    @Override
    public void sayType() {
        System.out.println("This is DVD type");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
