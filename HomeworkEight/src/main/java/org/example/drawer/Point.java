package org.example.drawer;

import java.text.DecimalFormat;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPoint(Point p) {
        p.x = getX();
        p.y = getY();
    }

    public Point getPoint() {
        return new Point(x, y);
    }

    public static double getLength(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
    }

    public static double getAngleAtPoint(Point point1, Point point2, Point point3) {
        double anglePoint1 = Math.acos((Math.pow(getLength(point1, point3), 2)
                + Math.pow(getLength(point1, point2), 2)
                - Math.pow(getLength(point2, point3), 2))
                / (2 * getLength(point1, point3) * getLength(point1, point2)));
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(Math.toDegrees(anglePoint1)));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
