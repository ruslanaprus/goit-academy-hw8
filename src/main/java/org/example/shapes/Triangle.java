package org.example.shapes;

import org.example.drawer.Point;

public class Triangle extends Shape {
    Point p1 = points[0];
    Point p2 = points[1];
    Point p3 = points[2];

    public Triangle(int[] coordinates) {
        super("Triangle", coordinates);
    }

    @Override
    public double getAngle(String pointName) {
        if (pointName.equals("POINT1")) {
            return Point.getAngleAtPoint(
                    p1, p2, p3
            );
        }
        if (pointName.equals("POINT2")) {
            return Point.getAngleAtPoint(
                    p2, p3, p1
            );
        }
        if (pointName.equals("POINT3")) {
            return Point.getAngleAtPoint(
                    p3, p1, p2
            );
        }
        throw new IllegalArgumentException("Unknown point");
    }

    @Override
    public double getArea() {
        double[] sides = getSides();

        // Uses Heron's formula to calculate the area of triangle
        double area = Math.sqrt(getPerimeter() / 2.0 *
                (getPerimeter() / 2.0 - sides[0]) *
                (getPerimeter() / 2.0 - sides[1]) *
                (getPerimeter() / 2.0 - sides[2]));
        return area;
    }

    @Override
    public void printSidesLength() {

        double c = Point.getLength(p1, p2);
        double a = Point.getLength(p2, p3);
        double b = Point.getLength(p1, p3);

        System.out.println("Triangle sides: [POINT1 - POINT2] = " + String.format("%.2f", c) + ", [POINT2 - POINT3] = " + String.format("%.2f", a) + ", [POINT1 - POINT3] = " + String.format("%.2f", b));

    }
}
