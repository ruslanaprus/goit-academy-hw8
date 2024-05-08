package Exercises;

import java.util.HashSet;

public class UniqueCharCounter {

    public int count(String phrase){
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : phrase.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size();
    }

    public static int countUniqueCharacters(String phrase) {
        boolean[] seen = new boolean[128];
        int count = 0;
        for (char c : phrase.toCharArray()) {
            int index = (int) c;
            if (!seen[index]) {
                seen[index] = true;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.countUniqueCharacters("123"));

        //4
        System.out.println(charCounter.countUniqueCharacters("ab100"));

        //3
        System.out.println(charCounter.countUniqueCharacters("Java"));
    }
}
