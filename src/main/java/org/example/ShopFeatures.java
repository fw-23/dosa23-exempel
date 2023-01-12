package org.example;

public interface ShopFeatures {

    double getPrice();

    default String getCondition() {
        return "Brand new";
    }
}
