import java.util.Scanner;	



public class Switch{
	public static void main(String[] args){

		String a , b, c;
                 
		// scan decleration
		Scanner scanner = new Scanner(System.in);

	       System.out.println("enter the first value" );


	       a = scanner.nextLine() ;

	         System.out.println("enter the second value" );


	       b = scanner.nextLine() ;




	       c = a ;
	       a = b ;
               b = c ;


 	       System.out.println("a="+ a +" "+"b="+b );

		
	}
}
