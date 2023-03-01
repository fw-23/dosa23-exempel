package org.example;

public class Recursy {

    // rekursiv loop
    // räkna 1-10: Recursy.looper(1, 10)
    public static void looper(int i, int end) {
        if (i > end) return;
        System.out.println(i);
        looper(i+1, end);
    }

    // fibonacci 1 1 2 3 5 8 13
    // fib(n) n = returnera det n:te fibonacci-talet
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    // Memoisering för att göra rekursionen snabbare
    static long[] fibCache = new long[100];
    public static long fastFib(int n) {
        if (n <= 1) return n;
        // Om vi har nånting i cachen, returnera det
        if (fibCache[n] != 0) return fibCache[n];

        long calculated = fastFib(n-1) + fastFib(n-2);
        // spara rekursionens resultat i cachen
        fibCache[n] = calculated;
        return calculated;
    }


}
