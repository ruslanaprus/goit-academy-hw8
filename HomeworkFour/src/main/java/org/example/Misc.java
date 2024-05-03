package org.example;

import java.util.ArrayList;
import java.util.List;

public class Misc {
    public static void main(String[] args) {
        int amount = 546;
        int[] denominations = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        List<Integer> result = calculateDenominations(amount, denominations);
        System.out.println("Denominations for " + amount + " are: " + result);

        int num = 1;
        int num2 = num + (num+1) + (num+1);
        System.out.println("num2 = " + num2);

//        int result = digital_root(123);
//        System.out.println("result = " + result);
//        int count = countBanknotes(578);
//        System.out.println("count = " + count);

    }

    public static List<Integer> calculateDenominations(int amount, int[] denominations) {
        List<Integer> result = new ArrayList<>();
        int i = denominations.length - 1;
        while (amount > 0 && i >= 0) {
            while (amount >= denominations[i]) {
                result.add(denominations[i]);
                amount -= denominations[i];
            }
            i--;
        }
        return result;
    }


    public static int countBanknotes(int sum) {
        int[] array = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        return countBanknotesRecursion(sum, array, 0);
    }

    public static int countBanknotesRecursion(int sum, int[] array, int index){
        if (index >= array.length || sum <=0) {
            return 0;
        }

        if (sum / array[index] > 0) {
            int count = sum / array[index];
            return count + countBanknotesRecursion(sum % array[index], array, index);
        }
        return countBanknotesRecursion(sum, array, index + 1);
    }

    public static int digital_root(int number) {
        if (number < 10) {
            return number;
        }
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number = number / 10;
            System.out.println("sum = " + sum);
        }
        return digital_root(sum);
    }
}
