import java.util.Scanner;
public class temperature{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperature.");
		double Fahrenheit = in.nextDouble();
		System.out.println(converter(Fahrenheit)+" degrees Celsius");

	}
	public static double converter(double x){
		double Celsius = ((x-32)*5)/9;
		return Celsius;
	}
}

