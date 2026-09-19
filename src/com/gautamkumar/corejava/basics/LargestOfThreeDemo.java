package com.gautamkumar.corejava.basics;

public class LargestOfThreeDemo {
    public static void main(String[] args) {
        printLargestOfThree(12, 45, 27);
        printLargestOfThree(100, 100, 50);
        printLargestOfThree(-5, -1, -20);
    }

    private static void printLargestOfThree(int a, int b, int c) {
        int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

        System.out.println("Numbers: " + a + ", " + b + ", " + c);
        System.out.println("Largest: " + largest);
        System.out.println();
    }
}
