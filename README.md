# Java Code Challenges

Welcome to the Java Code Challenges repository! This is a learning initiative designed to help junior developers practice their Java programming skills through hands-on coding exercises.

## Introduction

This repository contains programming challenges inspired by HackerRank problems. The goal is to provide a supportive environment for learning, practicing Java concepts, and discussing different approaches to problem-solving. Each challenge is an opportunity to strengthen your coding skills and learn from others.

## Project Structure

This is a single Maven project organized as follows:

- Each coding challenge has its own package under `com.kw.javachallenges`
- Within each challenge package, participants create their own sub-package for solutions
- Each challenge provides an interface that your solution must implement
- Test cases are included to validate the correctness of your implementation

## Getting Started

1. Clone this repository to your local machine
2. Open the project in IntelliJ IDEA
3. Ensure Java 21 is configured as your project SDK
4. Run `mvn test` to verify everything is set up correctly

## How to Submit a Solution

1. Create a new branch from main for your work
2. Navigate to the challenge package you want to solve
3. Create your own package using your name or initials (e.g., `johnsmith` or `js`)
4. Implement the provided interface in your package
5. Do not modify existing tests or other participants' code
6. Open a merge request when your solution is ready

## Rules & Guidelines

- Create one package per participant under each challenge
- Focus on writing correct, readable code
- You may use Google, documentation, and other resources
- Feel free to ask questions if you get stuck
- This is a learning exercise, not a competition
- Respect others' code and avoid modifying shared files

## Challenges Overview

### Two Strings (Easy)
Determine if two strings share any common characters. This challenge helps practice string manipulation and character comparison techniques.

### Sherlock and Anagrams (Medium)
Find the number of anagram pairs within a given string. This problem involves understanding anagrams, string processing, and efficient counting algorithms.

## Running Tests

Execute all tests using Maven:

```
mvn test
```

The test suite will validate that your implementation produces the correct results for the provided test cases. Tests focus solely on correctness - there are no performance requirements for these learning exercises.