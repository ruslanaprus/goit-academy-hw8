package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main shop = new Main();

        //Final result should be ["gun", "firebow", "firegun"]
//        String[] showcaseStocks = new String[] {"gun", "firebow"};
//        String[] warehouseStocks = new String[] {"firegun"};
//        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));
//        getCheapStocks();
//        int sum = countSumOfDigits(1359);
        countBanknotes(578);
  //      placeValue(578);


    }




    public static void countBanknotes(int sum){
        int ones, tens, hundreds;
        ones = sum % 10;
        sum /= 10;
        tens = sum % 10;
        sum /= 10;
        hundreds = sum;

//        int one=(sum/1)%10;
//        int tens= (sum/10)%10;
//        int hundred = (sum/100)%10;
        System.out.println("one = " + ones);
        System.out.println("tens = " + tens);
        System.out.println("hundred = " + hundreds);
    }

    public static List<Integer> placeValue(int num) {
        List<Integer> res = new ArrayList<>();
        int factor = 1;
        while (num > 0) {
            int val = (num % 10) * factor;
            res.add(0, val);
            num = num / 10;
            factor *= 10;
        }
        System.out.println(res);
        return res;
    }

    // 1 - Write a method public void printPrices(float[] prices).
    // It takes an array of prices and outputs each price
    // to the console on a separate line, adding the word "jup."
    // after each price with a space. Use only a for loop.
    public void printPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i] + " jup.");
        }
    }

    // 2
    public void multiplyPrices(float[] prices){
        for(int i = 0; i < prices.length; i++){
            if(prices[i]<1000){
                prices[i] *= 2.0;
            }
            else prices[i] *= 1.5;
        }
    }

    // 3
    public int[] findMinMaxPrices(int[] prices){
        int[] minMaxPrices = new int[0];
        if(prices.length!=0){
            int min = prices[0];
            int max = prices[0];
            for(int i=0; i < prices.length; i++){
                if(prices[i]<min){
                    min = prices[i];
                }
                if(prices[i]>max){
                    max = prices[i];
                }
            }

            if(min!=max){
                minMaxPrices = new int[2];
                minMaxPrices[0] = min;
                minMaxPrices[1] = max;
            } else {
                minMaxPrices = new int[1];
                minMaxPrices[0] = min;
            }
            return minMaxPrices;
        }

        else
            return prices;
    }

    // 4 - Write a method public int getMinPriceCount(int[] prices)
    // that accepts an array of prices and returns:
    // 0 if the passed array is empty
    // the number of minimum prices.
    // If all prices are the same, then return the size of the array
    public int getMinPriceCount(int[] prices){

        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int count = 0;

        for(int price: prices) {
            if (price < min) {
                min = price;
            }
        }

        for(int price: prices) {
            if (price == min) {
                count++;
            }
        }
        return count;
    }

    // 5 - Write a method public int[] removePrice(int[] prices, int toRemove).
    // It removes from the prices array all occurrences of the toRemove price,
    // and returns a new array without the specified price.
    public int[] removePrice(int[] prices, int toRemove){
        int[] newPrices = Arrays.stream(prices)
                .filter(price -> price != toRemove)
                .toArray();
        return newPrices;
    }

    // 6 - Write a method public int[] removePrice(int[] prices, int toRemove).
    // It removes from the prices array all occurrences of the toRemove price,
    // and returns a new array without the specified price.
    public int[] leavePrice9(int[] prices){
        int[] newPrices = Arrays.stream(prices)
                .filter(price -> price % 10 == 9)
                .toArray();
        return newPrices;
    }

    // 7 - Write a method public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks).
    // It accepts two arrays of products, each product is a row.
    // An array is returned consisting first of the products in the showcaseStocks array
    // and then of the products in the warehouseStocks array. Do not change the order of goods.
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){

        String[] result = new String[showcaseStocks.length + warehouseStocks.length];
        for(int i = 0; i < showcaseStocks.length; i++ ) {
            result[i] = showcaseStocks[i];
        }
        int j = 0;
        for (int i = showcaseStocks.length; i < result.length; i++){
            result[i] = warehouseStocks[j];
            j++;
        }
        return result;
    }

    // 8 - Write the method public int getPricesSum(int[] prices, int minPrice, int maxPrice).
    // It takes a list of prices and sums them up, including only those greater
    // than minPrice (inclusive) and less than maxPrice (inclusive) and returns the sum.

    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int sum = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] >= minPrice && prices[i] <= maxPrice )
                sum += prices[i];
        }
        return sum;
    }

    // 9
    public static void getCheapStocks(){
        String[] stocks = {"gun 500", "firebow 70", "pixboom 200"};
        List<String> result = new ArrayList<>();
        for (int i = 0; i < stocks.length; i++){
            String[] parts = stocks[i].split(" ");
            int number = Integer.parseInt(parts[1]);
            if(number < 200){
                result.add(parts[0]);
            }
        }
        String myString = String.join(" ", result);
        System.out.println(myString);
    }


    public static void getCheapStocksTwo(){
        String[] stocks = {"gun 500", "firebow 70", "pixboom 200"};

        String result = Arrays.stream(stocks)
                .map(stock -> stock.split(" "))
                .filter(parts -> Integer.parseInt(parts[1]) < 200)
                .map(parts -> parts[0])
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }

    // 10 - Write a public String drawQuad(int n) method
    // that draws a square with side n using '*' symbols.

    public String drawQuad(int n) {
        StringBuilder square = new StringBuilder();

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                square.append("*");
                j++;
            }
            square.append("\n");
            i++;
        }

        return square.toString();
    }

    // 10 alternative solution

    public String drawQuadTwo(int n) {
        String result = "";

        int lines = n;

        while(lines > 0) {
            lines--;

            int columns = n;
            while(columns > 0) {
                result += "*";
                columns--;
            }

            result += "\n";
        }

        return result;
    }

    // 11 - Write a method public String drawRect(int width, int height, char c),
    // which draws a rectangle with the character c, which has a height of rows,
    // each row has a width of symbols.

    public String drawRect(int width, int height, char c){
        StringBuilder rectangle = new StringBuilder();

        int raws = 0;
        while(raws < height){
            int columns = 0;
            while(columns < width){
                rectangle.append(c);
                columns++;
            }
            rectangle.append("\n");
            raws++;
        }
        return rectangle.toString();
    }

    // 12 - Write the public String drawLine(int length) method.
    // It draws a line of length with the characters '*' and '#' alternately,
    // starting at the character '*' and returns that line.

    public String drawLine(int length){
        String line = "";

        int i = 0;
        while(i < length){
            if(i%2==0)
                line += "*";
            else line += "#";
            i++;
        }
        return line;
    }

    // 13 Write a public String drawPattern(char[] pattern, int repeatCount) method
    // that accepts a pattern for drawing - pattern,
    // and the number of times you need to draw this pattern in a row repeatCount.
    // The method returns a string with a sample drawn the specified number of times.

    public static String drawPattern(char[] pattern, int repeatCount){
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < repeatCount){
            int j = 0;
            while (j < pattern.length){
                result.append(pattern[j]);
                j++;
            }
            i++;
        }
        return result.toString();
    }

    public String drawPatternTwo(char[] pattern, int repeatCount) {
        StringBuilder result = new StringBuilder();
        int i = repeatCount;
        while (i-- > 0) {
            for (char ch : pattern) {
                result.append(ch);
            }
        }
        return result.toString();
    }


    public static String drawPatternThree(char[] pattern, int repeatCount) {
        StringBuilder result = new StringBuilder();
        int i = repeatCount;
        while (i > 0) {
            int j = 0;
            while (j < pattern.length) {
                result.append(pattern[j++]);
            }
            i--;
        }
        return result.toString();
    }


    public static String drawPatternFour(char[] pattern, int repeatCount) {
        String result = "";

        int line = 0;
        while(line < repeatCount) {
            int i = 0;
            while(i < pattern.length) {
                result += pattern[i];
                i++;
            }
            result += "";
            line++;
        }
        return result;
    }

    // 14 - Write the TriangleDrawer class. Create a public String drawTriangle(int side) method in it.
    // It takes the size of a side of a triangle, draws that triangle into a string,
    // and returns that string.
    // ***
    // **
    // *

    public static String drawTriangle(int side) {
        StringBuilder result = new StringBuilder();
        int i = side;
        while (i > 0) {
                result.append("*".repeat(i));
                result.append("\n");
                i--;
            }
        return result.toString();
    }

    // 15 - Write a method public int sumQuads(int n) that counts
    // and returns the sum of squared numbers from 1 to n inclusive.

    public static int sumQuads(int n){
        int sum = 0;
        while(n > 0){
            sum += Math.pow((double)n, 2);
            n--;
        }
        return sum;
    }

    public int sumQuadsTwo(int n) {
        int result = 0;

        while(n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }


    // 16 - Write a method public int countSumOfDigits(int number).
    // It takes a number and returns the sum of the digits of that number.


    public static int countSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number = number / 10;
        }
        return sum;
    }

}

