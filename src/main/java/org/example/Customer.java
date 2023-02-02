package org.example;

import java.io.Serializable;

public class Customer implements Serializable {
    double funds;
    Bike currentBike;

    public Customer(double funds) {
        this.funds = funds;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public Bike getCurrentBike() {
        return currentBike;
    }

    // metod som köper cykel, dvs minskar kundens
    // medel med cykelns pris
    public void buyBike(Bike bike) {
        if (bike.getNetPrice() < 0) {
            throw new IllegalArgumentException("Cykelns pris måste vara positivt");
        }
        setFunds(funds - bike.getNetPrice());
        currentBike = bike;
    }


}
