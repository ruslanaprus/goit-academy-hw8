package examples.inner.math;

public class SumOperation implements MathOperation {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
