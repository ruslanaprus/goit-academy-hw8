package Exercises;

import java.util.Arrays;

public class ShortWordCounter {

    public int count(String phrase, int minLength){
        int count = 0;
        String[] words = phrase.toLowerCase().split("\\s+");
        for (String word : words){
            if (word.length() <= minLength){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}
