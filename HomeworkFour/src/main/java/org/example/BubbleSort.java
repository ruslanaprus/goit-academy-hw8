package org.example;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {10, 9, 35, 0, 8, 3, 56, 23, 13};
        sort(numbers);
        sortWithForLoop(numbers);
        int[] array = new int[]{0, -2, -1, -5, 10, 12, 2, 78, 44};
        bubbleSort(array);
        System.out.println("array = " + Arrays.toString(array));

    }

    public static void sort(int[] values){
        boolean isSorted = false;

        while(!isSorted){
            isSorted = true;

            for(int i=0; i < values.length - 1; i++){
                int current = values[i];
                int next = values[i+1];

                if(current > next){
                    values[i+1] = current;
                    values[i] = next;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(values));
        }
    }

    public static void sortWithForLoop(int[] values){
        boolean isSorted = false;

        for (;;){
            isSorted = true;

            for(int i=0; i < values.length - 1; i++){
                int current = values[i];
                int next = values[i+1];

                if(current > next){
                    values[i+1] = current;
                    values[i] = next;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
            System.out.println(Arrays.toString(values));
        }
    }

    private static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
