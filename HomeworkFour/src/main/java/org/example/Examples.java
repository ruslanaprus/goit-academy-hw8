package org.example;

import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {

        int executeCount = 5;

        for (; ; ) {
            System.out.println("Execute loop, executeCount = " + executeCount);
            if (--executeCount <= 0) {
                break;
            }
        }

        for (; ; ) {
            System.out.println("Execute loop, executeCount = " + executeCount);
            executeCount --;
            if (--executeCount <= 0) {
                break;
            }
        }

        for(;executeCount > 0; executeCount--){
            System.out.println("executeCount = " + executeCount);
        }

//        // incorrect loop
//        for(short i = 0; i < 5; i--){
//            System.out.println("i: " + i);
//        }
        
        for(int i = 0; i <= 100; i++){
            if (i%10 != 0){
                continue;
            }
            System.out.println("i = " + i);
        }

        int k = -1;
        while(k <= 100){
            k++;

            if (k%10 != 0){
                continue;
            }
            System.out.println("i = " + k);
        }



        // modifying array of String
        String[] fruits = {"banana", "peach", "apple"};
        for(int i = 0; i < fruits.length; i++){
            String fruit = fruits[i];

            String firstLetter = fruit.substring(0,1);
            String remainder = fruit.substring(1);

            String fixedFruitName = firstLetter.toUpperCase() + remainder;
            System.out.println(fixedFruitName);
        }

        for(int i = 0; i < fruits.length; i++){
            String fruit = fruits[i];

            char firstLetter = fruit.charAt(0);
            String remainder = fruit.substring(1);

            String fixedFruitName = Character.toUpperCase(firstLetter) + remainder;
            fruits[i] = fixedFruitName;
        }

        System.out.println("fruits = " + Arrays.toString(fruits));


    }

}
