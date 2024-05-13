package org.example;

import org.example.shapes.Parallelogram;
import org.example.shapes.Rectangle;
import org.example.shapes.Shape;
import org.example.shapes.Triangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nRECTANGLE INFO\n");
        Shape rectangle = new Rectangle(new int[]{0, 0, 0, 1, 2, 1, 2, 0});
        System.out.println("rectangle.getName() = " + rectangle.getName());
        System.out.println("rectangle.getPoints() = " + Arrays.toString(rectangle.getPoints()));
        System.out.println("rectangle.getNumberOfSides() = " + rectangle.getNumberOfSides());
        System.out.println("rectangle.getAngle() = " + rectangle.getAngle("POINT4"));
        rectangle.getSidesLength();

        System.out.println("\nTRIANGLE INFO\n");
        Shape triangle = new Triangle(new int[]{0, 0, 0, 1, 2, 0});
        System.out.println("triangle.getName() = " + triangle.getName());
        System.out.println("triangle.getPoints() = " + Arrays.toString(triangle.getPoints()));
        System.out.println("triangle.getNumberOfSides() = " + triangle.getNumberOfSides());
        System.out.println("triangle.getAngle() = " + triangle.getAngle("POINT2"));
        triangle.getSidesLength();

        System.out.println("\nPARALLELOGRAM INFO\n");
        Shape parallelogram = new Parallelogram(new int[]{0, 0, 1, 2, 4, 2, 3, 0});
        System.out.println("parallelogram.getName() = " + parallelogram.getName());
        System.out.println("parallelogram.getPoints() = " + Arrays.toString(parallelogram.getPoints()));
        System.out.println("parallelogram.getNumberOfSides() = " + parallelogram.getNumberOfSides());
        System.out.println("parallelogram.getAngle() = " + parallelogram.getAngle("POINT2"));
        parallelogram.getSidesLength();

    }
}