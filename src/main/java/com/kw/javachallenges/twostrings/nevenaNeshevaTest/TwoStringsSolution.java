package com.kw.javachallenges.twostrings.nevenaNeshevaTest;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStringsSolution implements TwoStringsSolver {
    private static final String VALID_STRING_REGEX = "[a-z]+";

    private static int readValidTestCasesCount(Scanner scanner) {
        while (true) {
            System.out.print("Enter number of pairs: ");

            if (scanner.hasNextInt()) {
                int p = scanner.nextInt();
                scanner.nextLine();

                if (p > 0) {
                    return p;
                }
            } else {
                scanner.nextLine();
            }

            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }


    private static String readValidString(Scanner scanner, String name) {
        while (true) {
            System.out.print("Enter " + name + ": ");
            String input = scanner.nextLine();

            if (input.matches(VALID_STRING_REGEX)) {
                return input;
            }

            System.out.println(
                    "Invalid input. " + name + " must contain only lowercase letters a-z."
            );
        }
    }

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {
        Set<Character> characters = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            characters.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            if (characters.contains(s2.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPairs = readValidTestCasesCount(scanner);
        TwoStringsSolution solution = new TwoStringsSolution();

        for (int i = 1; i <= numberOfPairs; i++) {
            System.out.println("\nTest case " + i + ":");

            String s1 = readValidString(scanner, "s1");
            String s2 = readValidString(scanner, "s2");

            if (solution.hasCommonSubstring(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
