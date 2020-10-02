// library for the scannner
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/**
* This class is used to print a two-dimensional integer array diagonally
* @author Pierre Paul Charbonnier <p.charbonnier@student.maastrichtuniversity.nl>
*/


public class TestDia1 {
    public static void main(String[] args) {
        /**
         *I'm using a scannner called scan to fill the value of the column and the row.
         */        Scanner scan = new Scanner(System.in);

        System.out.println("                         " );
        System.out.println("Enter the number of row of the first matrix : " );
        int numberOfRowMatrix1 = scan.nextInt();

        System.out.println("                         " );
        System.out.println("Enter the number of column of the first matrix : " );
        int numberOfCulumnMatrix1 = scan.nextInt();
        System.out.println("                         " );


        /**
         *I am using random to fill the matrix with some " random number ".
         */
        Random rand = new Random(9);
        int[][] array = new int[numberOfCulumnMatrix1][numberOfRowMatrix1];


        for( int i = 0 ; i < numberOfCulumnMatrix1 ; i++ ) {
            for( int j = 0 ; j < numberOfRowMatrix1 ; j++) {
                array[i][j] = rand.nextInt(numberOfRowMatrix1 * numberOfCulumnMatrix1 ) ;
            }
        }
        /**
         *I am using loops to nativigate in the matrix and then I'm printing the matrix then with System.out.print
         */

        for( int i = 0 ; i < numberOfCulumnMatrix1 ; i++ ) {
            for( int j = 0 ; j < numberOfRowMatrix1 ; j++ ) {

                System.out.print("[ "+ array[i][j] + " "+ "]" );

            }
            System.out.println();
        }
        System.out.println(                                );
        System.out.println( "This is the  print of all the diagonally of your matrice ( begin at 0.0 and end at .. " );
        System.out.println(                                );
        /**
         *I'm using those loops (for ) to print all the diagonally of the matrix  and then print them onthe same line
         */
        for( int k = 0 ; k <= numberOfRowMatrix1 + numberOfCulumnMatrix1 - 2; k++ ) {
            for( int j = 0 ; j <= k ; j++ ) {
                int i = k - j;
                if( i < numberOfCulumnMatrix1 && j < numberOfRowMatrix1 ) {
                    System.out.print( array[i][j] + "-"  );
                }
            }

        }
    }

}

