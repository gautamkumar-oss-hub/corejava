package com.gautamkumar.corejava.basics;

/**
 * Demonstrates the eight primitive data types available in Java.
 *
 * <p>Each primitive is declared with a representative value, and its
 * type/value pair is printed to standard output in a consistently
 * aligned, tabular format.</p>
 *
 * @author Gautam Kumar
 * @since 2026-09-19
 */
public class printPrimitiveTypeDemo {

    public static void main(String[] args) {
        byte age = 25;
        short year = 2026;
        int population = 1_000_000;
        long distance = 9_876_543_210L;
        float temperature = 36.5f;
        double salary = 75_000.50;
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println("Java Primitive Data Types");
        System.out.println("-------------------------");
        System.out.printf("%-8s : %s%n", "byte", age);
        System.out.printf("%-8s : %s%n", "short", year);
        System.out.printf("%-8s : %s%n", "int", population);
        System.out.printf("%-8s : %s%n", "long", distance);
        System.out.printf("%-8s : %s%n", "float", temperature);
        System.out.printf("%-8s : %s%n", "double", salary);
        System.out.printf("%-8s : %s%n", "char", grade);
        System.out.printf("%-8s : %s%n", "boolean", isJavaFun);
    }
}