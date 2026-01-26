package com.kw.javachallenges.twostrings.petersch;

import java.util.ArrayList;
import java.util.List;

import com.kw.javachallenges.twostrings.TwoStringsSolver;


public class PeterSchwuerzenbeckTwoStringsSolver implements TwoStringsSolver {

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {
        // input validation ´
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }

        List<String> inputStrings = List.of(s1, s2);
        for (String s : inputStrings) {
            if (s.length() > 100000) {
                throw new IllegalArgumentException("Input string has more that 100000 characters");
                // check min length
            } else if (s.isEmpty()) {
                return false;
            }

            // check only lowercase characters
            for (char c : s.toCharArray()) {
                if (!Character.isLowerCase(c)) {
                    throw new IllegalArgumentException("Input strings must contain only lowercase characters");
                }
            }
        }

        // check which string is shorter
        String shorterString;
        String longerString;

        if (s1.length() <= s2.length()) {
            shorterString = s1;
            longerString = s2;
        } else {
            shorterString = s2;
            longerString = s1;
        }

        // compare characters of shorter string are contained in longer string
        List<Character> charsOfShortAlreadyCompared = new ArrayList<>();
        for (char cShort : shorterString.toCharArray()) {
            // check only character of short string is no duplicate
            if (!charsOfShortAlreadyCompared.contains(cShort)) {
                charsOfShortAlreadyCompared.add(cShort);
                List<Character> charsOfLongAlreadyCompared = new ArrayList<>();
                for (char cLong : longerString.toCharArray()) {
                    // check only character of long string is no duplicate
                    if (!charsOfLongAlreadyCompared.contains(cLong)) {
                        charsOfLongAlreadyCompared.add(cLong);
                        if (cShort == cLong) {
                            return true;
                        }
                    }

                }
            }

        }
        return false;
    }
}