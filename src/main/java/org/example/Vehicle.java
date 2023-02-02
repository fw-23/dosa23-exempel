package org.example;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {
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

