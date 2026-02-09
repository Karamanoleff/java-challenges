package com.kw.javachallenges.twostrings.ivanTest;

import com.kw.javachallenges.twostrings.ivanTest.IvanTwoStringsSolver;

public class ManualTest {
    public static void main(String[] args) {
        IvanTwoStringsSolver solver = new IvanTwoStringsSolver();

        System.out.println("=== 1. Test (INVALID INPUT) ===");
        try {
            // Test with digits
            System.out.print("Test with digits ('abc1', 'def'): ");
            solver.hasCommonSubstring("abc1", "def");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Exception caught: " + e.getMessage());
        }

        try {
            // Test with uppercase letters
            System.out.print("Test with uppercase letters ('ABC', 'abc'): ");
            solver.hasCommonSubstring("ABC", "abc");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Exception caught: " + e.getMessage());
        }


        System.out.println("\n=== 2. PERFORMANCE TEST (100,000 CHARACTERS) ===");
        // Create s1 containing 99,999 'a's followed by one 'z'
        StringBuilder s1Builder = new StringBuilder();
        for (int i = 0; i < 99999; i++) s1Builder.append('a');
        s1Builder.append('z');
        String s1 = s1Builder.toString();

        // Create s2 containing 99,999 'b's followed by one 'z' (the only match)
        StringBuilder s2Builder = new StringBuilder();
        for (int i = 0; i < 99999; i++) s2Builder.append('b');
        s2Builder.append('z');
        String s2 = s2Builder.toString();

        System.out.println("Strings generated. Length: " + s1.length());

        long startTime = System.nanoTime();
        boolean result = solver.hasCommonSubstring(s1, s2);
        long endTime = System.nanoTime();

        double durationMillis = (endTime - startTime) / 1_000_000.0;

        System.out.println("RESULT: " + (result ? "YES (Found 'z')" : "NO"));
        System.out.println("EXECUTION TIME: " + durationMillis + " ms");

    }
}