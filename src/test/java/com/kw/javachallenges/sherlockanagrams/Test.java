package com.kw.javachallenges.sherlockanagrams;

import com.kw.javachallenges.sherlockanagrams.LA.LidiyaAngelova;

public class Test {
    public static void main(String[] args) {
        AnagramPairsCounter counter = new LidiyaAngelova();
        int result = counter.countAnagrammaticPairs("abba");
        System.out.println("Total pairs = " + result);
    }
}
