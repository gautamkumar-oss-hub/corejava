package com.gautamkumar.corejava.basics;

public class CompoundAssignmentAndIncrementDemo {
    public static void main(String[] args) {
        printCompoundAssignmentOperators();
        printPreVsPostIncrement();
        printPreVsPostDecrement();
    }

    private static void printCompoundAssignmentOperators() {
        int value = 10;

        System.out.println("Compound Assignment Operators");
        System.out.println("-------------------------------");
        System.out.println("Initial value : " + value);

        value += 5;  // value = value + 5
        System.out.println("After += 5    : " + value);

        value -= 3;  // value = value - 3
        System.out.println("After -= 3    : " + value);

        value *= 4;  // value = value * 4
        System.out.println("After *= 4    : " + value);

        value /= 2;  // value = value / 2
        System.out.println("After /= 2    : " + value);

        value %= 7;  // value = value % 7
        System.out.println("After %= 7    : " + value);
        System.out.println();
    }

    private static void printPreVsPostIncrement() {
        int x = 5;

        System.out.println("Pre- vs Post-Increment");
        System.out.println("------------------------");
        System.out.println("Starting value of x : " + x);

        int postIncrementResult = x++; // returns 5, then x becomes 6
        System.out.println("x++ returned        : " + postIncrementResult + " (x is now " + x + ")");

        int preIncrementResult = ++x;  // x becomes 7, then returns 7
        System.out.println("++x returned        : " + preIncrementResult + " (x is now " + x + ")");
        System.out.println();
    }

    private static void printPreVsPostDecrement() {
        int y = 5;

        System.out.println("Pre- vs Post-Decrement");
        System.out.println("------------------------");
        System.out.println("Starting value of y : " + y);

        int postDecrementResult = y--; // returns 5, then y becomes 4
        System.out.println("y-- returned        : " + postDecrementResult + " (y is now " + y + ")");

        int preDecrementResult = --y;  // y becomes 3, then returns 3
        System.out.println("--y returned        : " + preDecrementResult + " (y is now " + y + ")");
    }
}
