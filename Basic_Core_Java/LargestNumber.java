/**
 * Java Program to Find the Largest Among Three Numbers
 * Also find max among N numbers
 *
 * @author: SAYANI KOLEY
 * @since: 11.06.2021
 */

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        checkMaxAmong3Numbers(s);
        checkMaxAmongNnumbers(s);
    }

    private static void checkMaxAmongNnumbers(Scanner s) {
        int n, max;
        System.out.print("Enter number of elements in the array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum value is: "+max);
    }

    private static void checkMaxAmong3Numbers(Scanner s) {
        int x, y, z;
        System.out.print("Enter the first number: ");
        x = s.nextInt();
        System.out.print("Enter the second number: ");
        y = s.nextInt();
        System.out.print("Enter the third number: ");
        z = s.nextInt();

        if(x > y && x > z)
        {
            System.out.println("Largest number is the first number: "+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is the second number: "+y);
        }
        else
        {
            System.out.println("Largest number is the third number: "+z);
        }
    }
}
