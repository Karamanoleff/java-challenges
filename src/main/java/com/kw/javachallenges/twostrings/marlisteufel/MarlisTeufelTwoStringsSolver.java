package com.kw.javachallenges.twostrings.marlisteufel;

import com.kw.javachallenges.twostrings.TwoStringsSolver;
import java.util.Arrays;

public class MarlisTeufelTwoStringsSolver implements TwoStringsSolver {

    public static void main(String[] args) {
        MarlisTeufelTwoStringsSolver solver = new MarlisTeufelTwoStringsSolver();

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

        // check if a string is null
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException();
        }

        // check if a string is empty
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // convert string to a char array
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        // sort the arrays by length
        char[] shorterArray = s1Array;
        char[] longerArray = s2Array;

        if (s1Array.length > s2Array.length) {
            shorterArray = s2Array;
            longerArray = s1Array;
        }

        for (char c1 : shorterArray) {
            for (char c2 : longerArray) {
                if (c1 == c2) {
                    return true;
                }
            }
        }

        return false;
    }

}
