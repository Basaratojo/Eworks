import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
/**
 * This class compute the matrix multiplicatiion calculus.
 * The user must enter the culumn and the row of both matrix.
 * It also perform check that the number of row of the fist matrix is equal to the number of the  culumn of the second matrix.
 */
public class Matrix {
    public static void main (String[]args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("                         " );
        System.out.println("Enter the number of row of the first matrix : " );
        int numberOfRowMatrix1 = scan.nextInt();

        System.out.println("                         " );
        System.out.println("Enter the number of column of the first matrix : " );
        int numberOfCulumnMatrix1 = scan.nextInt();

        System.out.println("                         " );
        System.out.println("Enter the number of row of the second matrix : " );
        int numberOfRowMatrix2 = scan.nextInt();

        System.out.println("                         " );
        System.out.println("Enter the number of column of the second matrix : " );
        int numberOfCulumnMatrix2 = scan.nextInt();

        int callFM1[][]= fillMatrix1(numberOfRowMatrix1,numberOfCulumnMatrix1);
        int callFM2[][]= fillMatrix1(numberOfRowMatrix2,numberOfCulumnMatrix2);

        System.out.println("The first matrix is : ");
        printer(callFM1);
        System.out.println("The second matrix is : ");
        printer(callFM2);
        /*
         * We need this condition to check that the column of the first matrix is not
         * equal to the row of the second matrix.
         */
        if(callFM1[0].length!= callFM2.length) {
            System.out.println("this multiplication is not possible");
            return ;
        }
        /*
         * We call the method that multiply the two matrix and then we print the result .
         * (In this case ,I'm using the "if" to first check if it is a multiplication of vector and than a matrix multiplication. )
         */
        if (callFM1.length == 1 && callFM2[0].length == 1) {
            System.out.println("The result of the multiplication is equal to  ");
            int r = vectorMultiplication(callFM1,callFM2) ;
            System.out.println(r);

        }
        else {


            System.out.println("The result of the multiplication is equal to  ");
            int [][] result= multiplication(callFM1,callFM2) ;
            printer(result);
        }
    }
    /*
     * This method is used to fill the number that you choose in the matrix using a loop.
     */
    public static int[][] fillMatrix1 (int r1,int c1) {

        int[][] matrix1 = new int[r1][c1];

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<r1; i++ ) {
            for(int j=0; j<c1; j++) {
                System.out.println("Enter element "+ i + " ," + j);
                matrix1[i][j] = scan.nextInt();
            }
        }
        return matrix1;
    }
    /*
     * This method is used to print the matrix.
     */
    public static void printer(int mat[][]) {
        for(int i =0; i<mat.length; i++)
            System.out.println(Arrays.toString( mat[i]));
        System.out.println();
    }
    /*
     * This method is used to multiply two vectors with 3 "for ".
     */
    public static int vectorMultiplication (int[][] m1, int[][] m2) {
        int c = 0;
        for(int i=0; i<m1.length; i++) {
            for(int j=0; j<m2[0].length; j++) {
                for(int k=0; k<m1[0].length ; k++)
                {
                    c += m1[i][k] * m2[k][j];
                }
            }
        }
        return c;
    }
    /*
     * This method is used to multiply two matrix with 3 "for " to make the multiplication working well.
     */
    public static int[][] multiplication (int[][] m1,int[][] m2)
    {
        int c[][]= new int [m1.length][m2[0].length];
        for(int i=0; i<m1.length; i++) {
            for(int j=0; j<m2[0].length; j++) {
                c[i][j] = 0;
                for(int k=0; k<m1[0].length ; k++)
                {
                    c[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return c ;
    }
}
