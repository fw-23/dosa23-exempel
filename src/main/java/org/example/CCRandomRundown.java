package org.example;

import java.util.Random;
import java.util.Scanner;

public class CCRandomRundown {

    static void generator() {

        Random rnd = new Random();
        Scanner console = new Scanner(System.in);

        System.out.println("Välkommen till slumptalsgeneratorn");
        // do-while passar i det här fallet
        do {
            System.out.printf("Slumptal: %d\n (enter för ett nytt, q för att avsluta.)", rnd.nextInt(99));
        } while (!console.nextLine().equals("q"));

        System.out.println("Tack och hej!");

    }

}
