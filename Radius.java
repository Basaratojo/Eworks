import java.util.Scanner;

public class Radius {
	
	public static void main(String[] args) {
		
		// Initialise a Scanner to read from the command line
		Scanner in = new Scanner(System.in);
		
		// Tell the user what you want 
		System.out.println("Please type in a radius number");
		
		// Collect the input
		double radius = in.nextDouble();
		
		// introduce pi
		double pi = Math.PI;

		double circleArea = pi * Math.pow(radius, 2);
		
		// Give some output;
		System.out.println(" Circle area is =  " + circleArea );
		
	}

}
	


