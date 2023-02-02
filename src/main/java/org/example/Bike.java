package org.example;

import java.io.Serializable;
import java.util.Random;

public class Bike extends Vehicle implements ShopFeatures, Serializable {

    double price;
    public Bike(String name, double price) {
        // vi anropar Vehicle-klassens konstruktor
        super(name);
        setPrice(price);
    }

    // Överskuggning
    @Override
    public void soundWarning() {
        System.out.println("Pling pling!");
    }

    @Override
    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

}
