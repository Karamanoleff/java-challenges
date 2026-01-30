package com.kw.javachallenges.twostrings;

import com.kw.javachallenges.common.Challenge;

/**
 * Two Strings Challenge Interface
 * <p>
 * This interface defines the contract for solving the "Two Strings" problem,
 * which mirrors the HackerRank challenge of the same name.
 * </p>
 * 
 * <h3>Problem Description:</h3>
 * <p>
 * Given two strings, determine if they share a common substring. A substring may be
 * as small as one character. For example, the words "hello" and "world" share the 
 * common substring "l".
 * </p>
 * 
 * <h3>Examples:</h3>
 * <ul>
 *   <li>hasCommonSubstring("hello", "world") → true (common substring: "l")</li>
 *   <li>hasCommonSubstring("hi", "world") → false (no common characters)</li>
 *   <li>hasCommonSubstring("abc", "def") → false (no common characters)</li>
 *   <li>hasCommonSubstring("", "hello") → false (empty string)</li>
 * </ul>
 * 
 * <h3>Constraints:</h3>
 * <ul>
 *   <li>Both strings contain only lowercase English letters (a-z)</li>
 *   <li>String length: 1 ≤ length ≤ 100,000</li>
 *   <li>Handle edge cases like empty or null strings appropriately</li>
 * </ul>
 */
public interface TwoStringsSolver extends Challenge {
    
    /**
     * Determines if two strings share at least one common substring (character).
     * 
     * @param s1 the first string to compare
     * @param s2 the second string to compare
     * @return true if the strings share a common substring, false otherwise
     * @throws IllegalArgumentException if either string is null
     */
    boolean hasCommonSubstring(String s1, String s2);
}