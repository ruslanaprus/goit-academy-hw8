package org.example;

import org.example.shapes.Rectangle;
import org.example.shapes.Shape;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nRECTANGLE INFO\n");
        Shape rectangle = new Rectangle(new int[]{0, 0, 0, 1, 2, 1, 2, 0});
        System.out.println("rectangle.getName() = " + rectangle.getName());

    }
}