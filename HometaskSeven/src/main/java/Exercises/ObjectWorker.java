package Exercises;

import java.util.Arrays;

public class ObjectWorker {

    public String join(Object[] objects) {
        StringBuilder result = new StringBuilder();
        Object[] newObjects = Arrays.copyOf(objects, objects.length);
        for(int i = 0; i < newObjects.length; i++) {
            result.append(newObjects[i]);

            if (i != newObjects.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Object[] data = {"Hello", 20L, 3.14f, true};

        //Hello 20 3.14 true
        System.out.println(new ObjectWorker().join(data));
    }
}
