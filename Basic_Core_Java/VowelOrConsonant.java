/**
 * Java Program to Check Whether an Alphabet is Vowel or Consonant
 *
 * @author: SAYANI KOLEY
 * @since: 11.06.2021
 */

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
            System.out.println("Enter the character you want to check: ");
            Scanner input = new Scanner(System.in);

            //There is no nextChar(), so we use next().charAt(0).
            //next() function returns the next token/word in the input as a string.
            //charAt(0) function returns the first character in that string.

            char ch = input.next().charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                System.out.println(ch + " is vowel.");
            else
                System.out.println(ch + " is consonant.");
        }
}
