package org.example;

public class Search {
    private static int counter = 0;

    public static void main(String[] args) {
        int[] array = new int[]{-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int resultElement = linearSearch(array, 2);
        int resultElement = binarySearch(array, 2);

//        int counter = 0;
//        int elementToSearch = 2;
//        int resultElement = -1;
//
//        for (int i = 0; i < array.length; i++){
//            counter++;
//            if(array[i] == elementToSearch){
//                resultElement = array[i];
//                break;
//            }
//        }

        System.out.println("array.length = " + array.length);
        System.out.println("resultElement = " + resultElement);
        System.out.println("counter = " + counter);
    }

    private static int linearSearch(int[] array, int elementToSearch){
        for (int i = 0; i < array.length; i++) {
            counter++;
            if(array[i] == elementToSearch) {
                return array[i];
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int elementToSearch){
        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex){
            counter++;
            int midIndex = (lowIndex + highIndex) / 2;
            int midElement = array[midIndex];
            if(midElement < elementToSearch){
                lowIndex = midIndex + 1;
            } else if (midElement > elementToSearch){
                highIndex = midIndex - 1;
            } else return midElement;
        }
        return -1;
    }
}
