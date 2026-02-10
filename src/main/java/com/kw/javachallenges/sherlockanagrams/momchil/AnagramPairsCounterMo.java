package com.kw.javachallenges.sherlockanagrams.momchil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;


public class AnagramPairsCounterMo implements AnagramPairsCounter {
    @Override
    public int countAnagrammaticPairs(String s) {  //Define method and structure.
        Map<String, Integer> map = new HashMap<>();

        if (s == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }
        if (s.isEmpty() || s.length() > 100) {
            throw new IllegalArgumentException("Strings should be between 1 and 100 characters");
        }
        s = s.toLowerCase();

        if (s.isEmpty())
            return 0;

        for (int i = 0; i < s.length(); i++) {              //Creating nested for cycle for all substrings.
            for (int j = i + 1; j <= s.length(); j++) {
                String s1 = s.substring(i, j);

                char[] chars = s1.toCharArray();
                Arrays.sort(chars);
                String sortedSub = new String(chars);

                map.put(sortedSub, map.getOrDefault(sortedSub, 0) + 1);
            }
        }

        int totalPairs = 0;
        for (int count : map.values()) {
            totalPairs += (count * (count - 1)) / 2;
        }
        return totalPairs;

    }

    public static void main(String[] args) {
        AnagramPairsCounterMo calculator = new AnagramPairsCounterMo();
        String anagramPairs = "";
        System.out.println("Anagrams in ' " + anagramPairs + "': " + calculator.countAnagrammaticPairs(anagramPairs));
        String anagramPairs1 = null;
        System.out.println("Anagrams in ' " + anagramPairs1 + "': " + calculator.countAnagrammaticPairs(anagramPairs1));
        String anagramPairs2 = "test";
        System.out.println("Anagrams in ' " + anagramPairs2 + "': " + calculator.countAnagrammaticPairs(anagramPairs2));
        String anagramPairs3 = "user";
        System.out.println("Anagram in ' " + anagramPairs3 + "': " + calculator.countAnagrammaticPairs(anagramPairs3));
    }
}
