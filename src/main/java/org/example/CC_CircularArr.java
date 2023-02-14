package org.example;

public class CC_CircularArr {

    public CC_CircularArr() {


        String[] weekDays = { "må", "ti", "on", "to", "fr", "lö", "sö" };

        int today = 1; // tisdag
        System.out.printf("I dag är det %s\n",weekDays[today]);
        System.out.printf("I övermorgon är det %s\n", weekDays[today+2]);

        /**
         * Vi använder divisionsrest (modulo, %) för att få ett värde som aldrig
         * överstiger sista index i vår array!
         */

        // today + 7 = 8, men vi vill ha index 1
        System.out.printf("Om 7 dagar är det %s\n",weekDays[today+7 % weekDays.length]);

        // 16 / 7 ==> rest 2, alltså 16 % 7 = 2
        System.out.printf("Om 15 dagar är det %s\n",weekDays[today+15 % weekDays.length]);

    }

}
