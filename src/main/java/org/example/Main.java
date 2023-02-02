package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Customer customer;

        try {
            customer = (Customer) FileUtils.loadObject("customer.save");
        } catch (Exception e) {
            System.out.println("Ingen save-fil hittades, skapar ny kund.");
            customer = new Customer(2000);
        }


        Scanner strInput = new Scanner(System.in);

        FileUtils.writeTextFile("Hellöu file", "minfil.txt");

        // ArrayList
        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(BikeFactory.create("Kona"));
        bikeShop.addBike(BikeFactory.create("Bianchi"));
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
            System.out.println(FileUtils.readTextFile("mincykel.txt"));
            System.out.printf("Vilken cykel vill du köpa? (1-%d) ", bikeShop.getBikes().size());

            try {
                int userInput = Integer.parseInt(strInput.nextLine());
                Bike chosenBike = bikeShop.getBike(userInput-1);
                customer.buyBike(chosenBike);
                System.out.printf("Grattis, du äger nu en %s\n", customer.getCurrentBike().getName());
                System.out.printf("Du har %.2f € kvar\n", customer.getFunds());

                FileUtils.saveObject(customer, "customer.save");

                FileUtils.writeTextFile(
                        String.format("Förra gången köpte du en %s", customer.getCurrentBike().getName()),
                        "mincykel.txt"
                );

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