package tasks;

class Level {
    private LevelInfo levelInfo;
    private Point[] points;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    // System.out.println(new Level(info, points).calculateLevelHash());

    public int calculateLevelHash(){
        int sum = 0;
        for (Point point : points) {
            sum += point.getX() * point.getY();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.getName() + ", difficulty is " + levelInfo.getDifficulty() + ", point count is " + points.length;
    }

    static class Point {
        private int x, y;

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
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }
}