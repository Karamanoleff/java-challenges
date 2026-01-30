# Two Strings Challenge

## Problem Description

Given two strings, determine if they share a common substring. A substring may be as small as one character.

This challenge mirrors the HackerRank "Two Strings" problem and focuses on efficient string comparison algorithms.

## Examples

```java
hasCommonSubstring("hello", "world")  // returns true (common: "l")
hasCommonSubstring("hi", "world")     // returns false (no common chars)
hasCommonSubstring("abc", "def")      // returns false (no common chars)
hasCommonSubstring("", "hello")       // returns false (empty string)
```

## Method to Implement

```java
boolean hasCommonSubstring(String s1, String s2);
```

## Requirements

- Handle null inputs appropriately (throw IllegalArgumentException)
- Handle empty strings (return false)
- Strings contain only lowercase English letters (a-z)
- String length: 1 ≤ length ≤ 100,000

## Rules for Participants

1. **Create your own package**: Create a new package under `com.kw.javachallenges.twostrings` with your name or identifier (e.g., `com.kw.javachallenges.twostrings.johndoe`)

2. **Implement the interface**: Create a class that implements `TwoStringsSolver`
   ```java
   package com.kw.javachallenges.twostrings.johndoe;
   
   import com.kw.javachallenges.twostrings.TwoStringsSolver;
   
   public class JohnDoeTwoStringsSolver implements TwoStringsSolver {
       @Override
       public boolean hasCommonSubstring(String s1, String s2) {
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

## Tips

- Consider the most efficient approach - you don't need to find the actual substring, just check if one exists
- Think about what data structures might help with character lookups
- Consider edge cases in your implementation

## Testing

Your implementation will be tested against various test cases including:
- Basic positive cases (strings with common characters)
- Negative cases (strings with no common characters)
- Edge cases (empty strings, single characters, null inputs)
- Performance cases (large strings)