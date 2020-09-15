// library for the scannner 
import java.util.Scanner;	



public class Ex2 {
	public static void main(String[] args){

Scanner in = new Scanner (System.in);
 System.out.print("Enter a number between 0 and 20 : ");

      int num = in.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
