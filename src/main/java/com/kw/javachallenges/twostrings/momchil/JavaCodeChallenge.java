package com.kw.javachallenges.twostrings.momchil;
import java.util.*;

public class JavaCodeChallenge {

    public static void main(String[] args) {

        System.out.print("Enter whole number: ");
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine();

        while (q-- > 0) {
            System.out.print("Enter first string: ");
            String s1 = scanner.nextLine();
            System.out.print("Enter second string: ");
            String s2 = scanner.nextLine();

            System.out.println(twoStrings(s1, s2));
        }
        scanner.close();
    }

    private static String twoStrings(String s1, String s2) {
        Set<Character> chars = new HashSet<>();

        for (char c : s1.toCharArray()) {
            chars.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (chars.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }
}
