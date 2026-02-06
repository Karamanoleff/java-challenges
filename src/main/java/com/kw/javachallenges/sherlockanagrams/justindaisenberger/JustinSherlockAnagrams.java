package com.kw.javachallenges.sherlockanagrams.justindaisenberger;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JustinSherlockAnagrams implements AnagramPairsCounter {

    @Override
    public int countAnagrammaticPairs(String s) {

        System.out.println("String: " + s);

        if(s==null) throw new IllegalArgumentException();
        if(s.length()<2) return 0;

        int pairCount = 0;

        List<String> allSubstrings = getSubstrings(s);

        for (int i = 0; i < allSubstrings.size(); i++) {
            for (int j = i + 1; j < allSubstrings.size(); j++) {
                if(isAnagramPair(allSubstrings.get(i), allSubstrings.get(j))) {
                    System.out.println(allSubstrings.get(i) + " " + allSubstrings.get(j));
                    pairCount++;
                }
            }
        }

        return pairCount;
    }

    private List<String> getSubstrings (String s) {

        List <String> extractedSubstrings = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j <= s.length(); j++) {
                extractedSubstrings.add(s.substring(i, j));
            }
        }

        return extractedSubstrings;
    }

    private boolean isAnagramPair(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
