package tasks;

public class TargetFinder {
    private int[] target = new int [2];

    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < targets.length; i++) {
            int distance = (int) Math.sqrt(Math.pow((aiCoords[0] - targets[i][0]), 2) + Math.pow((aiCoords[1] - targets[i][1]), 2));
            if (distance < minDistance) {
                minDistance = distance;
                target = targets[i];
            }
        }
        return target;
    }

//    public int[] findTarget(int[] aiCoords, int[][] targets){
//        int distance1 = (int) Math.sqrt(Math.pow((aiCoords[0] - targets[0][0]), 2) + Math.pow((aiCoords[1] - targets[0][1]), 2));
//        int distance2 = (int) Math.sqrt(Math.pow((aiCoords[0] - targets[1][0]), 2) + Math.pow((aiCoords[1] - targets[1][1]), 2));
//        int distance3 = (int) Math.sqrt(Math.pow((aiCoords[0] - targets[2][0]), 2) + Math.pow((aiCoords[1] - targets[2][1]), 2));
//
//        if (Math.min(Math.min(distance1, distance2), distance3) == distance1) target = targets[0];
//        else if (Math.min(Math.min(distance1, distance2), distance3) == distance2) target = targets[1];
//        else
//            target = targets[2];
//        return target;
//    }
}
