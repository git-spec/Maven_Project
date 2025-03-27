package org.example;

public class FibonacciNumber {
    int n = 0;

    public static int getFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n;
        }
    }
}
