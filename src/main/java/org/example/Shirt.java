package org.example;

public class Shirt extends Clothing implements ShopFeatures {
    private String brand;
    private double price;

    // Överlagring - overload
    public Shirt(String brand) {
        this.brand = brand;
    }
    public Shirt(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    void mend() {
        super.condition = 100;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
