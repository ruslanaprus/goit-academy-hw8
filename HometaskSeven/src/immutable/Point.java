package immutable;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point add(Point point){
        return new Point(this.x + point.x, this.y + point.y);
    }

    public Point sub(Point point){
        return new Point(this.x - point.x, this.y - point.y);
    }

    public Point mult(Point point){
        return new Point(this.x * point.x, this.y * point.y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static Point of(int x, int y){
        return new Point(x, y);
    }
}
