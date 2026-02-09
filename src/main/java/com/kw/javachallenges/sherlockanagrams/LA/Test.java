package com.kw.javachallenges.sherlockanagrams.LA;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        AnagramPairsCounter counter = new LidiyaAngelova();
        int result = counter.countAnagrammaticPairs("");
        System.out.println("Total pairs = " + result);
    }
}
