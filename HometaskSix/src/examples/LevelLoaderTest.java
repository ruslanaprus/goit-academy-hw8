package examples;

public class LevelLoaderTest {
    public static void main(String[] args) {

        try {
            new LevelLoader().load(new Level(10, 20));
        } catch (LevelTooBigException e) {
            throw new RuntimeException(e);
        }


        try {
            new LevelLoader().load(new Level(10000, 2000));
        } catch (LevelTooBigException e) {
            //throw new RuntimeException(e);
        }

        System.out.println("ok");

    }
}