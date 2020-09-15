import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int n1 = in.nextInt();
    	int n2 = in.nextInt();
    	int n3 = in.nextInt();
    	int n4 = in.nextInt();
    	int n5 = in.nextInt();
    	
    	
    	int max = maxOf3(n1,n2,n3); 
	max = maxOf3(max,n4,n5 );
    	System.out.println("Maximum: " + max);
    	System.out.println("Minimum: " + minOf3( minOf3(n1,n2,n3),n4,n5));
    }

    public static int maxOf3(int r, int s, int t) {
	    int maxi ;


	    maxi = Math.max(r, s);

	    maxi = Math.max(maxi, t);
	    return maxi ; 
		    
	    


    }

    
    public static int minOf3(int r, int s, int t) {
		int mini ;
	    mini = Math.min(r, s);

	    mini = Math.min(mini, t);
	    return mini ; 
    }
    
}
