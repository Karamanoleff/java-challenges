package com.kw.javachallenges.twostrings.mircea;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

import java.util.HashSet;
import java.util.Set;

public class TwoStringsSolutionWhatIWouldDo implements TwoStringsSolver {

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("At least one string is null");
        }

        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // do a swap in order to go through the shorter string (more efficient)
        // on a 100k string, it improves performance by 10-20%
        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        Set<Character> charsSeenInShorterString = new HashSet<>(s1.length());

        for (int i = 0; i < s1.length(); i++) {
            charsSeenInShorterString.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            if (charsSeenInShorterString.contains(s2.charAt(i))) {
                return true;
            }
        }

        return false;
    }
}
