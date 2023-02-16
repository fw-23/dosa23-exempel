package org.example;

public class Hashy {

    private Person[] hashTable;
    private int size;

    int totalCollisions;

    public Hashy(int initSize) {
        // 10 * större för att få mera "luft" i vår hashtabell
        size = initSize*10;
        hashTable = new Person[size];
    }

    int hash(String str) {
        int ret = 0;
        // loopa igenom tecknen och addera ASCII-koderna
        for (int i = 0; i < str.length(); i++) {
            // 10 * större "spread" eftersom vi använder lienar probing
            ret += ((int) str.charAt(i)) * 10;
        }
        return ret % size;
    }


    public void insert(Person person) {

        int idx = hash(person.getName());
        int collisions = 0;

        // Finns det redan ett objekt på detta index?
        while (hashTable[idx] != null) {
            idx++; // Öka och kolla om nästa plats är tom

            // Börja pånytt från början om arrayen är full till slutet
            idx = idx % size; // cirkulär array FTW!

            collisions++;
        }

        hashTable[idx] = person;

        totalCollisions += collisions;


        /*System.out.printf("Insert: %s rank:%d, hash:%d %s\n",
                person.getName(),
                person.getRank(),
                idx,
                (collisions > 0) ? "COLLISION!" : ""
        );*/

    }

    public Person search(String name) {
        int idx = hash(name);
        int ops = 1;

        while (!hashTable[idx].getName().equals(name)) {
            idx++;
            idx = idx % size;

            ops++;
            if (ops > size) return null;
        }
        // hittad!
        System.out.println("---------\n" + name + " - Hash-operationer:" + ops );
        return hashTable[idx];
    }

    public void searchNotHash(String search, String[] persons) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].equals(search)) {
                System.out.println(search + "- NOT HASH operations: " + (i+1));
            }
        }

    }

}
