package com.kw.javachallenges.sherlockanagrams.lyubomirmarchev;

import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;

import java.util.HashMap;
import java.util.Map;

/*
 * Goal:
 * Count how many pairs of substrings are anagrams.
 *
 * Instead of comparing every substring with every other substring
 * (which would be slow), we:
 *
 * 1) Generate all substrings
 * 2) Convert each substring into a "signature"
 *    -> a frequency count of letters a-z
 * 3) Store how many times each signature appears
 * 4) Use combinatorics to count pairs
 */

public class LyubomirAnagrams implements AnagramPairsCounter {

    @Override
    public int countAnagrammaticPairs(String s) {

        // =============================
        // STEP 1 — Input validation
        // =============================

        // Requirement: throw exception if null
        if (s == null) {
            throw new IllegalArgumentException("Input string must not be null");
        }

        // If empty string -> no substrings -> no anagram pairs
        if (s.isEmpty()) {
            return 0;
        }

        // Length of the input string
        int n = s.length();

        // Map that will store:
        // KEY   = signature of substring (frequency pattern)
        // VALUE = how many substrings share this signature
        Map<String, Integer> signatureCounts = new HashMap<>();


        // =============================
        // STEP 2 — Generate substrings
        // =============================

        /*
         * We use TWO loops:
         *
         * start = where substring begins
         * end   = where substring ends
         *
         * Example for "abba":
         *
         * start=0 -> a, ab, abb, abba
         * start=1 -> b, bb, bba
         * start=2 -> b, ba
         * start=3 -> a
         */

        for (int start = 0; start < n; start++) {

            // Frequency array for letters a-z
            // index 0 = 'a'
            // index 1 = 'b'
            // ...
            // index 25 = 'z'
            int[] freq = new int[26];

            for (int end = start; end < n; end++) {

                // Get current character
                char c = s.charAt(end);

                // Convert character into array index
                // Example:
                // 'a' - 'a' = 0
                // 'b' - 'a' = 1
                // 'c' - 'a' = 2
                freq[c - 'a']++;

                /*
                 * Convert frequency array into a string signature.
                 *
                 * Example:
                 *   substring "ab" -> [1,1,0,0,0...]
                 *   substring "ba" -> [1,1,0,0,0...]
                 *
                 * Same signature => anagrams
                 */
                String sig = toSignature(freq);

                /*
                 * Store signature count in map.
                 *
                 * merge(key, value, function):
                 *  - if key doesn't exist -> insert with value
                 *  - if key exists -> apply function (sum)
                 */
                signatureCounts.merge(sig, 1, Integer::sum);
            }
        }


        // =============================
        // STEP 3 — Count anagram pairs
        // =============================

        /*
         * If a signature appears N times,
         * number of unique pairs = N * (N - 1) / 2
         *
         * Example:
         *  N=3 -> pairs:
         *    A-B
         *    A-C
         *    B-C
         *  => 3 pairs
         */

        int pairs = 0;

        for (int count : signatureCounts.values()) {
            pairs += count * (count - 1) / 2;
        }

        return pairs;
    }


    // =============================
    // Helper method
    // =============================

    /*
     * Converts frequency array into a unique string key.
     *
     * We use '#' as separator to avoid ambiguity.
     *
     * Example:
     *   [1,11] != [11,1]
     */
    private static String toSignature(int[] freq) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            sb.append(freq[i]).append('#');
        }

        return sb.toString();
    }
}
