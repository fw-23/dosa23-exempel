package org.example;

import java.util.Random;

public class BikeFactory {

    public static Bike create(String name) {
        // smart logik som räknar ut rätt pris...
        Random rnd = new Random();
        double price = rnd.nextDouble(1000)+200;

        // returnera ett färdigt Bike-objekt!
        return new Bike(name, price);

    }
}
