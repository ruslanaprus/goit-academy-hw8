package org.example;

import org.example.shapes.*;

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

        System.out.println("\nCIRCLE INFO\n");
        Shape circle = new Circle(new int[]{3, 2, 3, -1, 0, 2});
        System.out.println("circle.getName() = " + circle.getName());
        System.out.println("circle.getPoints() = " + Arrays.toString(circle.getPoints()));
        System.out.println("circle.getRadius() = " + (((Circle) circle).getRadius()));
        System.out.println("central angle of the circle = " + circle.getAngle("central angle"));
        System.out.println("inscribed angle of the circle = " + circle.getAngle("inscribed angle"));
        System.out.println("circle.getCircumference() = " + String.format("%.2f", ((Circle) circle).getCircumference()));

        System.out.println("\nPOLYGON INFO\n");
        Shape pentagon = new Pentagon(new int[]{1, -1, 1, 3, 5, 3, 7, -1, 3, -3});
        System.out.println("trapezoid.getName() = " + pentagon.getName());
        System.out.println("trapezoid.getPoints() = " + Arrays.toString(pentagon.getPoints()));
        System.out.println("trapezoid.getNumberOfSides() = " + pentagon.getNumberOfSides());
        System.out.println("pentagon.getAngle() = " + pentagon.getAngle("POINT1"));
        System.out.println("pentagon.getAngle() = " + pentagon.getAngle("POINT2"));
        System.out.println("pentagon.getAngle() = " + pentagon.getAngle("POINT3"));
        System.out.println("pentagon.getAngle() = " + pentagon.getAngle("POINT4"));
        System.out.println("pentagon.getAngle() = " + pentagon.getAngle("POINT5"));
        pentagon.getSidesLength();

    }
}