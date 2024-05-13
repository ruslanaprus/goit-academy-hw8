package org.example.shapes;

import org.example.drawer.Point;

import java.util.Arrays;

public class Triangle extends Shape {
    private final String name = "Triangle";
    private Point[] trianglePoints = new Point[3];
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(int[] coordinates) {
        if (coordinates.length == 0) {
            throw new IllegalArgumentException("coordinates must be provided");
        }
        if (coordinates.length % 2 != 0) {
            throw new IllegalArgumentException("Coordinates must be even number");
        }
        for (int i = 0; i < coordinates.length; i += 2) {
            int x = coordinates[i];
            int y = coordinates[i + 1];
            trianglePoints[i / 2] = new Point(x, y);
        }

        p1 = trianglePoints[0];
        p2 = trianglePoints[1];
        p3 = trianglePoints[2];
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Point[] getPoints() {
        return Arrays.copyOf(trianglePoints, trianglePoints.length);
    }

    @Override
    public int getNumberOfSides() {
        return this.trianglePoints.length;
    }

    @Override
    public double getAngle() {

        double angle1 = Math.atan2(p1.y - p2.y, p1.x - p2.x);
        double angle2 = Math.atan2(p3.y - p2.y, p3.x - p2.x);

        return Math.toDegrees(Math.abs(angle1 - angle2));
    }

    @Override
    public void getSidesLength() {

        double ab = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        double bc = Math.sqrt(Math.pow(p2.x - p3.x, 2) + Math.pow(p2.y - p3.y, 2));
        double ca = Math.sqrt(Math.pow(p3.x - p1.x, 2) + Math.pow(p3.y - p1.y, 2));

        System.out.println("Triangle: AB = " + ab + ", BC = " + bc + ", CA = " + ca);

    }
}
