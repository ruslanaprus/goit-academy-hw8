package org.example.shapes;

import org.example.drawer.Point;

import java.util.Arrays;

/**
 * The abstract base class representing a geometric shape.
 * Provides common functionality and properties for various geometric shapes.
 */
public abstract class Shape implements org.example.drawer.ShapeComposer {

    /**
     * The name of the shape.
     */
    protected String name;

    /**
     * The array of points that define the shape.
     */
    protected Point[] points;

    /**
     * Constructs a new Shape with the given name and coordinates.
     *
     * @param name        the name of the shape
     * @param coordinates the array of coordinates defining the points of the shape
     * @throws IllegalArgumentException if coordinates are not provided or are not in pairs
     */
    public Shape(String name, int[] coordinates) {
        if (coordinates.length == 0) {
            throw new IllegalArgumentException("Coordinates must be provided");
        }
        if (coordinates.length % 2 != 0) {
            throw new IllegalArgumentException("Coordinates must be an even number");
        }

        this.name = name;
        this.points = new Point[coordinates.length / 2];
        for (int i = 0; i < coordinates.length; i += 2) {
            int x = coordinates[i];
            int y = coordinates[i + 1];
            this.points[i / 2] = new Point(x, y);
        }
    }

    /**
     * Gets the name of the shape.
     *
     * @return the name of the shape
     */
    public String getName() {
        return name;
    }

    /**
     * Gets an array of points defining the shape.
     *
     * @return an array of points defining the shape
     */
    public Point[] getPoints() {
        return Arrays.copyOf(points, points.length);
    }

    /**
     * Gets the number of sides of the shape.
     *
     * @return the number of sides of the shape
     */
    public int getNumberOfSides() {
        return points.length;
    }

    /**
     * Gets an array of angles formed by the points of the shape.
     *
     * @return an array of angles formed by the points of the shape
     */
    public double[] getAngles() {
        int numPoints = points.length;
        double[] angles = new double[numPoints];

        for (int i = 0; i < numPoints; i++) {
            Point point1 = points[i];
            Point point2 = points[(i + 1) % numPoints];
            Point point3 = points[(i + 2) % numPoints];
            angles[i] = Point.getAngleAtPoint(point1, point2, point3);
        }

        return Arrays.copyOf(angles, angles.length);
    }

    /**
     * Gets an array of lengths of the sides of the shape.
     *
     * @return an array of lengths of the sides of the shape
     */
    public double[] getSides() {
        int numPoints = points.length;
        double[] sides = new double[numPoints];
        for (int i = 0; i < numPoints; i++) {
            Point point1 = points[i];
            Point point2 = points[(i + 1) % numPoints];
            sides[i] = Point.getLength(point1, point2);
        }
        return Arrays.copyOf(sides, sides.length);
    }

    /**
     * Calculates the perimeter of the shape.
     *
     * @return the perimeter of the shape
     */
    public double getPerimeter() {
        double[] sides = getSides();
        double perimeter = 0.0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    /**
     * Abstract method to get the angle identified by a specific label.
     *
     * @param str the label identifying the angle
     * @return the angle identified by the label
     */
    public abstract double getAngle(String str);

    /**
     * Abstract method to print the lengths of the sides of the shape.
     */
    public abstract void printSidesLength();

    /**
     * Abstract method to calculate the area of the shape.
     *
     * @return the area of the shape
     */
    public abstract double getArea();

}
