package examples.inner.math;

public class MathCalc {
    public int calc(MathOperation operation, int a, int b){
        return operation.calc(a, b);
    }

    public static void main(String[] args) {
        MathOperation sum = new SumOperation();

        // Local class
        class MinusOperation implements MathOperation{
            @Override
            public int calc(int a, int b) {
                return a - b;
            }
        }

        MathCalc calc = new MathCalc();

        System.out.println("calc.calc(new MinusOperation(), 5, 4) = " + calc.calc(new MinusOperation(), 5, 4));

        System.out.println("calc.calc(sum, 3, 2) = " + calc.calc(sum, 3, 2));

    }
}
