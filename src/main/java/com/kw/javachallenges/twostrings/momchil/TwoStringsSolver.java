package com.kw.javachallenges.twostrings.momchil;


public class TwoStringsSolver {


    public static void main(String[] args) {
        TwoStringsSolver solver = new TwoStringsSolver();

        System.out.println("=============================================");
        System.out.println("Testing Two Strings Implementation");
        System.out.println("=============================================");

        System.out.println("hasCommonSubstring(\"hello\", \"o\"): " + solver.hasCommonSubstring("hello", "o"));
        System.out.println("hasCommonSubstring(\"hi\", \"world\"): " + solver.hasCommonSubstring("hi", "world"));
        System.out.println("hasCommonSubstring(\"abc\", \"def\"): " + solver.hasCommonSubstring("abc", "def"));
        System.out.println("hasCommonSubstring(\"\", \"hello\"): " + solver.hasCommonSubstring("", "hello"));
        System.out.println("hasCommonSubstring(\"null\", \"null \"): " + solver.hasCommonSubstring(null, null));
    }


    boolean hasCommonSubstring(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    return true;
                }
            }
        }

        return false;
    }
}