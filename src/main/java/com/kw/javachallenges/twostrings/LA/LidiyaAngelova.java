package com.kw.javachallenges.twostrings.LA;

import com.kw.javachallenges.twostrings.TwoStringsSolver;
import java.util.HashSet;
import java.util.Set;

public class LidiyaAngelova implements TwoStringsSolver {

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {

        // 1. Handle null inputs
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Input strings must not be null");
        }

        // 2. Handle empty strings
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // 3. Create a Set to track characters in s1
        Set<Character> seen = new HashSet<>();

        // 4. Mark characters from s1
        for (char c : s1.toCharArray()) {
            seen.add(c);
        }

        // 5. Check characters from s2
        for (char c : s2.toCharArray()) {
            if (seen.contains(c)) {
                return true;
            }
        }

        // 6. No common characters
        return false;
    }

    public static void main(String[] args) {
        TwoStringsSolver solver = new LidiyaAngelova();

        System.out.println(solver.hasCommonSubstring("bob", "leshta"));
        System.out.println(solver.hasCommonSubstring("mad", "kindness"));
        System.out.println(solver.hasCommonSubstring("joy", "love"));
        System.out.println(solver.hasCommonSubstring("", "hello"));
    }
}