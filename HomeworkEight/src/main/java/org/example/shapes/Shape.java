package org.example.shapes;

import org.example.drawer.Point;
import org.example.drawer.PolygonShape;

public abstract class Shape implements PolygonShape {

    public abstract String getName();

    public abstract Point[] getPoints();

    public abstract int getNumberOfSides();

    public abstract double getAngle();

    public abstract void getSidesLength();

}
