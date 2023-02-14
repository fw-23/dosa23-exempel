package org.example;

import java.util.Arrays;

public class Queuey {
    int queueSize, front, rear, elemCount;
    String[] data;

    public Queuey(int queueSize) {
        this.queueSize = queueSize;
        data = new String[queueSize];
    }

    public void enQueue(String elem) {
        if (elemCount > 0) {
            rear = (rear+1) % queueSize;
        }
        data[rear] = elem;
        elemCount++;
    }

    @Override
    public String toString() {
        return "Queuey{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
