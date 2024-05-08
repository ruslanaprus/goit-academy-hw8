package immutable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", "Smith");
        System.out.println("lessons = " + Arrays.toString(student.getLessons()));
        String[] lessons = student.getLessons();
        lessons[0] = "Programming";
        System.out.println("lessons = " + Arrays.toString(student.getLessons()));
        student.setFirstName("Alice");
        System.out.println(student.getFirstName());

        Point p1 = new Point(2, 2);
        Point p2 = new Point(5, 5);
        Point result = p1.add(p2).add(p2).sub(p1);
        System.out.println("result = " + result);

        Point chainingResult =
                Point.of(5, 5)
                        .add(Point.of(2, 2))
                        .sub(Point.of(3, 3));
        System.out.println("chainingResult = " + chainingResult);

    }
}
