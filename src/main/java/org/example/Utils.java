package org.example;

import java.util.Scanner;

public class Utils {

    public static boolean isInteger(String str) {
        return str.matches("-?[0-9]+");
    }

    // Code Challenge: Good input, Bad input
    public static int getIntInput(String prompt) {
        Scanner strInput = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(prompt);
                String userInput = strInput.nextLine();
                // Vi behöver ingen skild break om vi har return!
                return Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Det var inte ett heltal, försök igen!");
            }
        }
    }

    // Annan variant utan felhantering,
    // lite kortare men kanske inte lika tydlig
    public static int getIntInput2(String prompt) {
        Scanner strInput = new Scanner(System.in);
        while (true) {
            System.out.println(prompt);
            String inp = strInput.nextLine();
            if (isInteger(inp)) return Integer.parseInt(inp);
            System.out.println("Det var inte ett heltal, försök igen!");
        }
    }
}
