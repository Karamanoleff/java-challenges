package com.kw.javachallenges.twostrings.momchil;


import com.kw.javachallenges.twostrings.TwoStringsSolver;

public class TwoStringsSolverMo implements TwoStringsSolver {


    public static void main(String[] args) {
        TwoStringsSolverMo solver = new TwoStringsSolverMo();

        System.out.println("=============================================");
        System.out.println("Testing Two Strings Implementation");
        System.out.println("=============================================");

        //System.out.println("hasCommonSubstring(\"hello\", \"o\"): " + solver.hasCommonSubstring("hello", "o"));
        //System.out.println("hasCommonSubstring(\"hi\", \"world\"): " + solver.hasCommonSubstring("hi", "world"));
        //System.out.println("hasCommonSubstring(\"abc\", \"def\"): " + solver.hasCommonSubstring("abc", "def"));
        System.out.println("hasCommonSubstring(\"\", \"\"): " + solver.hasCommonSubstring("", ""));
        //System.out.println("hasCommonSubstring(\"null\", \"null \"): " + solver.hasCommonSubstring(null, null));
        System.out.println("hasCommonSubstring(\"null\", \"null \"): " + solver.hasCommonSubstring(null, null));
    }

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }

        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
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