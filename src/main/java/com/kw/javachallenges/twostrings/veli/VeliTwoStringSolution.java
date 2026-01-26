package com.kw.javachallenges.twostrings.veli;

import com.kw.javachallenges.twostrings.TwoStringsSolver;

import java.util.*;

public class VeliTwoStringSolution implements TwoStringsSolver {
    @Override
    public boolean hasCommonSubstring(String s1, String s2) {
        if (s1 == null || s2 == null) throw new IllegalArgumentException();

        if (s1.isEmpty() || s2.isEmpty()) return false;

        Set<Character> set = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (set.contains(c)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        VeliTwoStringSolution veli = new VeliTwoStringSolution();
        System.out.println(veli.hasCommonSubstring("veli", "gosho"));
        System.out.println(veli.hasCommonSubstring("veli", "nemi"));
        System.out.println(veli.hasCommonSubstring("veli", "mart"));
    }
}
