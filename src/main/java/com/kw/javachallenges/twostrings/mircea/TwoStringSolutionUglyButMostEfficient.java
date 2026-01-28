package com.kw.javachallenges.twostrings.mircea;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

public class TwoStringSolutionUglyButMostEfficient implements TwoStringsSolver {

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {

        // this solution looks bad, hard to read, but is 3x more efficient than the pretty one

        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("At least one string is null");
        }

        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            alphabet[c - 'a'] = true;
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (alphabet[c - 'a']) {
                return true;
            }
        }

        return false;
    }
}
