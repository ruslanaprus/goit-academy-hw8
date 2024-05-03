package examples;

import java.util.Arrays;

public class ConstructorTest {
}

class Rectangle {
    private final int width;
    private final int height;
    private final int area;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        this.area = width * height;
    }
}

class Polygon {
    private int[] points;

    public Polygon(int[] points){
        this.points = Arrays.copyOf(points, points.length);
    }
}