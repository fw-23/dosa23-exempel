package org.example;

import java.util.Arrays;

public class Stacky {
    int topOfStack = -1;
    int stackSize;
    String[] data;

    public Stacky(int stackSize) {
        this.stackSize = stackSize;
        data = new String[stackSize];
    }

    public void push(String elem) {
        if (topOfStack+1 >= stackSize) {
            throw new StackOverflowError("Stacken är full");
        }
        topOfStack++;
        data[topOfStack] = elem;
    }

    public String pop() {
        if (topOfStack <= 0) {
            throw new IndexOutOfBoundsException("Stacken är tom!");
        }
        String ret = data[topOfStack];
        data[topOfStack] = null;
        topOfStack--;
        return ret;
    }


    @Override
    public String toString() {
        return "Stacky{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
