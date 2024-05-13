package org.example;

import org.example.shapes.Rectangle;
import org.example.shapes.Shape;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nRECTANGLE INFO\n");
        Shape rectangle = new Rectangle(new int[]{0, 0, 0, 1, 2, 1, 2, 0});
        System.out.println("rectangle.getName() = " + rectangle.getName());
        System.out.println("Arrays.toString(rectangle.getPoints()) = " + Arrays.toString(rectangle.getPoints()));
        System.out.println("rectangle.getNumberOfSides() = " + rectangle.getNumberOfSides());
        System.out.println("rectangle.getAngle() = " + rectangle.getAngle());
        rectangle.getSidesLength();

    }
}