package Exercises;

import org.apache.commons.collections.set.PredicatedSet;

public class PalindromeDetector {

    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        StringBuilder result = new StringBuilder(word);
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        //false
        System.out.println(new PalindromeDetector().isPalindrome("Java"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));

    }
}
