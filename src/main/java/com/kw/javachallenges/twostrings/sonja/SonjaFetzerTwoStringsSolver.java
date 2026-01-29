package com.kw.javachallenges.twostrings.sonja;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

public class SonjaFetzerTwoStringsSolver implements TwoStringsSolver {

    public static void main(String[] args) {
        SonjaFetzerTwoStringsSolver solver = new SonjaFetzerTwoStringsSolver();

        System.out.println("=============================================");
        System.out.println("Testing Two Strings Implementation");
        System.out.println("=============================================");

        System.out.println("hasCommonSubstring(\"hello\", \"world\"): " + solver.hasCommonSubstring("hello", "world"));
        System.out.println("hasCommonSubstring(\"hi\", \"world\"): " + solver.hasCommonSubstring("hi", "world"));
        System.out.println("hasCommonSubstring(\"abc\", \"def\"): " + solver.hasCommonSubstring("abc", "def"));
        System.out.println("hasCommonSubstring(\"\", \"hello\"): " + solver.hasCommonSubstring("", "hello"));

        System.out.println("=============================================");
    }

    @Override
    public boolean hasCommonSubstring(String s1, String s2) {

    //Check if s1 and/or s2 are null, if so throw exception
        if (s1 == null || s2 == null) throw new IllegalArgumentException("Input is null");

    //Check if s1 and/or s2 is empty, if so, return false
        if (s1.isEmpty() || s2.isEmpty()) return false;

        //Determines the shorter string
        String shorter;
        String longer;

        if (s1.length() <= s2.length()){
            shorter = s1;
            longer = s2;
        } else {
            shorter = s2;
            longer = s1;
        }

       for(int a = 0; a < shorter.length(); a++){
           for(int b = 0; b <longer.length(); b++){
               if(shorter.charAt(a) == longer.charAt(b)){
                   return true;
               }
           }
       }
        return false;
    }
}
