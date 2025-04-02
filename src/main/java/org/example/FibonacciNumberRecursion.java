package org.example;

public class FibonacciNumberRecursion {
    public int n = 2;
    private int currNum = 1;
    private int prevNum = 0;

    public void setPrevNum(int prevNum) {
        this.prevNum = prevNum;
    }

    // Method overloading / telescoping constructors for optional parameters
    public FibonacciNumberRecursion() {}
    public FibonacciNumberRecursion(int currNum) {
        this.currNum = currNum;
    }

    public int getFibonacciNumber(int n) {
        if (Integer.signum(n) == -1) {
            if (Integer.signum(this.currNum) == 1) this.currNum = -this.currNum;
            if (Integer.signum(this.prevNum) == 1) this.prevNum = -this.prevNum;
        }
        if (n > 3) {
            int accNum = this.currNum + this.prevNum;
            FibonacciNumberRecursion newNumber = new FibonacciNumberRecursion(accNum);
            newNumber.setPrevNum(this.currNum);
            return accNum + newNumber.getFibonacciNumber(n - 1);
        } else if (n == 3) {
            return 2;
        } else if (n > 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else if (n > -3) {
            return -1;
        } else if (n == -3) {
            return -2;
        } else {
            int accNum = this.currNum + this.prevNum;
            FibonacciNumberRecursion newNumber = new FibonacciNumberRecursion(accNum);
            newNumber.setPrevNum(this.currNum);
            return accNum + newNumber.getFibonacciNumber(n + 1);
        }
    }

    public static void main(String[] args) {
        FibonacciNumberRecursion FiboNum = new FibonacciNumberRecursion();
        System.out.println(FiboNum.getFibonacciNumber(-7));
    }
}
