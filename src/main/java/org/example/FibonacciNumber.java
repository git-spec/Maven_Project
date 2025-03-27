package org.example;

public class FibonacciNumber {
    static int n = -3;

    public static int getFibonacciNumber(int n) {
        int prevNum = 0;
        int currNum = n > 0 ? 1 : -1;
        int nextNum = currNum + prevNum;

        if (n == 0) {
            return 0;
        } else if (n == 1 || n == -1) {
            return currNum;
        } else {
            for (int i = 1; i < n; i++) {
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
