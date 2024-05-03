package org.example;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int result = countBanknotes(578);
        System.out.println("result = " + result);
    }

    public static int countBanknotesWhileLoop(int sum){
        int[] array = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;

        while (i < array.length) {
            if (sum / array[i] > 0) {
                count += sum / array[i];
                sum = sum % array[i];
            }
            i++;
        }
        return count;
    }

    public static int countBanknotesForLoop(int sum){
        int[] array = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (sum / array[i] > 0) {
                count += sum / array[i];
                sum = sum % array[i];
            }
        }
        return count;
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

        /*
        int num = 578;
        int[] array = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < array.length; i++){
            int count = 0;
            if(num/array[i] > 0) {
                count = num/array[i];
                num = num%array[i];
            }

            System.out.println("count of " + array[i] + " = " + count);
            System.out.println("num = " + num);
         */
        /*

        int count500 = 0;
        int count200 = 0;
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;
        int count2 = 0;
        if(num/500 > 0) {
            count500 = num/500;
            num = num%500;
        }
        System.out.println("count500 = " + count500);
        System.out.println("num = " + num);

        if (num/200 > 0) {
            count200 = num/200;
            num = num%200;
        }

        System.out.println("count200 = " + count200);
        System.out.println("num = " + num);

        if (num/100 > 0) {
            count100 = num/100;
            num = num%100;
        }

        System.out.println("count100 = " + count100);
        System.out.println("num = " + num);

        if (num/50 > 0) {
            count50 = num/50;
            num = num%50;
        }

        System.out.println("count50 = " + count50);
        System.out.println("num = " + num);

        if (num/20 > 0) {
            count20 = num/20;
            num = num%20;
        }
        System.out.println("count20 = " + count20);
        System.out.println("num = " + num);
*/
}



// 17 - The bank installs ATMs throughout the city that dispense money in paper bills.
// The ATM always has a sufficient amount of bills
// in denominations of 500, 200, 100, 50, 20, 10, 5, 2 and 1 dollars.

// Write a program whose input is the amount to be dispensed by the ATM.
// The program must return the minimum number of bills that can be used to issue this amount.
//
// method public int countBanknotes(int sum) accepts one parameter sum -
// the amount of money to be issued, and returns the minimum number of banknotes
// that can be used to issue this amount.