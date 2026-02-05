package com.kw.javachallenges.sherlockanagrams;

import java.util.*;

public class PeterRoussevAnagramPairsCounter implements AnagramPairsCounter {
    @Override
    public int countAnagrammaticPairs(String s) {

        List<String> resultS1 = new ArrayList<>();
        Map<String, String> finalResult = new HashMap<>();
        for (int i = 1; i <= s.length() - 1; i++) {
            for (int j = 0; j + i <= s.length(); j++) {
                resultS1.add(s.substring(j, j + i));
            }
        }
        for (String string : resultS1) {
            List<String> listWithStringItselfExcluded = new ArrayList<>(resultS1);
            listWithStringItselfExcluded.remove(string);
            List<String> list = listWithStringItselfExcluded.stream().filter(str -> str.length() == string.length()).toList();
            list.forEach(str -> {
                List<Character> str1 = getChars(str);
                List<Character> str2 = getChars(string);
                if(str1.containsAll(str2) && str2.containsAll(str1)) {
                    finalResult.put(string, str);
                }
            });
        }
        System.out.println(finalResult);
        return finalResult.size();
    }

    public static void main(String[] args) {
        PeterRoussevAnagramPairsCounter counter = new PeterRoussevAnagramPairsCounter();
        System.out.println(counter.countAnagrammaticPairs("parttra"));

    }

    public List<Character> getChars(String str) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        return list;
    }
}
