package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(HelperClass.even(10)); // Example usage
        //       HelperClass.swap(10, 8);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(9);
        arr.add(6);
        arr.add(2);
        arr.add(10);
        arr.add(-1);
        arr.add(-18);
        arr.add(-1);
        arr.add(-18);
        arr.add(-64);

        System.out.println("The elements in the array are: " + arr);
        int index = 5;
        HelperClass<Integer> counter = new HelperClass<>(arr, index);

        if (counter.getData() > 0) {
            System.out.println("The selected index has a positive element");
            counter.getOccurences();
        } else {
            System.out.println("The slected index has a negative element");
            counter.getOccurences();
        }

        System.out.println("counter.min() = " + counter.min());
        System.out.println("counter.max() = " + counter.max());
        System.out.println("counter.oddInteger(arr) = " + counter.oddInteger(arr));

        Integer[] array = {1, 7, -20, -1, 6, 5};
        System.out.println("array = " + Arrays.toString(array));
        HelperClass.swap(array, 0, 1);
        System.out.println("array = " + Arrays.toString(array));

        System.out.println("Arrays.toString(HelperClass.swap(arr, 0,1)) = " + Arrays.toString(HelperClass.swap(arr, 0, 1)));

        User bob = new User(1, "bob");
        User alice = new User(2, "alice");
        User eve = new User(3, "eve");
        User charlie = new User(4, "charlie");
        List<User> users = new ArrayList<>() {
        };
        users.add(bob);
        users.add(alice);
        users.add(eve);
        users.add(charlie);
        System.out.println("users = " + users);
        System.out.println("HelperClass.swap(users, 0,3) = " + Arrays.toString(HelperClass.swap(users, 0, 3)));
        System.out.println("users = " + users);
        Collections.swap(users, 0, 3);
        System.out.println("users = " + users);
    }
}