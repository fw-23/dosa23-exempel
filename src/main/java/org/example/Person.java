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
        age = rnd.nextInt(100);
    }
    public Person(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return nameRank;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // vi ska sortera enligt namn
        // jämför this.namn med otherPerson's name
        return name.compareTo(otherPerson.getName());

        // Om vi vill jämföra enligt heltalsfältet:
        //return age - otherPerson.getAge();
    }
}
