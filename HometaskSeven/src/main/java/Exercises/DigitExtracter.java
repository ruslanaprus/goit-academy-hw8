package Exercises;

import java.util.Arrays;
import java.util.ArrayList;

public class DigitExtracter {

    public int[] extract(String text) {
        ArrayList<Integer> result = new ArrayList<>();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                result.add(Character.getNumericValue(c));
            }
        }
        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
