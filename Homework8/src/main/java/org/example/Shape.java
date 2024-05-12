package org.example;

public abstract class Shape implements PolygonShape, CurvedShape {
    @Override
    public double getPoint() {
        return 0;
    }

    @Override
    public int getNumberOfSegments() {
        return 0;
    }
}
