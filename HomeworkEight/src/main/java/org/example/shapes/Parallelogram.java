package org.example.shapes;

import org.example.drawer.Point;

import java.util.Arrays;

public class Parallelogram extends Shape {

    private Point p1 = points[0];
    private Point p2 = points[1];
    private Point p3 = points[2];
    private Point p4 = points[3];

    public Parallelogram(int[] coordinates) {
        super("Parallelogram", coordinates);
    }

    @Override
    public double getAngle(String pointName) {
        if (pointName.equals("POINT1") || pointName.equals("POINT3")) {
            return Point.getAngleAtPoint(
                    p1, p2, p4
            );
        }
        if (pointName.equals("POINT2") || pointName.equals("POINT4")) {
            return Point.getAngleAtPoint(
                    p2, p3, p1
            );
        }
        throw new IllegalArgumentException("Unknown point");
    }

    @Override
    public void getSidesLength() {

        double a = Point.getLength(p1, p2);
        double b = Point.getLength(p2, p3);

        System.out.println("Parallelogram sides: a = " + String.format("%.2f", a) + ", b = " + String.format("%.2f", b));
    }

}
