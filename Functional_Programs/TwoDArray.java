/**
 * I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
 * Logic -> create 2 dimensional array in memory to read in M rows and N cols
 * O/P -> Print function to print 2 Dimensional Array.
 *
 * @author: SAYANI KOLEY
 * @since: 11.06.2021
 */

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        int[][] array = new int[rows][columns];

        //Inserting values in multidimensional array
        System.out.println("Insert values in the [" +rows+ "," +columns+ "] array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                array[i][j] = input.nextInt();
            }
            System.out.println(" ");
        }

        displayOutput(array, rows, columns);

        //displayUsingPrintWriter(array, rows, columns);
    }
    private static void displayOutput(int[][] array, int rows, int columns) {
        System.out.println("Displaying the output: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(array[i][j] + " " );
            }
            System.out.println(" ");
        }

    }




    /*private static void displayUsingPrintWriter(int[][] array, int rows, int columns) {
        PrintWriter writer = new PrintWriter(System.out);
        writer.println("Output using Java PrintWriter class: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                writer.print(array[i][j]+" ");
            }
            writer.println(" ");
        }
        writer.flush();
        writer.close();
    }*/
}
