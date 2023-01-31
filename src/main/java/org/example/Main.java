package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Object swapping example
        // Alla objekt har superklassen som typ.
        Vehicle myCar, myBike, todaysVehicle, tomorrowsVehicle, tempVehicle;

        myCar = new Car("Bil");
        myBike = new Bike("Cykel");

        todaysVehicle = myBike;     // initialvärde Bike
        tomorrowsVehicle = myCar;   // initialvärde Car

        for (int i = 0; i < 4; i++) {  // (for-loop bara för exemplets skull)

            System.out.printf("I dag åker jag %s, i morgon åker jag %s.\n",
                    todaysVehicle.getName(),
                    tomorrowsVehicle.getName());

            // SWAP
            // Eftersom både Bike och Bil har samma superklass går det att swappa mellan dem
            tempVehicle = todaysVehicle;        // Dagens sparas i temporär variabel
            todaysVehicle = tomorrowsVehicle;   // Byt dagens till morgondagens
            tomorrowsVehicle = tempVehicle;     // Sätt temporära värdet till morgondagens

        }

    }
}