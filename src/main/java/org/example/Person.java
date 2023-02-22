package org.example;

import java.util.Random;

public class Person implements Comparable<Person> {
    private String name;
    int age = 20;
    Random rnd = new Random();

    int nameRank;

    public Person(String name, int nameRank) {
        this.name = name;
        this.nameRank = nameRank;
    }

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

    public Object getRank() {
        return nameRank;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // vi ska sortera enligt namn
        // jämför this.namn med otherPerson's name
        return name.compareTo(otherPerson.getName());
    }
}
