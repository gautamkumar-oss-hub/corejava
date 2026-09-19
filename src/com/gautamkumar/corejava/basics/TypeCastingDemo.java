package com.gautamkumar.corejava.basics;

public class TypeCastingDemo {
    public static void main(String[] args) {
        printImplicitWidening();
        printExplicitNarrowing();
        printNarrowingDataLoss();
    }

    private static void printImplicitWidening() {
        int number = 100;
        double widenedNumber = number;

        System.out.println("Implicit Widening: int -> double");
        System.out.println("---------------------------------");
        System.out.println("int value    : " + number);
        System.out.println("double value : " + widenedNumber);
        System.out.println();
    }

    private static void printExplicitNarrowing() {
        double price = 99.99;
        int narrowedPrice = (int) price;

        System.out.println("Explicit Narrowing: double -> int");
        System.out.println("-----------------------------------");
        System.out.println("double value : " + price);
        System.out.println("int value    : " + narrowedPrice);
        System.out.println();
    }

    private static void printNarrowingDataLoss() {
        double value = 123.456789;
        int result = (int) value;

        System.out.println("Narrowing Loses Data");
        System.out.println("---------------------");
        System.out.println("Original double : " + value);
        System.out.println("After narrowing : " + result);
    }
}
