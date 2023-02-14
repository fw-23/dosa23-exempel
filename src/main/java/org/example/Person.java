package org.example;


import java.util.Random;

public class Person {
    private String name;
    int age;
    Random rnd = new Random();
    public Person(String name) {
        this.name = name;
        age = rnd.nextInt(100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
