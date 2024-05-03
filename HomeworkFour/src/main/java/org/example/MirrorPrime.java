package org.example;

public class MirrorPrime {
    public static void main(String[] args) {

        int a = 1;
        int b = 50;
        int count = 0;

        for (int i = a; i <=b ; i++) {
            if (isPrime(i) && isPrime(reverse(i))){
                System.out.println("i = " + i);
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    private static boolean isPrime(int number){
        if(number == 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    private static int reverse(int number){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);
        stringBuilder.reverse();
        String reversed = stringBuilder.toString();
        return Integer.parseInt(reversed);
    }

    private static int reverse2(int number){
        String result = "";
        while(number > 0){
            int lastDigit = number%10;
            result += lastDigit;
            number /= 10;
        }
        return Integer.parseInt(result);
    }
}
