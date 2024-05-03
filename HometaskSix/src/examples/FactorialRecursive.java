package examples;

public class FactorialRecursive {
    public int calculate(int n){
        //0! and 1! = 1
        if (n <= 1){
            System.out.println("Return 1");
            return 1;
        }
        System.out.printf("Return %d*(%d-1)!\n", n, n);
        return n * calculate(n-1);
    }

    public static void main(String[] args) {
        System.out.println(new FactorialRecursive().calculate(3));
    }
}
