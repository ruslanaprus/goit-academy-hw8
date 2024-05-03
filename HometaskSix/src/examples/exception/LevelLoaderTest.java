//package examples.exception;
//
//public class LevelLoaderTest {
//    public static void main(String[] args) {
//        //Level loaded
//        try {
//            Integer aaa = new LevelLoader().load(new Level(10, 20));
//            System.out.println("WORKS" + aaa.toString());
//        } catch (Exception ex) {
//            System.out.println("111 Level too big");
//        }
//
//        //Level too big
//        try {
//            new LevelLoader().load(new Level(10000, 2000));
//        } catch (Exception ex) {
//            if(LevelTooBigException bob) {
//                System.out.println("e:" + ex.getMessage());
//                System.out.println("222 Level too big");
//            }
//
//            if(Exception ex) {
//                System.out.println("Something else broke");
//            }
//        }
//    }
//}