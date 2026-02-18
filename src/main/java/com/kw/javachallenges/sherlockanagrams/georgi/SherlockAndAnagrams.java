package com.kw.javachallenges.sherlockanagrams.georgi;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


public class SherlockAndAnagrams implements AnagramPairsCounter {

    public static void main(String[] args) {
        SherlockAndAnagrams testSolution = new SherlockAndAnagrams();

        String s = "popping";
        int result = testSolution.countAnagrammaticPairs(s);

        System.out.println("Value: " + s);
        System.out.println("Anagrammatic pairs: " + result);

    }

    @Override
    public int countAnagrammaticPairs(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                char[] chars = sub.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        int result = 0;
        for (int countOfSubstring : map.values()) {
            if (countOfSubstring  > 1) {
                result += countOfSubstring  * (countOfSubstring  - 1) / 2;
            }
        }

        return result;
    }
}
