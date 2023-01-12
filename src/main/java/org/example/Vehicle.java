package org.example;

public abstract class Vehicle {
    String name;
    public Vehicle(String name) {
        this.name = name;
    }

    public void soundWarning() {
        System.out.println("warning!!");
    }

    public String getName() {
        return name;
    }

}

