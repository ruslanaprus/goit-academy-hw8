package Exercises;

import java.util.Arrays;
import java.util.StringJoiner;

public class Phrase {
    private final String[] words;

    public Phrase(String[] words) {
        this.words = Arrays.copyOf(words, words.length);
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(" ");
        for (String word : words) {
            result.add(word);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
