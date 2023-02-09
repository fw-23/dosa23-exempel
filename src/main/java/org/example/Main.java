package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] dwarves = {"Fili", "Kili", "Balin", "Dwalin", "Ori", "Nori", "Dori", "Gloin", "Oin", "Bifur", "Bofur", "Bombur", "Thorin"};

        StringArray names = new StringArray(dwarves);
        System.out.println(names);
        names.add("Bilbo");
        System.out.println(names);

        names.add(0, "Gandalf");
        System.out.println(names);

        names.add(10, "Gimli");
        System.out.println(names);


        System.exit(0);

        new BigO();


    }
}