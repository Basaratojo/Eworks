 
//ask the variable that the gamers want the choosse so put scanner 
import java.util.Scanner;	
import java.lang.Math;


public class Rock{
public static String humanChooseSpock(String computer){

if (computer.equals("R")) return "You win "; //Spock vaporizes Rock
else if (computer.equals("P")) return "You lost"; // Paper disproves Spock
else if (computer.equals("L")) return "You lost!"; // Lizard poisons Spock
else return "You win"; // this is the last case when computer chose scissors
// Spock smashes Scissors
}
 

public static String humanChooseLizard(String computer){

if (computer.equals("R")) return "You lost"; //Rock crushes Lizard
else if (computer.equals("P")) return "You win!"; // Lizard eats Paper
else if (computer.equals("S")) return "You lost"; // Scissors decapitate Lizard
else return "You win!"; // this is the last case when computer chose Spock
//Lizard poisons Spock
}
	
public static String humanChooseRock(String computer){

if (computer.equals("S")) return "You win!"; //Scissors vs rock
else if (computer.equals("P")) return "You lost!"; // Rock vs Paper
else if (computer.equals("L")) return "You win!"; // Rock crushes Lizard
else return "You lost"; // this is the last case when computer chose Spock so
// Spock vaporizes Rock
}
	
public static String humanChoosePaper(String computer){

if (computer.equals("R")) return " You win "; //Paper covers Rock
else if (computer.equals("S")) return "You lost!"; // Scissors cut Paper
else if (computer.equals("L")) return "You lost!"; // Lizard eats Paper
else return "You win"; // this is the last case when computer chose Spock :
//Paper disproves Spock
}

public static String humanChooseScissors(String computer){

if (computer.equals("R")) return "You lost"; //Scissors vs rock
else if (computer.equals("P")) return "You win!"; // Scissors cut Paper
else if (computer.equals("L")) return "You win!"; // Scissors decapitate Lizard
else return "You lost"; // this is the last case when computer chose Spock
}



public static String checkTheWinner (String human,String computer) {

	
 //resolt of the game 
 

 if (human.equals(computer)) return " Equality ";




 else if ( human.equals("S"))
		 {
// we compare S w/ computer
return humanChooseScissors(computer);

		
		
		}
else if (human.equals("P"))

 // we compare P w/ computer
return humanChoosePaper(computer);	



   
else if (human.equals("R"))
 
// we compare R w/ computer
return humanChooseRock(computer);

 
	
	
else if (human.equals("L"))

// we compare L w/ computer
return humanChooseLizard(computer);	 

	

else  

// we compare O w/ computer, i don't need the condition because this is the last test.
return humanChooseSpock(computer);
 

 

}


	public static String	iturn () {
	 // Generate random number 
        double rand = Math.random(); 
	if (rand <= 0.2 ) return "R";
	else if (rand <= 0.4) return "P";
	else if ( rand <= 0.6) return "S";
	else if ( rand <= 0.8 ) return "L";
	else  return "O";


	}


	public static void main(String[] args){
        
	       // print the name of the game and the rules
	       	System.out.println("                         " );
 
		System.out.println("Welkome in the simple rock-paper-scissors game  " );
			
		System.out.println("                         " );
		System.out.println("The rules are simple :  " );

          	System.out.println("                         " );
		System.out.println("• Scissors cut Paper  " );
		System.out.println("• Paper covers Rock  " );
		System.out.println("• Rock crushes Lizard " );
		System.out.println("• Lizard poisons Spock  " );
		System.out.println("• Spock smashes Scissors  " );
		System.out.println("• Scissors decapitate Lizard " );
		System.out.println("• Lizard eats Paper  " );
		System.out.println("• Paper disproves Spock " );		
		System.out.println("• Spock vaporizes Rock " );
		System.out.println("• Rock crushes Scissors " );
	

		String play ;
                 
		// scan decleration
		Scanner scanner = new Scanner(System.in);

        	System.out.println("                         " );
	        System.out.println(" Enter your play: R, P, S, L, O " );


	       play = scanner.nextLine() ;
		
	       String play2 ;
	      
	      play2 = iturn();

	      System.out.println("Computer play is " + play2 );

	      String result;
	      
	      result = checkTheWinner(play, play2);

	     System.out.println(result);

	      









//I need declare all the R,P,L,S,O
//put a randomfunction 

//condition of winning
//put who won or equality
	}
}	
