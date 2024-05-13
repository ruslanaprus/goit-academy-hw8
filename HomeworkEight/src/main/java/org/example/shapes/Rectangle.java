package org.example.shapes;

import org.example.drawer.Point;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class Rectangle extends Shape {

    private final String name = "Rectangle";
    private Point[] rectanglePoints = new Point[4];

    public Rectangle(int[] coordinates) {
        if (coordinates.length % 2 != 0) {
            throw new IllegalArgumentException("coordinates must be even number");
        }
        for (int i = 0; i < coordinates.length; i += 2) {
            int x = coordinates[i];
            int y = coordinates[i + 1];
            rectanglePoints[i / 2] = new Point(x, y);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Point[] getPoints() {
        return Arrays.copyOf(rectanglePoints, rectanglePoints.length);
    }

    @Override
    public int getNumberOfSides() {
        return this.rectanglePoints.length;
    }


}
