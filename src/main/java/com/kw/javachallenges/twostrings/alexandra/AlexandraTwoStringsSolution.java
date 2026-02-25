package com.kw.javachallenges.twostrings.alexandra;

import com.kw.javachallenges.twostrings.TwoStringsSolver;
import java.util.ArrayList;

public class AlexandraTwoStringsSolution implements TwoStringsSolver {

    public static void main(String[] args) {
        AlexandraTwoStringsSolution solver = new AlexandraTwoStringsSolution();

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
            throw new IllegalArgumentException();
        }

        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        ArrayList<Character> array1 = new ArrayList<>();
        for (Character c : s1.toCharArray()) {
            array1.add(c);
        }

        for (char s2Char : s2.toCharArray()) {
            boolean result = array1.contains(s2Char);

            if (result) {
                return true;
            }
        }

        return false;
    }
}
