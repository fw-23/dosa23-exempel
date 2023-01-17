package org.example;

import java.util.HashMap;

public class ShirtShop {

    private HashMap<String,Shirt> shirts = new HashMap<>();


    public void addShirt(String key, Shirt value) {
        shirts.put(key, value);
    }

    public HashMap<String, Shirt> getShirts() {
        return shirts;
    }

    public String shirtList() {
        StringBuilder returnString = new StringBuilder("Våra skjortor:\n");

        for (String key: shirts.keySet()) {
            Shirt curShirt = shirts.get(key);

            returnString.append(String.format("[%s] %s - %.2f\n",
                    key,
                    curShirt.getBrand(),
                    curShirt.getPrice()));

        }

        returnString.append("Vilken skjorta vill du köpa (skriv produktkod)");

        return returnString.toString();

    }
}
