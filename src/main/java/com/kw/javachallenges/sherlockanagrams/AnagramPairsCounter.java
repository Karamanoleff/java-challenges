package com.kw.javachallenges.sherlockanagrams;

import com.kw.javachallenges.common.Challenge;

/**
 * Sherlock and Anagrams Challenge Interface
 * <p>
 * This interface defines the contract for solving the "Sherlock and Anagrams" problem,
 * which mirrors the HackerRank challenge of the same name.
 * </p>
 * 
 * <h3>Problem Description:</h3>
 * <p>
 * Given a string, find the number of pairs of substrings that are anagrams of each other.
 * Two strings are anagrams if they contain the same characters with the same frequency,
 * but in different order.
 * </p>
 * 
 * <h3>Examples:</h3>
 * <ul>
 *   <li>countAnagrammaticPairs("abba") → 4
 *       <br>Anagrammatic pairs: (a,a), (ab,ba), (b,b), (abb,bba)</li>
 *   <li>countAnagrammaticPairs("abcd") → 0 (no anagrammatic pairs)</li>
 *   <li>countAnagrammaticPairs("ifailuhkqq") → 3
 *       <br>Anagrammatic pairs: (i,i), (q,q), (ifa,fai)</li>
 *   <li>countAnagrammaticPairs("") → 0 (empty string)</li>
 * </ul>
 * 
 * <h3>Detailed Example for "abba":</h3>
 * <pre>
 * Substrings: a, b, b, a, ab, bb, ba, abb, bba, abba
 * Anagrammatic pairs:
 * - "a" (index 0) and "a" (index 3) → 1 pair
 * - "b" (index 1) and "b" (index 2) → 1 pair  
 * - "ab" (index 0-1) and "ba" (index 2-3) → 1 pair
 * - "abb" (index 0-2) and "bba" (index 1-3) → 1 pair
 * Total: 4 pairs
 * </pre>
 * 
 * <h3>Constraints:</h3>
 * <ul>
 *   <li>String contains only lowercase English letters (a-z)</li>
 *   <li>String length: 1 ≤ length ≤ 100</li>
 *   <li>Handle edge cases like empty or null strings appropriately</li>
 * </ul>
 */
public interface AnagramPairsCounter extends Challenge {
    
    /**
     * Counts the number of pairs of substrings that are anagrams of each other.
     * 
     * @param s the input string to analyze
     * @return the number of anagrammatic pairs found in the string
     * @throws IllegalArgumentException if the string is null
     */
    int countAnagrammaticPairs(String s);
}