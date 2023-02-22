package org.example;

import java.util.Arrays;

public class Sorty {
    String[] values;

    public Sorty(String[] values) {
        this.values = values.clone(); // clone gör en djup kopia, dvs en helt ny array.
        System.out.println("new Sorty: " + Arrays.toString(this.values));
    }

    public void insertionSort() {
        int ops = 0;
        for (int i = 1; i < values.length; i++) {
            String curValue = values[i];
            int j = i-1; // föregående värde

            while (j >= 0 && values[j].compareTo(curValue) > 0) {
                // flytta föregående värde ett steg framåt
                values[j+1] = values[j];
                j--;
                ops+=2;
            }
            ops++;
            // "stick in" nuvarande värde på sin rätta plats
            values[j+1] = curValue;
        }
        System.out.println("insertionSorted: " + Arrays.toString(values));
        System.out.println("insertionSort OPS: " + ops);


    }

    public void bubbleSort() {

        int ops = 0;
        for (int i = 0; i < values.length; i++) {

            // vi kan minska med 1 varje gång (length-i)
            for (int j = 1; j < values.length-i; j++) {

                // Kolla om det föregående är större än det nuvarande
                if (values[j-1].compareTo(values[j]) > 0) {
                    String temp = values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                    ops++;
                }
                ops++;
            }
            ops++;
        }

        System.out.println("bubbleSorted: " + Arrays.toString(values));
        System.out.println("bubbleSort OPS: " + ops);

    }

}
