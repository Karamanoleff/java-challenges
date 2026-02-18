package com.kw.javachallenges.sherlockanagrams.alexandra;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AlexandraSherlockAnagramsSolution implements AnagramPairsCounter {

    @Override
    public int countAnagrammaticPairs(String s) {

        if(s==null) throw new IllegalArgumentException();
        if(s.length()<2) return 0;

        List <String> extractedSubstrings = new ArrayList<>();
        for(int start = 0; start < s.length(); start++) {
            for(int end = start + 1; end <= s.length(); end++) {
                extractedSubstrings.add(s.substring(start, end));
            }
        }

        int pairsCounter = 0;
        for (int s1 = 0; s1 < extractedSubstrings.size(); s1++) {
            for (int s2 = s1 + 1; s2 < extractedSubstrings.size(); s2++) {
                if(stringsAreAnagrams(extractedSubstrings.get(s1), extractedSubstrings.get(s2))) {
                    pairsCounter++;
                }
            }
        }

        System.out.println("Pair count is: " + pairsCounter);
        return pairsCounter;
    }

    public boolean stringsAreAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

}
