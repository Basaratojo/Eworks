import java.util.Scanner;
import java.util.Arrays;
public class lab6{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Input first the row length and then the column length");
		int RowA = in.nextInt();
		int ColumnA = in.nextInt();
		int[][] A = new int[RowA][ColumnA];
		System.out.println("The randomly generated array is: ");
		for (int i=0;i<RowA;i++){
			for(int j=0;j<ColumnA;j++){
				A[i][j] = (int)(Math.random()*1000);
				System.out.print(A[i][j]+" ");
			}
			System.out.println(); 
		}
		System.out.println();
		
		diagonalPrint(A);
		
		System.out.println();
		System.out.println();
		System.out.println("Give the length of the next array.");
		int lengthB = in.nextInt();
		System.out.println("Give the range R for the numbers in the array (it goes from 0 to R-1)");
		int R = in.nextInt();
		int[] B = new int[lengthB];
		System.out.print("The randomly generated array is: ");
		for(int i = 0; i<lengthB; i++){
			B[i] = ((int)(Math.random() * R));
		}
		System.out.println(Arrays.toString(B));
		System.out.println("Give a k under which the number for the recursions must be");
		int k = in.nextInt();
		int result = allNumsWithin(B,k);
		if(result != 0){
			System.out.println("The shortest length is: "+result);
		}
		else System.out.println("There is no consecutive appearance for all of the numbers under "+k);
	}
	public static void diagonalPrint(int[][] m){
		int rowM = m.length;
		int columnM = m[0].length;
		System.out.println("The diagonal print is: ");
		for(int i = 0; i< rowM;i++){
			for(int j = i, k = 0; j>= 0 && k<columnM; j--, k++){
				System.out.print(m[j][k]+", ");
			}
		}
		for(int i = 0; i<columnM;i++){
			for(int j = rowM-1, k = 1 + i; j>= 0 && k<columnM; j--,k++){
				if(j == m.length-1 && k == m[0].length-1){
					System.out.print(m[j][k]); // this extra if loop is here to make sure there is no comma printed after the final number.
					break;
				}
				System.out.print(m[j][k]+", ");
			}
		}
	}
	public static int allNumsWithin(int[] A, int k){				
		int variablesFound = k;
		//1 is the length of the array you are checking small to big
		//2 is the starting position
		//3 is the number you checking: 0 to k-1x
		//4 is the current number you are checking
		for(int lengthOfResult= 1; lengthOfResult<=A.length ;lengthOfResult++){
			for(int startingPosition = 0; startingPosition+lengthOfResult<=A.length; startingPosition++){	
				thirdloop:		// I labeled the third for loop so that I can break to it in the innermost for loop.
				for(int NumberSearching = 0; NumberSearching<k; NumberSearching++){
					for(int currentPosition = startingPosition; currentPosition<startingPosition+lengthOfResult; currentPosition++){
						if(A[currentPosition] == NumberSearching){
							variablesFound--;
							break;
						}
						else if(A[currentPosition]>= k){
							variablesFound = k;
							break thirdloop;
						}
					}
				}
				if(variablesFound==0){
					break;
				}
				else variablesFound = k;
			}
			if(variablesFound==0){
				return lengthOfResult;
			}
		}
		return 0;
	}
}
