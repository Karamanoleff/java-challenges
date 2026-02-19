package com.kw.javachallenges.sherlockanagrams.LA;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LidiyaAngelova implements AnagramPairsCounter {

    @Override
    public int countAnagrammaticPairs(String s) {
        if (s == null)
            throw new IllegalArgumentException("String should not be null");

        if (s.length() < 2)
            return 0;

        //Store  sorted substrings
        List<String> sortedSubstrings = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                String substring = s.substring(i, j);

                char[] chars = substring.toCharArray();
                Arrays.sort(chars);

                String sortedSubstring = new String(chars);

                sortedSubstrings.add(sortedSubstring);
            }
        }

        // Compare substrings
        int totalPairs = 0;

        for (int i = 0; i < sortedSubstrings.size(); i++) {
            for (int j = i + 1; j < sortedSubstrings.size(); j++) {

                if (sortedSubstrings.get(i).equals(sortedSubstrings.get(j))) {
                    totalPairs++;
                }
            }
        }

        return totalPairs;
    }
}