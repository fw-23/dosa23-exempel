package org.example;

public class Customer {
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
    // metod som köper cykel, dvs minskar kundens
    // medel med cykelns pris
    public void buyBike(Bike bike) {
        if (bike.getPrice() < 0) {
            throw new IllegalArgumentException("Cykelns pris måste vara positivt");
        }
        setFunds(funds - bike.getPrice());
        currentBike = bike;
    }
}
