// library for the scannner
import java.util.Scanner;
/**
* This class is used to manage primes number 
* @author Pierre Paul Charbonnier <p.charbonnier@student.maastrichtuniversity.nl>
*/


public class Prime {
    public static void main(String[] args) {

        System.out.println( "                                ");
        System.out.println( " This program is easy to use, you just have to choose any positive whole number. ");
        System.out.println( "                                ");
        System.out.println( " Then the computer will determine whether the number is prime or not. ");
        System.out.println( "                                ");


        // Scan the number that the person want.
        Scanner in = new Scanner (System.in);
        System.out.println(" Enter the number that you choose : ");
        System.out.println( "                                ");


        long num = in.nextLong();
        boolean result ;
        result = isPrime(num );
        if (result == false)

            System.out.println("This is not a prime number. ");
        else
            System.out.println("This is a prime number. ");

        int numberOfPrime= countPrimes(num);
        System.out.println( "The counts of the primes between 0 and "+ num +"   is   " + numberOfPrime  );

    }
 /**
    * This method counts the primes number between 0 and a
    * @param N  is the upperbound of the primes to count.
    * @return the number of primes found
    */

    public static int countPrimes(long N) {

        long count =0;
        int numberOfPrime=0;
        while ( count <= N )
        {
            ++count;
            if (isPrime(count))
                ++numberOfPrime;

        }
        return numberOfPrime;
    }
   /** 
*This methed is used to check if a number is prime or not .
* @param a is choosed number
* @return Just say if it is prime or not .  
*/ 

   

    public static boolean isPrime( long a) {
        long x=2;
        while (x< a)
        {
            //a/2,3,4..x-1
            if (a%x==0)
                return false ;
            ++x;
        }
        return true;
    }
}

