package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);


        // ArrayList
        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(new Bike("Kona", 500));
        bikeShop.addBike(new Bike("Bianchi", 700));
        //System.out.println(bikeShop.getBikes());
        System.out.println("Våra cyklar:");
        for (int i = 0; i < bikeShop.getBikes().size(); i++) {
            System.out.printf("%d: %s - %.2f\n",
                    i+1,
                    bikeShop.getBike(i).getName(),
                    bikeShop.getBike(i).getPrice());
        }

        while (true) {
            System.out.printf("Vilken cykel vill du köpa? (1-%d) ", bikeShop.getBikes().size());

            try {
                String chosenBike = intInput.nextLine();
                System.out.printf("Grattis, du äger nu en %s\n",
                        bikeShop.getBike(Integer.parseInt(chosenBike) - 1).getName()
                );
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("En sådan cykel finns inte, försök igen!");
            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal, försök igen!");
            } catch (Exception e) {
                System.out.println("Någonting gick fel, försök igen!");
            }
        }



        //CCRandomRundown.generator();


        Random rnd = new Random();
        System.out.printf("Slumptal 100-199: %d\n", rnd.nextInt(99)+100);


        // Code Challenge "Testing Overload"
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(2, 2));
        System.out.println(calc.multiply(10, 20, 100));

    }
}