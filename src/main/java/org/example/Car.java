package org.example;

public class Car {

    // Instansvariabel
    private String name;

    // Konstruktormetod för klassen
    public Car(String name) {
        // Vi initialiserar instanvarabeln name med metodarumentet name
        this.name = name;
    }
    public String getName() {:
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
