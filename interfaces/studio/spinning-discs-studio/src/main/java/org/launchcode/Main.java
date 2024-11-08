package org.launchcode;

public class Main {
    public static void main(String[] args) {
BaseDisc myDvd = new DVD("dead pool",220,700,"Deadpool & Wolverine");
BaseDisc myCd = new CD("Ironman",330,900,"Adventure");

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myDvd.spinDisc();
        myDvd.sayType();
        myDvd.remainingSpace();
        myCd.spinDisc();
        myCd.sayType();


    }
}