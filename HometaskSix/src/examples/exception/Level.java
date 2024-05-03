package examples.exception;

public class Level {
    private int width;
    private int height;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoader {
    public int load(Level level) {
        try {
            if (level.getWidth() * level.getHeight() > 100000) {
                throw new LevelTooBigException();
            } else {
                System.out.println("Level loaded");

                return 69;
            }
        } catch (LevelTooBigException e) {
            //System.out.println("Error: Level is too big!");
            // Return a default value or throw a different exception if needed
            //return -1; // Or throw new RuntimeException("Level is too big!", e);
//            throw new LevelTooBigException();
            throw new RuntimeException("MEOW", e);
        }
    }

}

class LevelTooBigException extends Exception {
    LevelTooBigException() {
        super("Level too big");
    }
}
