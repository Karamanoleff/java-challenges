package com.kw.javachallenges.twostrings.mircea;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

public class TwoStringSolutionUglyButMostEfficient implements TwoStringsSolver {


    public static void main(String[] args) {
        TwoStringSolutionUglyButMostEfficient solver = new TwoStringSolutionUglyButMostEfficient();

        System.out.println("=============================================");
        System.out.println("Testing Two Strings Implementation");
        System.out.println("=============================================");

        System.out.println("hasCommonSubstring(\"hello\", \"world\"): " + solver.hasCommonSubstring("hello", "world"));
        System.out.println("hasCommonSubstring(\"hi\", \"world\"): " + solver.hasCommonSubstring("hi", "world"));
        System.out.println("hasCommonSubstring(\"abc\", \"def\"): " + solver.hasCommonSubstring("abc", "def"));
        System.out.println("hasCommonSubstring(\"\", \"hello\"): " + solver.hasCommonSubstring("", "hello"));

        System.out.println("=============================================");
    }

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {

        // this solution looks bad, hard to read, but is 3x more efficient than the pretty one
        // is faster, but limited to the lower case 26 chars of the alphabet

        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("At least one string is null");
        }

        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        boolean[] alphabet = new boolean[26];

        //marking which letters from the alphabet we see in s1
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            alphabet[c - 'a'] = true;
        }

        //for every letter from s2, we look to see whether is also marked as present in s1
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (alphabet[c - 'a']) {
                return true;
            }
        }

        return false;
    }
}
