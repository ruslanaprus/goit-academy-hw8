package Exercises;

public class DoubleSpaceCleaner {

    public String clean(String phrase){
        String result = phrase.trim();
        result = result.replaceAll("\\s+", " ");
        return result;
    }

    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
