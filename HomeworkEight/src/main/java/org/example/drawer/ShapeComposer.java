package org.example.drawer;

public interface ShapeComposer {

    String getName();

    Point[] getPoints();

    int getNumberOfSides();

    double getAngle(String str);

    void printSidesLength();

}
