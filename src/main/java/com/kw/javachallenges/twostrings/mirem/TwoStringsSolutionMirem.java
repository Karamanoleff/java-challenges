package com.kw.javachallenges.twostrings.mirem;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStringsSolutionMirem implements TwoStringsSolver {

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {

        // Handle null inputs
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }

        // Handle empty strings
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            set2.add(s2.charAt(i));
        }

        set1.retainAll(set2);

        return !set1.isEmpty();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TwoStringsSolutionMirem solver = new TwoStringsSolutionMirem();
        int testCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < testCases; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            boolean result = solver.hasCommonSubstring(s1, s2);

            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}