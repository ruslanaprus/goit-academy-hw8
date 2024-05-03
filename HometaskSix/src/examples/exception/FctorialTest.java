package examples.exception;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FctorialTest {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner scanner = new Scanner(System.in);

        try{
            int n = scanner.nextInt();
            System.out.printf("%d!=%d", n, f.calculate(n));
        } catch (IllegalArgumentException iae){
            System.out.println("Catch IAE");
            iae.printStackTrace();
        } catch (InputMismatchException ime){
            System.out.println("Catch ime");
            ime.printStackTrace();
        } finally {
            System.out.println("Closing scanner");
            scanner.close();
        }
    }
}
