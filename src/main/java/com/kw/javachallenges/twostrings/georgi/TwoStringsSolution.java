package com.kw.javachallenges.twostrings.georgi;

import com.kw.javachallenges.twostrings.TwoStringsSolver;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class TwoStringsSolution implements TwoStringsSolver {
    public static void main(String[] args) {
//        *Solution with harcoded values, handles the null exception
//        TwoStringsSolution twoStringsSolution = new TwoStringsSolution();
//        System.out.println(twoStringsSolution.hasCommonSubstring("hello", "world")); // true
//        System.out.println(twoStringsSolution.hasCommonSubstring("hi", "abc")); // false
//        System.out.println(twoStringsSolution.hasCommonSubstring("pinaple", "pisana")); // true
//        System.out.println(twoStringsSolution.hasCommonSubstring("kiteworks", "progress")); // true
//        System.out.println(twoStringsSolution.hasCommonSubstring("g", "encoding")); //true
//        System.out.println(twoStringsSolution.hasCommonSubstring("lenght", "yummy")); // false
//        System.out.println(twoStringsSolution.hasCommonSubstring("", "blabla")); // false (throws exception)
//        System.out.println(twoStringsSolution.hasCommonSubstring(null, "something")); // false (throws exception)

//       *Solution with scanner, but dos not handle null exception as it could never be called
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value:");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second value:");
        String s2 = scanner.nextLine();
        if (!s1.matches("[a-z]+") || !s2.matches("[a-z]+")) {
            System.out.println("Error: Only lowercase English letters (a-z) are allowed.");
            return;
        }

        TwoStringsSolution twoStringsSolution = new TwoStringsSolution();
        boolean result = twoStringsSolution.hasCommonSubstring(s1, s2);
        System.out.println(result);
    }

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("The strings cannot be null");
        }
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }
        Set<Character> lettersInFirstString = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            lettersInFirstString.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++){
            char letterInSecondString = s2.charAt(i);
            if (lettersInFirstString.contains(letterInSecondString)){
                return true;
            }
        }
        return false;
    }
}
