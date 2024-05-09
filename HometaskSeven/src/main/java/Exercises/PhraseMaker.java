package Exercises;

import java.util.Arrays;

public class PhraseMaker {
    public String join(String[] words) {
        String[] newWords = Arrays.copyOf(words, words.length);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            String word = newWords[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }

            result.append(word);
            if (i != newWords.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));

    }
}
