package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        Customer customer = new Customer(2000);

        // ArrayList
        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(new Bike("Kona", 500));
        bikeShop.addBike(new Bike("Bianchi", 700));
        bikeShop.addBike(new Bike("Insera", -200));
        //System.out.println(bikeShop.getBikes());
        System.out.println("Våra cyklar:");
        for (int i = 0; i < bikeShop.getBikes().size(); i++) {
            System.out.printf("%d: %s - %.2f\n",
                    i+1,
                    bikeShop.getBike(i).getName(),
                    bikeShop.getBike(i).getPrice());
        }

        while (true) {
            System.out.printf("Du har %.2f €\n", customer.getFunds());
            System.out.printf("Vilken cykel vill du köpa? (1-%d) ", bikeShop.getBikes().size());

            try {
                int userInput = Integer.parseInt(intInput.nextLine());
                Bike chosenBike = bikeShop.getBike(userInput-1);
                customer.buyBike(chosenBike);
                System.out.printf("Grattis, du äger nu en %s\n", chosenBike.getName());
                System.out.printf("Du har %.2f € kvar\n", customer.getFunds());
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("En sådan cykel finns inte, försök igen!");
            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal, försök igen!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Försök igen!");
            }
        }


    }
}