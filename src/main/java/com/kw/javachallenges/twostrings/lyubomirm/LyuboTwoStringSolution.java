package com.kw.javachallenges.twostrings.lyubomirm;


import com.kw.javachallenges.twostrings.TwoStringsSolver;

import java.util.ArrayList;
import java.util.List;


public class LyuboTwoStringSolution implements TwoStringsSolver {

    public static void main(String[] args) {
        LyuboTwoStringSolution solver = new LyuboTwoStringSolution();

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

        // 1) Null checks
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Input strings must not be null");
        }

        // 2) Empty checks
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // 3) Record letters from s1
        List<Character> s1chars = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            s1chars.add(c);
        }

        // 4) Record letters from s2
        List<Character> s2chars = new ArrayList<>();
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            s2chars.add(c);

        }

        //Check for matching characters
        for (int i = 0; i < s1chars.size(); i++) {
            boolean contains = s2chars.contains(s1chars.get(i));
            if (contains) {
                return true;
            }
        }
        return false;
    }
}
