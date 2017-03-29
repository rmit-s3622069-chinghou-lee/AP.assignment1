package assignment1;

import java.util.Scanner;

public class Game {
	public String gameType;
	public String gameID;

	public Game(){
		gameType =null;
	}

	public int gameSelect() {
		int option = 0;
		int x = 1;
		boolean validInput = false;
		
		do{
			validInput = true;
			String menu[] = { "Select a sport to play: ", 
					"1. Swimming race",
					"2. Running race", 
					"3. Cycling race" };
			for (int i = 0; i < menu.length; i++)
				System.out.println(menu[i]); // display the main menu

			System.out.print("Enter a option: ");
			Scanner scanner = new Scanner(System.in);
			option = scanner.nextInt(); // user insert input
			
			if (option == 1){
				x += x; // not adding up,need to fix
				System.out.println("S"+ x);
				gameType = "Swim";
				// System.out.println(gameType);
			}
			else if (option == 2){
				System.out.println("R"+x);
			}
			else if (option == 3){
				System.out.println("Cycling Race");
			} else {
				System.out.println("Invalid Input!");
				validInput = false;
			}
		} while (!validInput);
		Driver driver = new Driver();
		driver.menuSelect();
		return option;
	}

	public int gamePrediction() {
		int option = gameSelect();
		if (option == 1){
			Swimmer swimmer = new Swimmer(gameID, gameID, option, gameID, gameID);
			
			System.out.println();
		}
		// Generate & print participant
		
		// let user predict the participant
		
		// System.out.println("prediction");
		
		return 0;
	}

	public void gameStart() {
		
	if (gameType == "Swim"){
		// do swim game
	}else if (gameType == "Cycle"){
		// do cycle game
	}else if (gameType == "Run"){
		// do run game
	}
		// System.out.println("startGame");

	}

	public void displayFinalResult() {
		System.out.println("displayFinalResult");

	}

	public void displayAthletePoints() {
		System.out.println("displayAthletePoints");

	}
}

/* if (gameType == option 1){
 * execute swim game
 * }else if (gameType == option 2){
 * execute run game
 * }else if (gameType == option 3){
 * execute cycle game
 * }
 */

