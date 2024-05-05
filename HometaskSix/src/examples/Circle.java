package examples;

public class Circle {
    private int radius;
    private int x;
    private int y;

    public Circle(int radius, int x, int y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Circle)){
            return false;
        }
        Circle another = (Circle) obj;
        return another.radius == radius && another.x == x && another.y == y;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(100, 10, 5);
        Circle c2 = new Circle(100, 10, 5);
        System.out.println("c1.equals(c2) = " + c1.equals(c2));
    }
}


