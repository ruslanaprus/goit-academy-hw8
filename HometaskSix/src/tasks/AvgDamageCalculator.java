package tasks;

public class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {

        try {
            int sum = 0;
            for (int sampleValue : samples) {
                sum += sampleValue;
            }
            return sum / samples.length;
        } catch (ArithmeticException ae) {
            return 0;
        }
    }
}
