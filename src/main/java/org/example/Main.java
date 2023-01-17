package org.example;

import java.util.Scanner;

public class Main {

    static final double GAME_VERSION = 1.0;

    public static void main(String[] args) {

        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);


        // HashMap
        ShirtShop sShop = new ShirtShop();
        sShop.addShirt("gant", new Shirt("Gant shirt", 150));
        sShop.addShirt("dressman", new Shirt("Dressman shirt", 30));
        sShop.addShirt("a&f", new Shirt("Abercrombie & Fitch", 45));
        // Listan genereras med StringBuilder i ShirtShop
        System.out.println(sShop.shirtList());

        String shirtKey = strInput.nextLine(); // nextLine för att ta emot text
        System.out.printf("Grattis, du äger nu en %s\n", sShop.getShirts().get(shirtKey).getBrand());


        System.out.println("\n");

        // ArrayList
        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(new Bike("Kona", 500));
        bikeShop.addBike(new Bike("Bianchi", 700));
        bikeShop.addBike(new Bike("Insera", 200));
        bikeShop.addBike(new Bike("Nishiki", 399.5));
        //System.out.println(bikeShop.getBikes());
        System.out.println("Våra cyklar:");
        for (int i = 0; i < bikeShop.getBikes().size(); i++) {
            System.out.printf("%d: %s - %.2f\n",
                    i+1,
                    bikeShop.getBike(i).getName(),
                    bikeShop.getBike(i).getPrice());
        }
        System.out.printf("Vilken cykel vill du köpa? (1-%d)", bikeShop.getBikes().size());
        int chosenBike = intInput.nextInt();
        System.out.printf("Grattis, du äger nu en %s\n",
                bikeShop.getBike(chosenBike-1).getName());


        System.out.println("\n\n");
        System.out.println(GAME_VERSION);

        // Array, kan inte få nya värden
        String[] minaBilar = { "Toyota", "WV", "Tesla" };

        // Klassvariabler
        Car bil1 = new Car("Toyota");
        System.out.println(bil1.getName() + " är bil nummer " + bil1.getCarsCreated());
        Car bil2 = new Car("VW");
        System.out.printf("%s är bil nummer %d\n", bil2.getName(), bil2.getCarsCreated());

        Car bil3 = new Car("Tesla");
        String carInfo = String.format("%s är bil nummer %d\n", bil3.getName(), bil3.getCarsCreated());
        System.out.println(carInfo);

        // Vi kan instansiera en klass med dess default-konstuktor
        MinKlass minKlass = new MinKlass();


    }
}