package com.kw.javachallenges.sherlockanagrams.LA;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;

import java.util.HashMap;
import java.util.Map;

public class LidiyaAngelova implements AnagramPairsCounter {

    @Override
    public int countAnagrammaticPairs(String s) {
        if (s == null)
            throw new IllegalArgumentException("String should not be null");

        if (s.length() < 2)
            return 0;

        Map<String, Integer> anagramCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);

                char[] chars = substring.toCharArray();
                java.util.Arrays.sort(chars);
                String sortedSubstring = new String(chars);

                anagramCounts.put(
                        sortedSubstring,
                        anagramCounts.getOrDefault(sortedSubstring, 0) + 1
                );
            }
        }
        int totalPairs = 0;

        for (int count : anagramCounts.values()) {
            if (count > 1) {
                totalPairs += count * (count - 1) / 2;
            }
        }
        return totalPairs;
    }
}