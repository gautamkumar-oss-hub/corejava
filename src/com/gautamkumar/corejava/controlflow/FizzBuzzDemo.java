package com.gautamkumar.corejava.controlflow;

public class FizzBuzzDemo {
    private static final int START = 1;
    private static final int END = 100;

    public static void main(String[] args) {
        printFizzBuzz(START, END);
    }

    private static void printFizzBuzz(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
