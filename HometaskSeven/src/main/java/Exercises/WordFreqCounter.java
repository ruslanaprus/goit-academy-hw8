package Exercises;

import java.util.Arrays;

public class WordFreqCounter {
    public float countFreq(String phrase, String word){
        int count = 0;
        String[] words = phrase.toLowerCase().split("\\s+");
        for (String search : words){
            if (word.toLowerCase().equals(search)){
                count++;
            }
        }
        System.out.println(Arrays.toString(words));
        return (float)count/words.length;
    }

    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));

        //0.2222222238779068
        System.out.println(freqCounter.countFreq("teannov vi Umabkuxygo iklaowdabaq higecep wezukidim Umabkuxygo fipohice jekitaxoedb", "Umabkuxygo"));
    }
}
