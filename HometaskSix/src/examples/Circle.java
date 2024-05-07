package examples;

import java.util.Objects;

public class Circle {
    private int radius;
    private int x;
    private int y;

    public Circle(int radius, int x, int y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Circle)){
            return false;
        }
        Circle another = (Circle) obj;
        return another.radius == radius && another.x == x && another.y == y;
    }

    @Override
    public int hashCode(){
        return Objects.hash(radius, x, y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(100, 10, 5);
        Circle c2 = new Circle(100, 10, 5);
        System.out.println("c1.equals(c2) = " + c1.equals(c2));
        System.out.println("c1.hashCode() = " + c1.hashCode());
        System.out.println("c2.hashCode() = " + c2.hashCode());

    }
}


