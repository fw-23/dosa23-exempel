package org.example;

import java.util.Arrays;

public class StringArray {

    String[] values;

    public StringArray(String[] values) {
        this.values = values;
    }

    public void add(String value) {
        // Skapa en ny array som är ett element längre än den gamla
        String[] newValues = new String[values.length+1];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        // lägg till nya värdet sist i arrayen
        newValues[values.length] = value;
        values = newValues;
        System.out.printf("---- Added %s, %d operations\n", value, values.length);
    }

    public void add(int index, String value) {
        // Öka arrayns storlek
        add(null);
        for (int i = values.length-1; i > index; i--) {
            // flytta varje element ett steg framåt
            values[i] = values[i-1];
        }
        values[index] = value;
        System.out.printf("---- Added %s @ %d %d operations\n", value, index, values.length-index);

    }

    // CODE CHALLENGE The Reversal
    public void reverse() {
        String[] reversed = new String[values.length];
        int revIndex = 0;
        for (int i = values.length-1; i >= 0; i--) {
            reversed[revIndex] = values[i];
            revIndex++;
        }
        values = reversed;
    }


    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
