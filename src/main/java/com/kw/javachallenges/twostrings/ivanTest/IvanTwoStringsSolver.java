package com.kw.javachallenges.twostrings.ivanTest;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

public class IvanTwoStringsSolver implements TwoStringsSolver {

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {
        // Handle null inputs
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }

        // Handle empty strings (length < 1)
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // String length: 1 ≤ length ≤ 100,000
        if (s1.length() > 100000 || s2.length() > 100000) {
            throw new IllegalArgumentException("String length exceeds maximum limit of 100,000");
        }

        // Creating array with length of 26 (small letters)
        boolean[] alphabet = new boolean[26];

        // String1 validation for lowercase letters (a-z)
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException("Invalid character '" + c + "'. Only lowercase a-z allowed.");
            }
            alphabet[c - 'a'] = true;
        }

        // String2 validation for lowercase letters (a-z)
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException("Invalid character '" + c + "'. Only lowercase a-z allowed.");
            }
            if (alphabet[c - 'a']) {
                System.out.println("YES (common: " + c + ")");
                return true;
            }
        }

        return false;
    }
}