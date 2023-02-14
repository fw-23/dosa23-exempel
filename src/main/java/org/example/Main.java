package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] dwarves = {"Fili", "Kili", "Balin", "Dwalin", "Ori", "Nori", "Dori", "Gloin", "Oin", "Bifur", "Bofur", "Bombur", "Thorin"};


        Queuey queuey = new Queuey(5);
        queuey.enQueue("A");
        queuey.enQueue("B");
        queuey.enQueue("C");
        queuey.enQueue("D");
        queuey.enQueue("E");
        System.out.println(queuey.toString());
        queuey.enQueue("F");
        System.out.println(queuey.toString());
        System.exit(0);

        // Code Challenge
        new CC_CircularArr();
        System.exit(0);

        Stacky stacky = new Stacky(3);
        stacky.push(dwarves[2]);
        System.out.println(stacky.toString());
        stacky.push(dwarves[3]);
        System.out.println(stacky.toString());
        stacky.push(dwarves[4]);
        System.out.println(stacky.toString());
        //ERROR: stacky.push(dwarves[5]);

        System.out.println("pop: " + stacky.pop());
        System.out.println(stacky.toString());
        System.out.println("pop: " + stacky.pop());
        System.out.println(stacky.toString());
        System.out.println("pop: " + stacky.pop());
        // ERROR: System.out.println("pop: " + stacky.pop());


        System.exit(0);


        Person person = new Person(dwarves[2]);
        System.out.println(person.getName());

        Linky linky = new Linky();
        for (int i = 0; i < dwarves.length; i++) {
            linky.add(new Person(dwarves[i]));
        }

        System.out.printf("Det finns %d noder i linky\n",
                    linky.size()
                );
        System.out.println(linky.toString());


        System.exit(0);

        /**
         *  StringArray
         */
        StringArray names = new StringArray(dwarves);
        System.out.println(names);
        names.add("Bilbo");
        System.out.println(names);

        names.add(0, "Gandalf");
        System.out.println(names);

        names.add(10, "Gimli");
        System.out.println(names);

        /**
         *  CODE CHALLENGE The Reversal
         */
        names.reverse();
        System.out.println(names); // Nu kommer namnen i omvänd ordning

        System.exit(0);

        /**
         * BigO
         */
        new BigO();


    }
}