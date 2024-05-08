package Exercises;

public class WaterCounter {

    public double count(String text){
        String symbols = " ";
        int count = 0;
        for(char c : text.toCharArray()){
            if(symbols.contains(String.valueOf(c))){
                count++;
            }
        }
        return (double)count/text.length();
    }

    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
