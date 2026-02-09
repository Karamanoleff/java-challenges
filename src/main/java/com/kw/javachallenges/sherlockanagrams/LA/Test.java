package com.kw.javachallenges.sherlockanagrams.LA;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;

public class Test {
    public static void main(String[] args) {
        AnagramPairsCounter counter = new LidiyaAngelova();
        int result = counter.countAnagrammaticPairs("abba");
        System.out.println("Total pairs = " + result);
    }
}
