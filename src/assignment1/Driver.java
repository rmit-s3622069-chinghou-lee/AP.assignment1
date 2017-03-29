package assignment1;

import java.util.Scanner;

/*
 * Driver program for the Ozlympic
 */
public class Driver {
	private String gameType;
	private Game game;
	
	// constants corresponding to main menu options
	private static final int gameSelect = 1;
	private static final int gamePrediction = 2;
	private static final int gameStart = 3;
	private static final int displayFinalResult = 4;
	private static final int displayAthletePoints = 5;
	private static final int gameExit = 6;
	
	public Driver(){
		
	}

	public void run() {
		menuSelect();
	}

	public int displayMenu() { // start Ozylimpic
		int option = 0;
		boolean validInput = false;
		
		do {
			String menu[] = { "Ozlympic Game", "========================", "1. Select a game to run",
					"2. Predict the winner of the game", "3. Start the game",
					"4. Display the final results of all games", "5. Display the points of all athletes", "6. Exit" };
			for (int i = 0; i < menu.length; i++)
				System.out.println(menu[i]); // display the main menu

			System.out.print("Enter a option: ");
			Scanner scanner = new Scanner(System.in);
			option = scanner.nextInt(); // user insert input
			if (option >= 1 && option <= 6) {
				validInput = true;
				break;
			} else {
				System.out.println("Please insert a valid input!");
				System.out.println("");
				validInput = false;
			}
		} while (!validInput);
		return option;
	}

	public void menuSelect() {
		int option = displayMenu();
		switch (option) {
		case (1):
			game.gameSelect();
			break;
		case (2):
			// Game.gamePrediction();
			break;
		case (3):
			// Game.gameStart();
			break;
		case (4):
			// Game.displayFinalResult();
			break;
		case (5):
			// Game.displayAthletePoints();
			break;
		case (6):
			System.out.println("Game Over!");
			System.exit(0);
			break;
		}
	}

}