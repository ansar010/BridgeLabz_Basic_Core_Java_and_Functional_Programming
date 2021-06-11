/**
 * Leap Year
 * I/P -> Year, ensure it is a 4 digit number.
 * Logic -> Determine if it is a Leap Year.
 * O/P -> Print the year is a Leap Year or not.
 *
 * @author: SAYANI KOLEY
 * @since: 11.06.2021
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year you want to check: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        checkLeapYear(year);
    }

    //Check Leap Year
    //Ensure the year is a 4 digit number
    private static void checkLeapYear(int year){
        int count = 0;
        int tobeCheckedYear = year;
        while (year != 0) {
            year = year / 10;
            ++count;
        }
        if (count == 4 && tobeCheckedYear > 0) {
            if (((tobeCheckedYear % 4 == 0) && (tobeCheckedYear % 100!= 0)) || (tobeCheckedYear % 400 == 0))
                System.out.println("Specified year is a leap year");
            else
                System.out.println("Specified year is not a leap year");
        }
        else
            System.out.println("You have entered the wrong input. Please ensure it is a 4 digit number!");
    }
}
