package Exercises;

import java.util.StringTokenizer;

public class NameCounter {

    public int count(String text) {
        int count = 0;
        StringTokenizer strTokenizer = new StringTokenizer(text);
        while (strTokenizer.hasMoreTokens()) {
            String word = strTokenizer.nextToken();
            if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));

    }
}
