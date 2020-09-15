// library for the scannner 
import java.util.Scanner;	



public class Ghz {
	public static void main(String[] args){
	
		//Initialise a Scanner to road Fromm the commmand line
		Scanner in = new Scanner(System.in);

		//Tell the user what you want 
		System.out.println(" Please give the clock speed of your computer " );

		// Collect the input
		double clockSpeed = in.nextDouble();
		clockSpeed= clockSpeed * Math.pow(10,9);

		//speed of light
		final double speedOfLight = 299792.458;

		//calculus
		double lightDistance = speedOfLight / clockSpeed;

		// print the answer
		System.out.println( " this the amount of kilometers travelled " + lightDistance );

	}
}
