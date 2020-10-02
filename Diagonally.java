// library for the scannner
import java.util.Scanner;
import java.util.Arrays;


public class Diagonally {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("                         " );
        System.out.println("Enter the number of row of the first matrix : " );
        int numberOfRowMatrix1 = scan.nextInt();

        System.out.println("                         " );
        System.out.println("Enter the number of column of the first matrix : " );
        int numberOfCulumnMatrix1 = scan.nextInt();

        int callFM1[][]= fillMatrix1(numberOfRowMatrix1,numberOfCulumnMatrix1);
        System.out.println("The first matrix is : ");
        printer(callFM1);

    }
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
    public static void printer(int mat[][]) {
        for(int i =0; i<mat.length; i++)
            System.out.println(Arrays.toString( mat[i]));
        System.out.println();
    }
    public static void diagonalPrint (int[][] M) {
        int widch= M.length ;
        int height = M[0].length ;
        String[][] array = new String[height][];
        for( int i = 0 ; i < height ; i++ ) {
            for( int j = 0 ; j < widch ; j++ ) {
                System.out.print( array[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println( "============================" );
        return ;

    }


}
