package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // task 5
        String[] arr = createEmptyNameArray();
        System.out.println(Arrays.toString(arr));
        //task 6
        int[] ageArray = new Main().createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ageArray));
        //task 7
        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new Main().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));
        //task 9
        String[] results = new String[]{"miho", "hut"};
        new Main().changeElectResult(results);
        System.out.println(Arrays.toString(results));
        //task 10
        String[] result = new String[]{"mix", "max", "pex", "fux", "rox"};
        String[] changedResults = new Main().changeElectResultAgain(result);
        System.out.println(Arrays.toString(changedResults));


    }


    // 5 - initialise empty array
    public static String[] createEmptyNameArray() {
        String[] result = {}; // String[] result = new String[0];
        return result;
    }

    // 6 - initialise array with numbers passed to a method
    public int[] createAgeArray(int age1, int age2, int age3, int age4){
        int[] array = {age1, age2, age3, age4};
        return array;
    }

    // 7 - method replaces values in the names array (5 elements) at odd indices
    // with values from the toReplace array (2 elements).
    public void fixNames(String[] names, String[] toReplace){
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    // 9 - swap first and last elements
    public void changeElectResult(String[] results){
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    // 10 - copy array without 2 first elements
    public String[] changeElectResultAgain(String[] results){
        String[] newArray = new String[3];
        System.arraycopy(results, 2, newArray, 0, 3);
        return newArray;
    }

    // 11 - initialise 2d array
    public char[][] createKeyboard(){
        return new char[][] {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
    }

    // 12
    public void printKeyboard() {
        char[][] keyboard = createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }
    }

    // 13 - copy array
    public String[] makeCopy(String[] names){
        String[] newArray;
        newArray = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
        return newArray;
    }

    // 14 - method accepts three arrays, each with three elements.
    // The first array is names, the second is age, the third is planets.
    // Returns an array of aggregated rows.
    // Be sure to use the aggregateSingle() method to aggregate individual rows.
    public String aggregateSingle(String name, String age, String planet){
            String text = "name - " + name + ", age - " + age + ", planet - " + planet;
            return text;
        }
        public String[] aggregateAll(String[] names, int[] ages, String[] planets){

            String[] data = new String[3];
            for(int i = 0; i < data.length; i++){
                data[i] = aggregateSingle(names[i], Integer.toString(ages[i]), planets[i]);
            }
            return data;

        }
    // 16 - Method takes as input a string - the name of the galaxy,
    // and returns a list of planets in the galaxy, as in the task above.
    // If the name of the galaxy is unknown, the program should return an empty array
    public String[] getPlanets(String galaxy){
        if(galaxy == "DangerBanger")
            return new String[] {"Fobius", "Demius"};
        if(galaxy == "Milkyway")
            return new String[] {"Earth", "Mars", "Jupiter"};
        if(galaxy == "Miaru")
            return new String[] {"Maux", "Reux", "Piax"};
        return new String[] {""};
    }

    // 18
    public int calculateFuelPrice(String fuel, int count){
        int result;
        switch (fuel){
            case "STAR100":
                result = 70 * count;
                break;
            case "STAR500":
                result = 120 * count;
                break;
            case "STAR1000":
                result = 200 * count;
                break;
            default:
                result = 50 * count;
                break;
        }
        return result;
    }

    // 19 - Write a method public int roundSpeed(int speed).
    // It takes as input a speed (always a two-digit number, from 10 to 89 inclusive.
    // And returns this number, rounded according to the rules of mathematical rounding.
    public int roundSpeed(int speed){
        if(speed % 10 <= 5)
            return speed - speed % 10;
        return speed + (10 - speed % 10);
    }
    //alternative
    public int roundSpeed2(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }

        return firstDigit * 10;
    }

    // 21 - Write the method public void calculateMaxPower().
    // It reads 3 numbers from the console - engine power.
    // Searches for the most powerful engine,
    // multiplies it by the required coefficient (how to find it is described above),
    // and outputs the result to the console.
    public void calculateMaxPower(){
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float largest = c;
        if(a>=b && a>=c) largest = a;
        if(b>=a && b>=c) largest = b;

        if(largest>100)
            System.out.println(largest * 2.1f);
        else if(largest>10)
            System.out.println(largest * 1.2f);
        else
            System.out.println(largest * 0.7f);

        scanner.close();
    }

    // 23 - Write the method public boolean isHangarOk(int side1, int side2, int price).
    // It accepts two sides of the hangar (side1 and side2, and the order can be any -
    // first larger, then smaller, and vice versa), and the price for renting the entire hangar per day.
    // You need to understand if the hangar is suitable according to the criteria described above.
    // If appropriate - return true, and return false otherwise.
    public boolean isHangarOk(int side1, int side2, int price){
        int area = side1 * side2; // >=1500
        double pricePerSquareMeter = price/area; //<=1000
        int longerSide = side1;
        int shorterSide = side2;
        if (side2 > longerSide) {
            longerSide = side2;
            shorterSide = side1;
        }

        if(area >= 1500 & pricePerSquareMeter <= 1000 & (double)longerSide/shorterSide <= 2)
            return true;
        else return false;

    }

}