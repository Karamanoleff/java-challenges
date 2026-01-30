# Sherlock and Anagrams Challenge

## Problem Description

Given a string, find the number of pairs of substrings that are anagrams of each other. Two strings are anagrams if they contain the same characters with the same frequency, but in different order.

This challenge mirrors the HackerRank "Sherlock and Anagrams" problem and focuses on substring generation and anagram detection algorithms.

## Examples

### Example 1: "abba" → 4 pairs
```
Substrings: a, b, b, a, ab, bb, ba, abb, bba, abba

Anagrammatic pairs:
1. "a" (position 0) and "a" (position 3)
2. "b" (position 1) and "b" (position 2)  
3. "ab" (positions 0-1) and "ba" (positions 2-3)
4. "abb" (positions 0-2) and "bba" (positions 1-3)

Total: 4 pairs
```

### Example 2: "abcd" → 0 pairs
```
All substrings are unique, no anagrams possible.
```

### Example 3: "ifailuhkqq" → 3 pairs
```
Anagrammatic pairs:
1. "i" appears twice at different positions
2. "q" appears twice at different positions  
3. "ifa" and "fai" are anagrams
```

## Method to Implement

```java
int countAnagrammaticPairs(String s);
```

## Requirements

- Handle null inputs appropriately (throw IllegalArgumentException)
- Handle empty strings (return 0)
- String contains only lowercase English letters (a-z)
- String length: 1 ≤ length ≤ 100

## Rules for Participants

1. **Create your own package**: Create a new package under `com.kw.javachallenges.sherlockanagrams` with your name or identifier (e.g., `com.kw.javachallenges.sherlockanagrams.johndoe`)

2. **Implement the interface**: Create a class that implements `AnagramPairsCounter`
   ```java
   package com.kw.javachallenges.sherlockanagrams.johndoe;
   
   import com.kw.javachallenges.sherlockanagrams.AnagramPairsCounter;
   
   public class JohnDoeAnagramPairsCounter implements AnagramPairsCounter {
       @Override
       public int countAnagrammaticPairs(String s) {
           // Your implementation here
       }
   }
   ```

3. **Do not modify**:
   - Other participants' code
   - Test files
   - Interface definitions
   - Common classes

4. **Submit via merge request**: Create a merge request with your implementation for code review

## Algorithm Hints

1. **Generate all substrings**: For a string of length n, generate all possible substrings
2. **Group by anagram signature**: Two strings are anagrams if they have the same character frequency
3. **Count pairs**: For each group of anagrams, count pairs using combination formula: n*(n-1)/2

## Key Considerations

- **Anagram detection**: How will you efficiently determine if two strings are anagrams?
- **Substring generation**: What's the most efficient way to generate all substrings?
- **Optimization**: Can you avoid comparing every substring with every other substring?

## Testing

Your implementation will be tested against various test cases including:
- Basic cases with known anagram pairs
- Edge cases (empty strings, single characters, null inputs)
- Cases with no anagrammatic pairs
- Cases with multiple anagrammatic groups
- Performance cases (strings near the maximum length)