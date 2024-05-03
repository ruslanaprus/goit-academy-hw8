package org.example;
// 24 - Write the QuadraticEquationSolver class.
// In this class, create a method public double[] solve(int a, int b, int c).
//
//This method takes the coefficients of a quadratic equation and returns one of three options:
//
//empty array if there are no roots
//an array of one element if there is only one root
//an array of two elements (first larger, then smaller), if there are two roots
public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c){
        double[] roots = new double[0];
        double discriminant = Math.pow(b, 2) - 4*a*c;

        if(discriminant==0){
            roots = new double[1];
            roots[0] = (-1 * b) / (2 * a);
            return roots;
        }

        if(discriminant>0){
            roots = new double[2];
            roots[0] = ((-1 * b + Math.sqrt(discriminant))/(2*a));
            roots[1] = ((-1 * b - Math.sqrt(discriminant))/(2*a));
            return roots;
        }

        return roots;

    }
}
