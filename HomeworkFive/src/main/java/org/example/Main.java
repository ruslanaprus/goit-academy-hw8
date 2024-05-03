package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
        System.out.println(p1.hashCode() == p2.hashCode()); //Should be true
        System.out.println(p1.hashCode() == p3.hashCode()); //Can be true or false
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());

    }

    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i += 2) {
            result *= i;
        }
        return result;
    }


//        int number = 576;
//        int[] digitArray = new int[String.valueOf(number).length()];
//        int count = 0;
//
//        while (number > 0) {
//            digitArray[count] = (number % 10);
//            number = number / 10;
//            count++;
//        }
//        System.out.println(Arrays.toString(digitArray));
//        String res = "";
//        for(int i = digitArray.length - 1; i >= 0; i--){
//            if(i == 3) res += "Z".repeat(digitArray[i]);
//            if(i == 2) res += "Y".repeat(digitArray[i]);
//            if(i == 1) res += "X".repeat(digitArray[i]);
//            if(i == 0) res += "*".repeat(digitArray[i]);
//        }
//        System.out.println("res = " + res);


//        int numberInt = 576;
//        String number = String.valueOf(numberInt);
//        System.out.println(number);
//        for (int i = number.length() - 1; i >= 0; i--) {
//            char c = number.charAt(i);
//            System.out.println(c);
//        }



//        int num = 576;
//        int[] array = {500, 200, 100, 50, 20, 10, 5, 2, 1};
//
//        for (int i = 0; i < array.length; i++) {
//            int count = 0;
//            if (num / array[i] > 0) {
//                count = num / array[i];
//                num = num % array[i];
//            }
//
//            System.out.println("count of " + array[i] + " = " + count);
//            System.out.println("num = " + num);
//        }

}