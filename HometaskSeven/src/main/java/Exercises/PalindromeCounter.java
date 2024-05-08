package Exercises;

import java.util.Arrays;

public class PalindromeCounter {

    public int count(String phrase){
        int count = 0;
        String[] words = phrase.toLowerCase().split("\\s+");
        for (String word : words){
            if(isPalindrome(word)) {
                count++;
            }
        }
        return count;
    }
    public boolean isPalindrome(String word){
        StringBuilder s = new StringBuilder(word);
        String original = s.toString();
        String reversed = s.reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
