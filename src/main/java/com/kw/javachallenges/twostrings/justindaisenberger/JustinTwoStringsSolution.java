package com.kw.javachallenges.twostrings.justindaisenberger;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

public class JustinTwoStringsSolution implements TwoStringsSolver {

    public static void main(String[] args) {
        JustinTwoStringsSolution solver = new JustinTwoStringsSolution();

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

        if(s1 == null || s2 == null)
            throw new IllegalArgumentException();

        if(s1.isEmpty() || s2.isEmpty())
            return false;

        for(char c : s1.toCharArray()) {
            if(s2.contains(String.valueOf(c)))
                return true;
        }

        return false;
    }
}