package org.example.shapes;

import org.example.drawer.Point;

import java.util.Arrays;

public class Pentagon extends Shape {
    private final String name = "Pentagon";
    private Point[] PentagonPoints = new Point[5];
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private Point p5;

    public Pentagon(int[] coordinates) {
        if (coordinates.length == 0) {
            throw new IllegalArgumentException("coordinates must be provided");
        }
        if (coordinates.length % 2 != 0) {
            throw new IllegalArgumentException("coordinates must be even number");
        }
        for (int i = 0; i < coordinates.length; i += 2) {
            int x = coordinates[i];
            int y = coordinates[i + 1];
            PentagonPoints[i / 2] = new Point(x, y);
        }

        p1 = PentagonPoints[0];
        p2 = PentagonPoints[1];
        p3 = PentagonPoints[2];
        p4 = PentagonPoints[3];
        p5 = PentagonPoints[4];

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Point[] getPoints() {
        return Arrays.copyOf(PentagonPoints, PentagonPoints.length);
    }

    @Override
    public int getNumberOfSides() {
        return this.PentagonPoints.length;
    }

    @Override
    public double getAngle(String pointName) {
        if (pointName.equals("POINT1")) {
            return Point.getAngleAtPoint(
                    p1, p2, p5
            );
        }
        if (pointName.equals("POINT2")) {
            return Point.getAngleAtPoint(
                    p2, p3, p1
            );
        }
        if (pointName.equals("POINT3")) {
            return Point.getAngleAtPoint(
                    p3, p4, p2
            );
        }
        if (pointName.equals("POINT4")) {
            return Point.getAngleAtPoint(
                    p4, p5, p3
            );
        }
        if (pointName.equals("POINT5")) {
            return Point.getAngleAtPoint(
                    p5, p1, p4
            );
        }
        throw new IllegalArgumentException("Unknown point");
    }

    @Override
    public void getSidesLength() {

        double a = Point.getLength(p1, p2);
        double b = Point.getLength(p2, p3);
        double c = Point.getLength(p3, p4);
        double d = Point.getLength(p4, p5);
        double e = Point.getLength(p1, p5);

        System.out.println("Parallelogram sides: a = " + String.format("%.2f", a)
                + ", b = " + String.format("%.2f", b)
                + ", c = " + String.format("%.2f", c)
                + ", d = " + String.format("%.2f", d)
                + ", e = " + String.format("%.2f", e));
    }
}
