package examples.exception;

public class Factorial {
    public int calculate(int n){
        if (n < 0){
            throw new IllegalArgumentException("n can't be negative, but was " + n);
        }
        int result = 1;

        for (int i = 1; i <= n; i++){
            result *= i;
        }

        if(result <= 0){
            throw new IllegalArgumentException("n too big - " + n);
        }
        return result;
    }
}
