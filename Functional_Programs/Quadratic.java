/**
 * Find the roots of the equation a*x*x + b*x + c.
 * Take a, b and c as input values
 * delta = b*b - 4*a*c
 * Root 1 of x = (-b + sqrt(delta))/(2*a)
 * Root 2 of x = (-b - sqrt(delta))/(2*a)
 *
 * @author: SAYANI KOLEY
 * @since: 11.06.2021
 */
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Enter the value of a, b and c: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The equation is: " +a+ "*x*x + " +b+ "*x + " +c);
        int delta = deltaCalculation(a,b,c);
        rootCalculation1(delta,a,b);
        rootCalculation2(delta,a,b);
    }
    //Calculate delta = b*b - 4*a*c
    private static int deltaCalculation(int a, int b, int c) {
        int delta = (b * b)-(4*a*c);
        System.out.println("The determinant value is: " +delta);
        return delta;
    }
    //Calculate Root 1 of x = (-b + sqrt(delta))/(2*a)
    private static void rootCalculation1(int delta,int a,int b) {
        double root1 = (-b + Math.sqrt(delta))/(2*a);
        System.out.println("The root1 value of the equation is: " +root1);
    }
    //Calculate Root 2 of x = (-b - sqrt(delta))/(2*a)
    private static void rootCalculation2(int delta,int a,int b) {
        double root2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("The root2 value of the equation is: " +root2);
    }
}
