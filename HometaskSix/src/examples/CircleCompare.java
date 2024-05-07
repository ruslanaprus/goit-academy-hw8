package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CircleCompare {
    public static void main(String[] args) {
        Circle c1 = new Circle(10, 5, 3);
        Circle c2 = new Circle(8, 5, 2);
        Circle c3 = new Circle(15, 5, 7);

        List<Circle> circles = new ArrayList<>(Arrays.asList(c1, c2, c3));

        // Local class
        class RadiusComparator implements Comparator<Circle>{

            @Override
            public int compare(Circle o1, Circle o2) {
                return o1.getRadius() - o2.getRadius();
            }
        }

//        // Anonymous class
//        Comparator<Circle> radiusComparator = new Comparator<Circle>() {
//            @Override
//            public int compare(Circle o1, Circle o2) {
//                return o1.getRadius() - o2.getRadius();
//            }
//        };
//
//        circles.sort(radiusComparator);

        circles.sort(new RadiusComparator());
        System.out.println("circles = " + circles);
    }
}
