package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class BaseOfNumber {
    public static void main(String[] args) {
        int basis = calc(9);
        System.out.println("basis = " + basis);

    }

    public static int calc(int n){
        int sum = 0;
        for(int i = 0; i <= n; i += 2) {
            sum += i;
        }
        return sum/2;
    }
}
