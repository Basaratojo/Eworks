// library for the scannner
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/**
* This class is used to print a two-dimensional integer array diagonally
* @author Pierre Paul Charbonnier <p.charbonnier@student.maastrichtuniversity.nl>
*/


public class TestDia {
    public static void main(String[] args) {


        /**
         *I'm using a scannner called scan to fill the value of the column and the row.
         */ 
     	    Scanner scan = new Scanner(System.in);
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
        diagonalPrint(array);
        System.out.println(                         );
        System.out.println(                         );
        System.out.println();
	
        System.out.println(" Implement the length of yout new array.");
        int lengthNew = scan.nextInt();
        System.out.println("Give the range m for the numbers in the array (it goes from 0 to m-1)");
        int m = scan.nextInt();
        int[] vector = new int[lengthNew];
        System.out.print("The randomly generated array is: ");
        for(int i = 0; i<lengthNew; i++) {
            vector [i] = ((int)(Math.random() * m ));
        }
        System.out.println(Arrays.toString(vector));
        System.out.println("Give a teta under which the number for the recursions must be");
        int teta = scan.nextInt();
        int finish = allNumsWithin(vector,teta);
        if(finish != 0) {
            System.out.println("The shortest length is: "+ finish);
        }
        else System.out.println("There is no consecutive appearance for all of the numbers under "+m);
int [] risulta= extractSubVector(vector,3, 8);
 System.out.println(Arrays.toString(risulta));
         }

    public static void diagonalPrint(int[][] M) {
        int row = M.length ;
        int colunm = M[0].length;
        for(int i = 0; i< row; i++) {
            for(int j = i, k = 0; j>= 0 && k<colunm; j--, k++) {
                System.out.print(M[j][k]+"-");
            }
        }
        for(int i = 0; i<colunm; i++) {
            for(int j = row-1, k = 1 + i; j>= 0 && k<colunm; j--,k++) {
                if(j == M.length-1 && k == M[0].length-1) {
                    System.out.print(M[j][k]);
                    break;
                }
                System.out.print(M[j][k]+"-");
            }
        }

    }
    public static boolean isTheGoodSecance(int[] goodvector, int L) {
      


return false ;

    }
public static int allNumsWithin(int[] A, int k) {
      //  for (int i=0, int c=k-1;) {






return 0;
        }
   // }
    public static int[] extractSubVector (int[] A, int begin, int end ) {

        int returnVector[]= new int [end - begin] ;
        for (int i = begin,  j = 0 ; i < end ; i++, j++ ) {
            returnVector[j]= A[i];
        }

        return returnVector;





    }



}


