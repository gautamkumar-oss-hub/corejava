package com.gautamkumar.corejava.basics;

/**
 * Demonstrates Java's basic arithmetic operators: addition, subtraction,
 * multiplication, division, and modulus.
 *
 * <p>Also illustrates a key difference between integer and floating-point
 * division: integer division by zero throws an {@link ArithmeticException},
 * while floating-point division by zero does not throw and instead
 * produces {@code Infinity}.</p>
 *
 * @author Gautam Kumar
 * @since 2026-09-19
 */
public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {
        printIntegerArithmetic();
        printFloatingPointDivisionByZero();
    }

    private static void printIntegerArithmetic() {
        int a = 20;
        int b = 6;

        System.out.println("Integer Arithmetic (a = " + a + ", b = " + b + ")");
        System.out.println("---------------------------------------");
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));

        // Integer division by zero throws ArithmeticException at runtime.
        // Uncommenting the line below will crash the program:
        // int x = 10 / 0;
    }

    private static void printFloatingPointDivisionByZero() {
        double y = 10.0 / 0.0;

        System.out.println();
        System.out.println("Double division by zero: " + y);
    }
}