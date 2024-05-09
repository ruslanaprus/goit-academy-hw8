package Exercises;

import java.util.Arrays;

public class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] newNumbers = Arrays.copyOf(numbers, numbers.length);
        for(int number: newNumbers) {
            stringBuilder.append(number);
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));

    }
}
