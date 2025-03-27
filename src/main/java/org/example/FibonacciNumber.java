package org.example;

public class FibonacciNumber {
    static int n = -12;

    public static int getFibonacciNumber(int n) {
        int prevNum = 0;
        int currNum = n > 0 ? 1 : -1;
        int nextNum = currNum + prevNum;

        if (n == 0) {
            return 0;
        } else if (n == 1 || n == -1) {
            return currNum;
        } else {
            for (int i = n > 0 ? 1 : n; n > 0 ? i < n : i < -1; i++) {
                nextNum = currNum + prevNum;
                prevNum = currNum;
                currNum = nextNum;
            }
            return nextNum;
        }
    }

    public static void main(String[] args) {
        System.out.println(getFibonacciNumber( n ));
    }
}
