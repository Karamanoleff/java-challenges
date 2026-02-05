package com.kw.javachallenges.sherlockanagrams.LA;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;

public class LidiyaAngelova implements AnagramPairsCounter {

    @Override
    public int countAnagrammaticPairs(String s) {
        if (s == null)
            throw new IllegalArgumentException("String should not be null");

        if (s.length()<2)
            return 0;
        return 0;
    }
}