/**
 * Flip Coin and print percentage of Heads and Tails
 * I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
 * Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then heads or tails
 * O/P -> Percentage of Head vs Tails
 *
 * @author: SAYANI KOLEY
 * @since: 11.06.2021
 */
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.print("Enter the number of times you want to flip the coin: ");
        Scanner input = new Scanner(System.in);
        int flipCoinCount = input.nextInt();

        flipCoin(flipCoinCount);
    }

    //Flip the coin as said by the user and output the HEAd and TAIL percentage.
    //Ensure the number of times to flip a coin is positive.
    private static void flipCoin(int flipCoinCount){
        double coinToss;
        double headCount = 0;
        double tailCount = 0;
        if(flipCoinCount > 0) {
            int i = 1;
            while (i <= flipCoinCount) {
                coinToss = Math.random();
                if (coinToss < 0.5) {
                    headCount++;
                } else {
                    tailCount++;
                }
                i++;
            }
            double headPercentage = (headCount / flipCoinCount) * 100;
            System.out.println("Percentage of HEAD after tossing the coin: " +headPercentage+ "%");
            double tailPercentage = (tailCount / flipCoinCount) * 100;
            System.out.println("Percentage of TAIL after tossing the coin: " +tailPercentage+ "%");
        }
        else
            System.out.println("Wrong Input! The number of flips to toss the coin should be positive.");
    }
}
