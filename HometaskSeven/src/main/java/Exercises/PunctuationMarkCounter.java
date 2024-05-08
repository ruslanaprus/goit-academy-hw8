package Exercises;

public class PunctuationMarkCounter {
    public int count(String phrase){
        String symbols = ".,!:;";
        int count = 0;
        for(char c : phrase.toCharArray()){
            if(symbols.contains(String.valueOf(c))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
