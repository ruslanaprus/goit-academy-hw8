package org.example;

import java.util.*;

public class HelperClass<T extends Number> {

    private T data;
    private ArrayList<T> array;

    public HelperClass(ArrayList<T> arrayList, int index) {
        array = arrayList;
        this.data = array.get(index);
        System.out.println(data);
    }

    public void getOccurences() {
        int occurrences = Collections.frequency(array, data);
        System.out.println("The index has the element " + this.data + " and the element appears " + occurrences + " time in the arraylist");
    }

    public T getData() {
        return this.data;
    }

    public T min() {
        if (array == null || array.isEmpty()) {
            return null;
        }
        return Collections.min(array, null);
    }

    public T max() {
        if (array == null || array.isEmpty()) {
            return null;
        }
        return Collections.max(array, null);
    }

    public <T extends Number> int oddInteger(Collection<T> collection) {
        int counter = 0;
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            T element = iterator.next();
            int i = element.intValue();
            if (i % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

//    public <T> int oddInteger(Collection<T> collection){
//        int counter = 0;
//        for (T item : collection){
//            int i = (int)item;
//            if(i%2 != 0){
//                counter++;
//            }
//        }
//        return counter;
//    }

    public static <T> Object[] swap(Collection<T> collection, int source, int destination) {
        Object[] newArray = collection.toArray();
        Object temp = newArray[source];
        newArray[source] = newArray[destination];
        newArray[destination] = temp;
        return newArray;
    }

    public static <T> void swap(T[] array, int source, int destination) {
        if (source >= 0 && destination >= 0 && source < array.length && destination < array.length) {
            T temp = array[source];
            array[source] = array[destination];
            array[destination] = temp;
        }
    }

    public static <T extends Number> boolean even(T value) {
        double doubleValue = value.intValue();
        if (doubleValue % 2 == 0) {
            return true;
        }
        return false;
    }

//    public static <T extends Number> void swap(T value1, T value2) {
//        T temp;
//        temp = value1;
//        value1 = value2;
//        value2 = temp;
//        System.out.println("value1 = " + value1 + ", value2 = " + value2);
//    }

    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
