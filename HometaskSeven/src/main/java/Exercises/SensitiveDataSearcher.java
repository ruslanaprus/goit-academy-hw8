package Exercises;

import java.util.Arrays;

public class SensitiveDataSearcher {

    public boolean isSensitiveDataPresent(String phrase){
        String[] words = {"pass", "key", "login", "email"};
        String[] wordsFromPhrase = phrase.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+"); // replaceAll("\\p{Punct}", "");
        System.out.println(Arrays.toString(wordsFromPhrase));
        for (String wordFromPhrase : wordsFromPhrase) {
            for (String word : words) {
                if (wordFromPhrase.equals(word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
