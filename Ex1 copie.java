// library for the scannner 
import java.util.Scanner;	



public class Ex1 {
	public static void main(String[] args){

Scanner in = new Scanner (System.in);
 System.out.print("Enter a number: ");
	double number = in.nextDouble();

	if(number % 2 == 0 )
		
		
	System.out.println(number + " is even");
        
	else

        System.out.println(number + " is odd");
    }
}



