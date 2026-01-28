package com.kw.javachallenges.twostrings.mircea;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

import java.util.HashSet;
import java.util.Set;

public class TwoStringsSolutionWhatIWouldDo implements TwoStringsSolver {


    public static void main(String[] args) {

        TwoStringsSolutionWhatIWouldDo solver = new TwoStringsSolutionWhatIWouldDo();

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
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("At least one string is null");
        }

        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // do a swap in order to go through the shorter string (more efficient)
        // on a 100k string, it improves performance by 10-20% compared to the easy-to-read one
        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        // using Set instead of List because Set is more efficient than list (Set doesn't care about char position, while List cares)
        Set<Character> charsSeenInShorterString = new HashSet<>(s1.length());

        //building the set
        for (int i = 0; i < s1.length(); i++) {
            charsSeenInShorterString.add(s1.charAt(i));
        }

        //parsing on s2 to see whether s1 Set contains current s1 char
        for (int i = 0; i < s2.length(); i++) {
            if (charsSeenInShorterString.contains(s2.charAt(i))) {
                return true;
            }
        }

        return false;
    }
}
