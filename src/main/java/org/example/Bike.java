package org.example;

public class Bike extends Vehicle implements ShopFeatures {

    public Bike(String name) {
        // vi anropar Vehicle-klassens konstruktor
        super(name);
    }

    // Överskuggning
    @Override
    public void soundWarning() {
        System.out.println("Pling pling!");
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
