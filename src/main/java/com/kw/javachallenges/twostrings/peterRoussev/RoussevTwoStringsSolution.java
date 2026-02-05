package com.kw.javachallenges.twostrings.peterRoussev;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

import java.util.*;
import java.util.stream.Collectors;

public class RoussevTwoStringsSolution implements TwoStringsSolver {

    /**
     * Main method for testing the Two Strings implementation.
     * Runs several test cases to verify the hasCommonSubstring functionality.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        RoussevTwoStringsSolution solver = new RoussevTwoStringsSolution();

        System.out.println("=============================================");
        System.out.println("Testing Two Strings Implementation");
        System.out.println("=============================================");

        System.out.println("hasCommonSubstring(\"hello\", \"world\"): " + solver.hasCommonSubstring("hello", "world"));
        System.out.println("hasCommonSubstring(\"hi\", \"world\"): " + solver.hasCommonSubstring("hi", "world"));
        System.out.println("hasCommonSubstring(\"abc\", \"def\"): " + solver.hasCommonSubstring("abc", "def"));
        System.out.println("hasCommonSubstring(\"\", \"hello\"): " + solver.hasCommonSubstring("", "hello"));
        System.out.println("hasCommonSubstring(\"wonderworld\", \"commander\"): " + solver.hasCommonSubstring("wonderworld", "commander"));

        System.out.println("=============================================");
    }

    /**
     * Determines whether two strings have a common substring.
     *
     * For strings shorter than 20 characters, this method performs a thorough comparison
     * by generating all possible substrings and finding matches. For longer strings,
     * it performs a simpler character-level comparison for efficiency.
     * @param s1 the first string to compare
     * @param s2 the second string to compare
     * @return  true if the strings share at least one common substring (or character),
     *         false otherwise
     */
    @Override
    public boolean hasCommonSubstring(String s1, String s2) {

        if (s1==null || s2==null) {
            throw new IllegalArgumentException("Invalid value/s.");
        } else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Cannot compare empty string/s.");
            return false;
        } else if (s1.equals(s2)) {
            System.out.println("The words are equal.");
            return true;
        } else if (s1.length() <20 || s2.length() <20) {
            System.out.println("Strings have a reasonable length to be compared more thoroughly, result for all substrings:");
            List<String> resultS1 = collectAllSubstrings(s1);
            List<String> resultS2 = collectAllSubstrings(s2);

            List<String> list = new ArrayList<>(resultS1.stream().filter(resultS2::contains).toList());

            if(list.isEmpty()) {
                return false;
            }
            else {
                list.sort(Comparator.comparing(String::length).reversed());
                List<String> finalList = list.stream().distinct().toList();
                System.out.println("Longest substring match: "+ finalList.getFirst());
                System.out.println("All matches: " + finalList
                );

                return true;
            }
        }
        else {
            System.out.println("Strings are too long, will compare only by char contained:");
            Set<Character> s1Set = s1.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toSet());

            Set<Character> s2Set = s2.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toSet());

            return !s1Set.stream().filter(s2Set::contains).toList().isEmpty();
        }
    }

    /**
     * Collects all possible substrings of the given string.
     *
     * This method generates all substrings of length 1 to n,
     * where n is the length of the input string. For example, for input "abc",
     * it returns: ["a", "b", "c", "ab", "bc", "abc"].
     *
     * @param word the string to extract substrings from
     * @return a list containing all possible substrings (single characters and longer)
     */
    private List<String> collectAllSubstrings(String word) {
        List<String> resultS1 = new ArrayList<>();

        for(int i = 1; i<= word.length(); i++){
            for(int j = 0; j+i<= word.length(); j++ ) {
                resultS1.add(word.substring(j,j+i));
            }
        }
        return resultS1;
    }
}
