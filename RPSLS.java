import java.util.Scanner;
public class RPSLS{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		// We ask the player to choose his play
		System.out.print("Enter your play: R, P, S, L, O:  ");
		String humanPlay = in.next();
		String computerPlay; String winner;

		// We call the "computer" method to know the play of the computer
		computerPlay = computer();
		System.out.println("Computer play is " + computerPlay);

		// We call the "compare" method to determine who the winner is and print it
		winner = compare(humanPlay,computerPlay);
		if (winner != "none"){
			System.out.println(winner + " win !");
		}
	}
	public static String computer(){
		// generate a random number between 0 and 1, so we can give equal chances to each possiblility
		double random = Math.random();
		String computerPlay = "none";
		if (random < 0.2) {
			computerPlay = "R";
		} else if (random < 0.4){
			computerPlay = "P";
		} else if (random < 0.6){
			computerPlay = "S";
		} else if (random < 0.8){
			computerPlay = "L";
		} else if (random < 1){
			computerPlay = "O";
		}
		return computerPlay;
	}
	public static String compare(String str1, String str2){
		String winner = "none";
		str1 = str1.toUpperCase();
		if (str1.equals(str2)){
			// In case of a draw, we call the main method so the player can play again
			System.out.println(" Draw. Play again !");
			main(null);
		// We design the conditionals that decide the winner
		} else if (str1.equals("R")){
			if (str2 == "P"){
				winner = "computer";
			} else if (str2 == "S"){
				winner = "player";
			} else if (str2 == "L"){
				winner = "player";
			} else if (str2 == "O"){
				winner = "computer";
			}
		} else if (str1.equals("P")){
			if (str2 == "R"){
				winner = "player";
			} else if (str2 == "S"){
				winner = "computer";
			} else if (str2 == "L"){
				winner = "computer";
			} else if (str2 == "O"){
				winner = "player";
			}
		} else if (str1.equals("S")){
			if (str2 == "R"){
				winner = "computer";
			} else if (str2 == "P"){
				winner = "player";
			} else if (str2 == "L"){
				winner = "player";
			} else if (str2 == "O"){
				winner = "computer";
			}
		} else if (str1.equals("L")){
			if (str2 == "R"){
				winner = "computer";
			} else if (str2 == "S"){
				winner = "computer";
			} else if (str2 == "P"){
				winner = "player";
			} else if (str2 == "O"){
				winner = "player";
			}
		} else if (str1.equals("O")){
			if (str2 == "R"){
				winner = "player";
			} else if (str2 == "S"){
				winner = "player";
			} else if (str2 == "L"){
				winner = "computer";
			} else if (str2 == "O"){
				winner = "computer";
			}
		}
		// return the winner (computer or player)
		return winner;
		
	}	
}