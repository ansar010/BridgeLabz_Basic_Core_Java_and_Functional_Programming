/**
 * Java Program to Compute Quotient and Remainder
 *
 * @author: SAYANI KOLEY
 * @since: 11.06.2021
 */

import java.util.Scanner;

public class ComputeQuotientAndRemainder {
    public static void main(String[] args) {
        System.out.print("Enter the value of Dividend and Divisor: ");
        Scanner input = new Scanner(System.in);
        int dividend = input.nextInt();
        int divisor = input.nextInt();

        float quotient = dividend / divisor;
        float remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
