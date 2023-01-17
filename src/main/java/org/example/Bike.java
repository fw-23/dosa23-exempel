package org.example;

public class Bike extends Vehicle implements ShopFeatures {

    double price;
    public Bike(String name, double price) {
        // vi anropar Vehicle-klassens konstruktor
        super(name);
        this.price = price;
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
}
