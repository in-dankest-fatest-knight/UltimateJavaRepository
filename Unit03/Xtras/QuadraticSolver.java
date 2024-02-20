package Unit03.Xtras;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double solve = 0;

        System.out.print("a = ");
        double a = s.nextDouble();

        System.out.print("b = ");
        double b = s.nextDouble();

        System.out.print("c = ");
        double c = s.nextDouble();
        
        double disc = Math.pow(b, 2) - (4 * a * c);

        if(disc == 0){
            solve = (-b + Math.pow((Math.pow(b, 2) - (4 * a * c) ), .5)) / (2 * a);
            System.out.println("one real solution: " + solve);
        }
        else if(disc > 0){
            solve = (-b + Math.pow((Math.pow(b, 2) - (4 * a * c) ), .5)) / (2 * a);
            System.out.print("two solutions: " + solve);
            solve = (-b - Math.pow((Math.pow(b, 2) - (4 * a * c) ), .5)) / (2 * a);
            System.out.println(" and " + solve);
        }
        else{
            System.out.println("no real solutions");
        }
    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver