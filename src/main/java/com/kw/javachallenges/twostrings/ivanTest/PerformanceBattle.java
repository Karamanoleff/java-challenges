package com.kw.javachallenges.twostrings.ivanTest;

import java.util.BitSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PerformanceBattle {

    public static void main(String[] args) {
        // Increase the size to better perceive the performance differences
        int size = 1_000_000;

        // Generate two strings with no matches (worst-case scenario for performance)
        String s1 = "a".repeat(size);
        String s2 = "b".repeat(size);

        System.out.println("=== PERFORMANCE BATTLE (" + size + " characters) ===");

        // Warm-up: Run a method multiple times to "warm up" the JVM
        for (int i = 0; i < 100; i++) {
            fastArrayApproach(s1, s2);
        }

        // --- 1. Initial approach (O(n * m)) ---
        // WARNING: For 1,000,000 characters, indexOf will take an ETERNITY.
        // Therefore, we limit it here only if you choose to wait.
        if (size <= 100000) {
            runTest("1. Initial (indexOf)", () -> s1.chars().anyMatch(c -> s2.indexOf(c) != -1));
        } else {
            System.out.println("1. Initial (indexOf): Skipped (too slow for " + size + ")");
        }

        // --- 2. Stream + Set (O(n + m)) ---
        runTest("2. Stream + Set", () -> {
            Set<Integer> charSet = s1.chars().boxed().collect(Collectors.toSet());
            return s2.chars().anyMatch(charSet::contains);
        });

        // --- 3. Java BitSet (O(n + m)) ---
        runTest("3. Java BitSet", () -> bitSetApproach(s1, s2));

        // --- 4. Boolean Array (O(n + m)) ---
        runTest("4. Boolean Array", () -> fastArrayApproach(s1, s2));

        // --- 5. Bit Mask (int) (O(n + m)) ---
        runTest("5. Bit Mask (int)", () -> bitMaskApproach(s1, s2));
    }

    private static void runTest(String name, java.util.function.Supplier<Boolean> method) {
        long start = System.nanoTime();
        boolean result = method.get();
        long end = System.nanoTime();
        // Convert to milliseconds for easier readability
        double duration = (end - start) / 1_000_000.0;
        System.out.printf("%-20s | Time: %10.4f ms | Result: %s%n", name, duration, result);
    }

    public static boolean fastArrayApproach(String s1, String s2) {
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < s1.length(); i++) {
            alphabet[s1.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (alphabet[s2.charAt(i) - 'a']) return true;
        }
        return false;
    }

    public static boolean bitSetApproach(String s1, String s2) {
        BitSet charMap = new BitSet(26);
        for (int i = 0; i < s1.length(); i++) {
            charMap.set(s1.charAt(i) - 'a');
        }
        for (int i = 0; i < s2.length(); i++) {
            if (charMap.get(s2.charAt(i) - 'a')) return true;
        }
        return false;
    }

    public static boolean bitMaskApproach(String s1, String s2) {
        int mask = 0;
        for (int i = 0; i < s1.length(); i++) {
            mask |= (1 << (s1.charAt(i) - 'a'));
        }
        for (int i = 0; i < s2.length(); i++) {
            if ((mask & (1 << (s2.charAt(i) - 'a'))) != 0) return true;
        }
        return false;
    }
}