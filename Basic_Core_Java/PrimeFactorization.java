/**
 * Desc -> Computes the prime factorization of N using brute force.
 * I/P -> Number to find the prime factors
 * Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
 * O/P -> Print the prime factors of number N.
 *
 * @author: SAYANI KOLEY
 * @since: 11.06.2021
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        System.out.print("Enter the number to find the prime factors: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        ArrayList<Integer> factorList = primeFactors(number);
        System.out.print("The prime factors of number " +number+ " is: " +factorList);
    }
    private static ArrayList<Integer> primeFactors(int number) {
        int i=0;
        ArrayList<Integer> factorList=new ArrayList<Integer>();
        while(number>1) {
            for(i=2;i<=number;i++) {
                if(number%i==0) {
                    number=number/i;
                    factorList.add(i);
                    break;
                }
            }
        }
        return factorList;
    }
}
