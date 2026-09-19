package com.gautamkumar.corejava.basics;

public class SwapWithoutThirdVariableDemo {
    public static void main(String[] args) {
        swapUsingArithmetic();
        swapUsingXor();
    }

    private static void swapUsingArithmetic() {
        int a = 5;
        int b = 10;

        System.out.println("Arithmetic Swap");
        System.out.println("----------------");
        System.out.println("Before: a = " + a + ", b = " + b);

        a = a + b; // a now holds the sum of both original values
        b = a - b; // subtracting original b leaves original a
        a = a - b; // subtracting new b (original a) leaves original b

        System.out.println("After:  a = " + a + ", b = " + b);
        System.out.println();
    }

    private static void swapUsingXor() {
        int a = 5;
        int b = 10;

        System.out.println("XOR Swap");
        System.out.println("---------");
        System.out.println("Before: a = " + a + ", b = " + b);

        a = a ^ b; // a now holds the XOR of both original values
        b = a ^ b; // XOR-ing with original b recovers original a
        a = a ^ b; // XOR-ing with new b (original a) recovers original b

        System.out.println("After:  a = " + a + ", b = " + b);
    }
}
