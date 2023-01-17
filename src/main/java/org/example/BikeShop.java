package org.example;

import java.util.ArrayList;

public class BikeShop {

    private ArrayList<Bike> bikes = new ArrayList<>();

    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    public Bike getBike(int index) {
        return bikes.get(index);
    }
}
