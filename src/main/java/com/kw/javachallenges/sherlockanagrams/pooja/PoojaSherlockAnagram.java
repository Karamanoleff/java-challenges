package com.kw.javachallenges.sherlockanagrams.pooja;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PoojaSherlockAnagram implements AnagramPairsCounter {

    @Override
    public int countAnagrammaticPairs(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        List<String> str1 = new ArrayList<>();
        for(int x =0;x<= s.length()-1;x++){
            for(int y=x+1;y<= s.length();y++){
                str1.add(s.substring(x,y));
            }
        }
        int count =0;
        char[] temp1,temp2= new char[0];
        for(int i =0;i<str1.size();i++){
            temp1=str1.get(i).toCharArray();
            Arrays.sort(temp1);
            for(int j=i+1;j<str1.size();j++){
                temp2=str1.get(j).toCharArray();
                Arrays.sort(temp2);
                if(Arrays.equals(temp1,temp2)){
                    count=count+1;
                }
            }
        }
        return count;
    }
}