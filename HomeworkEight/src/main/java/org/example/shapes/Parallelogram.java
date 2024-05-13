package org.example.shapes;

import org.example.drawer.Point;

import java.util.Arrays;

public class Parallelogram extends Shape {
    private final String name = "Parallelogram";
    private Point[] parallelogramPoints = new Point[4];
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Parallelogram(int[] coordinates) {
        if (coordinates.length == 0) {
            throw new IllegalArgumentException("coordinates must be provided");
        }
        if (coordinates.length % 2 != 0) {
            throw new IllegalArgumentException("coordinates must be even number");
        }
        for (int i = 0; i < coordinates.length; i += 2) {
            int x = coordinates[i];
            int y = coordinates[i + 1];
            parallelogramPoints[i / 2] = new Point(x, y);
        }

        p1 = parallelogramPoints[0];
        p2 = parallelogramPoints[1];
        p3 = parallelogramPoints[2];
        p4 = parallelogramPoints[3];

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Point[] getPoints() {
        return Arrays.copyOf(parallelogramPoints, parallelogramPoints.length);
    }

    @Override
    public int getNumberOfSides() {
        return this.parallelogramPoints.length;
    }

    @Override
    public double getAngle(String pointName) {
        return Point.getAngleAtPoint(p2, p3, p1);
    }

    @Override
    public void getSidesLength() {

    }

}
