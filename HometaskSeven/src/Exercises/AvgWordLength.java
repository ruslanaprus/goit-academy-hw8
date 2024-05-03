package Exercises;

public class AvgWordLength {

    public double count(String phrase){
        int sum = 0;
        int count = 0;
        String[] words = phrase.toLowerCase().split("\\s+");
        for (String word : words){
            sum += word.length();
            count++;
        }
        return (double)sum/count;
    }

    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
