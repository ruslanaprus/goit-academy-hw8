package org.example.shapes;

import org.example.drawer.Point;
import org.example.drawer.PolygonShape;

import java.util.Arrays;

public abstract class Shape implements PolygonShape {

    protected String name;
    protected Point[] points;

    public Shape(String name, int[] coordinates) {
        if (coordinates.length == 0) {
            throw new IllegalArgumentException("Coordinates must be provided");
        }
        if (coordinates.length % 2 != 0) {
            throw new IllegalArgumentException("Coordinates must be even number");
        }

        this.name = name;
        this.points = new Point[coordinates.length / 2];
        for (int i = 0; i < coordinates.length; i += 2) {
            int x = coordinates[i];
            int y = coordinates[i + 1];
            this.points[i / 2] = new Point(x, y);
        }
    }

    public String getName() {
        return name;
    }

    public Point[] getPoints() {
        return Arrays.copyOf(points, points.length);
    }

    public int getNumberOfSides() {
        return points.length;
    }

    public abstract double getAngle(String str);

    public abstract void getSidesLength();

}
