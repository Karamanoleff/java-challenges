package com.kw.javachallenges.twostrings;
import java.util.Scanner;

public class TestIvan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.print("Enter number of pairs to check: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            return;
        }

        int pairs = sc.nextInt();
        sc.nextLine(); // Изчистване на буфера

        for (int i = 1; i <= pairs; i++) {
            System.out.println("\n--- Testing Pair #" + i + " ---");

            System.out.print("String 1: ");
            String s1 = sc.nextLine();

            System.out.print("String 2: ");
            String s2 = sc.nextLine();

            // Логиката за сравнение
            boolean hasMatch = s1.chars().anyMatch(c -> s2.indexOf(c) != -1);

            // Красив изход
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
