package com.gautamkumar.corejava.controlflow;

/**
 * Converts a numeric score (0–100) into a letter grade using an
 * {@code if-else if-else} chain.
 *
 * <p>Grading scale used:</p>
 * <ul>
 *   <li>90–100 : A</li>
 *   <li>80–89  : B</li>
 *   <li>70–79  : C</li>
 *   <li>60–69  : D</li>
 *   <li>Below 60 : F</li>
 * </ul>
 *
 * <p>Scores outside the valid 0–100 range are reported as invalid
 * rather than silently assigned a grade.</p>
 *
 * @author Gautam Kumar
 * @since 2026-09-19
 */
public class GradingDemo {

    public static void main(String[] args) {
        printGrade(95);
        printGrade(82);
        printGrade(74);
        printGrade(61);
        printGrade(45);
        printGrade(-5);
        printGrade(101);
    }

    private static void printGrade(int score) {
        char grade;

        if (score < 0 || score > 100) {
            System.out.println("Score: " + score + " -> Invalid (must be 0-100)");
            return;
        }

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Score: " + score + " -> Grade: " + grade);
    }
}