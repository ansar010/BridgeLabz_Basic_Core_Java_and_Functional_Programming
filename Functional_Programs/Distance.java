/**
 * Find the Euclidean distance from the point (x, y) to the origin (0, 0).
 * Take x and y as input values
 * distance = sqrt(x*x + y*y).
 * Use Math.power function
 *
 * @author: SAYANI KOLEY
 * @since: 11.06.2021
 */
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Enter the value of x and y: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("We will calculate the Euclidean distance from point (" +x+ "," +y+ ") to the origin (0, 0).");
        euclideanDistance(x,y);
    }
    //Calculate distance = sqrt(x*x + y*y).
    private static void euclideanDistance(int x,int y) {
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("The Euclidean distance is: " +distance+ " units.");
    }
}
