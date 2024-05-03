package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordDeleter {

    public String remove(String phrase, String[] words){
        StringBuilder s = new StringBuilder();
        String[] wordsFromPhrase = phrase.split("\\s+");
        for (String wordFromPhrase : wordsFromPhrase) {
            boolean isMatch = false;
            for (String word : words) {
                if (wordFromPhrase.equals(word)) {
                    isMatch = true;
                    break;
                }
            }
            if (!isMatch){
                s.append(wordFromPhrase).append(" ");
            }
        }
        System.out.println(s);
        return s.toString().trim();
    }

    public String removeWithHashMap(String phrase, String[] words){
        HashSet<String> wordsToRemove = new HashSet<>(Arrays.asList(words));
        StringBuilder s = new StringBuilder();
        String[] wordsFromPhrase = phrase.split("\\s+");
        for (String wordFromPhrase : wordsFromPhrase) {
            if (!wordsToRemove.contains(wordFromPhrase)) {
                s.append(wordFromPhrase).append(" ");
            }
        }
        System.out.println(s);
        return s.toString().trim();
    }

    public String removeWithList(String phrase, String[] words) {
        List<String> wordsList = new ArrayList<>(Arrays.asList(phrase.split("\\s+")));
        wordsList.removeAll(Arrays.asList(words));
        String result = String.join(" ", wordsList);
        System.out.println(result);
        return result;
    }

    public String removeWithRegex(String phrase, String[] words) {
        for (String word : words) {
            phrase = phrase.replaceAll("\\b" + word + "\\b", "");
        }
        phrase = phrase.replaceAll("\\s+", " ");
        return phrase.trim();
    }

    public static String removeWithPatternAndMatcher(String phrase, String[] words) {
        for (String word : words) {
            Pattern p = Pattern.compile("\\b" + word + "\\b");
            Matcher m = p.matcher(phrase);
            phrase = m.replaceAll("");
        }
        Pattern spacePattern = Pattern.compile("\\s+");
        Matcher spaceMatcher = spacePattern.matcher(phrase);
        phrase = spaceMatcher.replaceAll(" ");
        return phrase.trim();
    }

    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.removeWithPatternAndMatcher("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.removeWithPatternAndMatcher("This is Sparta", new String[] {"is"}));

        //"vys coe objiqono potou sydiesu yhypno", [coe, yhypno, vys, potou]
        System.out.println(wordDeleter.removeWithPatternAndMatcher("vys coe objiqono potou sydiesu yhypno", new String[] {"coe", "yhypno", "vys", "potou"}));

    }
}
