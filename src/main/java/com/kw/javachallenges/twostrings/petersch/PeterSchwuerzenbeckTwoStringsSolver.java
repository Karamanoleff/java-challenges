package com.kw.javachallenges.twostrings.petersch;

import com.kw.javachallenges.twostrings.TwoStringsSolver;


public class PeterSchwuerzenbeckTwoStringsSolver implements TwoStringsSolver {

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {
        // input validation ´
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }

        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // check which string is shorter
        String shorterString = s1.length() <= s2.length() ? s1 : s2;
        String longerString = s1.length() <= s2.length() ? s2 : s1;

        // compare characters of shorter string with longer string
        for (char cShort : shorterString.toCharArray()) {
            for (char cLong : longerString.toCharArray()) {
                if (cShort == cLong) {
                    return true;
                }
            }

        }
        return false;
    }
}