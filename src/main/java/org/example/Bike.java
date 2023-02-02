package org.example;

import java.io.Serializable;
import java.util.Random;

public class Bike extends Vehicle implements ShopFeatures, Serializable {

    double price;
    DiscountCategory discountCategory;

    public Bike(String name, double price, DiscountCategory discountCategory) {
        // vi anropar Vehicle-klassens konstruktor
        super(name);
        setPrice(price);
        this.discountCategory = discountCategory;
    }
    public Bike(String name, double price) {
        // vi anropar Vehicle-klassens konstruktor
        super(name);
        setPrice(price);
        discountCategory = DiscountCategory.NEW;
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

    public double getNetPrice() {
        double netPrice;

        switch (discountCategory) {
            case RETURNED:
                netPrice = price * 0.8;
                break;
            case DEMO:
                netPrice = price * 0.9;
                break;
            default:
                netPrice = price;
                break;
        }

        return netPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DiscountCategory getDiscountCategory() {
        return discountCategory;
    }
}
