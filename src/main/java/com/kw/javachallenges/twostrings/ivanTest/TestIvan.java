package com.kw.javachallenges.twostrings.ivanTest;

import java.util.Scanner;

public class TestIvan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        int pairs;

        while (true) {
            System.out.print("Enter number of pairs to check: ");

            // 1. Validation if input is number
            if (sc.hasNextInt()) {
                pairs = sc.nextInt();

                // 2. Validation that number is > 0;
                if (pairs > 0) {
                    sc.nextLine(); // Clear buffer
                    break;
                } else {
                    System.out.println("❌ Invalid input! Number must be positive.");
                    sc.nextLine(); // Clear buffer
                }
            } else {
                // 3. Validate that input is not a string
                System.out.println("❌ Invalid input! Use only whole numbers (no text).");
                sc.next(); // Clear buffer
            }
        }

        for (int i = 1; i <= pairs; i++) {
            System.out.println("\n--- Testing Pair #" + i + " ---");


            String s1;
            while (true) {
                System.out.print("String 1: ");
                s1 = sc.nextLine();
                if (s1.matches("[a-z]+")) {
                    break;
                }
                System.out.println("❌ Invalid input! Use only lowercase letters a-z.");
            }
            String s2;
            while (true) {
                System.out.print("String 2: ");
                s2 = sc.nextLine();
                if (s2.matches("[a-z]+")) {
                    break;
                }
                System.out.println("❌ Invalid input! Use only lowercase letters a-z.");
            }

            // Comparison logic
            String finalS = s2;
            boolean hasMatch = s1.chars().anyMatch(c -> finalS.indexOf(c) != -1);

            System.out.print("RESULT: ");
            if (hasMatch) {
                System.out.println("✅ YES (Found common letters)");
            } else {
                System.out.println("❌ NO (No common letters)");
            }
            System.out.println("--------------------------------");
        }

        System.out.println("\nAnalysis complete. Goodbye!");
        sc.close();
    }
}
