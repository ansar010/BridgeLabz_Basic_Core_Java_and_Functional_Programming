/**
 * Power of 2
 * Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
 * I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
 * Logic -> repeat until i equals N.
 * O/P -> Print the values.
 * Calculation using iteration method
 *
 * @author: SAYANI KOLEY
 * @since: 11.06.2021
 */
import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {
        System.out.print("Enter the power value N: ");
        Scanner input = new Scanner(System.in);
        int powerValue = input.nextInt();

        powerIterative(powerValue);
    }

    //Calculation using iteration method
    //Ensure Only works if 0 <= N < 31 since 2^31
    public static void powerIterative(int exp) {
        int base=2,result=1;
        if(exp >= 0)
            System.out.println("2 ^ 0 = 1");
        if(exp > 0 && exp < 31) {
            for (int i = 1; i <= exp; i++) {
                result = result * 2;
                System.out.println("2 ^ " +i+ " = " +result);
            }
        }
        else
            System.out.println("Wrong input! Power value of N cannot exceed 31!");
    }
}
