package assignment1;

import java.util.Scanner;

public class Driver {
	private String gameType;
	private Game game; // Ozylympic's game
	
	// constants corresponding to main menu options
	private static final int gameSelect = 1;
	private static final int gamePrediction = 2;
	private static final int gameStart = 3;
	private static final int displayFinalResult = 4;
	private static final int displayAthletePoints = 5;
	private static final int gameExit = 6;
	
	public Driver(){
		game = new Game(); // create game
	} // end no-argument Driver constructor

	public int displayMenu() { // display the Ozlympic's main menu and return an input selection
		int option = 0;
		boolean validInput = false;
		
		do {
			try{
			String menu[] = { "Ozlympic Game", "========================", "1. Select a game to run",
					"2. Predict the winner of the game", "3. Start the game",
					"4. Display the final results of all games", "5. Display the points of all athletes", "6. Exit" };
			for (int i = 0; i < menu.length; i++)
				System.out.println(menu[i]); // display the main menu
			
			
			System.out.print("Enter a option: ");
			Scanner scanner = new Scanner(System.in);
			option = scanner.nextInt(); // user insert input
			if (option >= 1 && option <= 6) { // include try catch
				System.out.println("");
				validInput = true;
			} else {
				System.out.println("Please insert a valid input!");
				System.out.println("");
				validInput = false;
			}
			}catch (Exception e){
				System.out.println("Not a valid Input. Please try again!");
				System.out.println("");
				validInput = false;
			}
		} while (!validInput);
		
		return option; // return user's selection
	} // end method displayMenu

	public void menuSelect() {
		
		// local variable to store currentGame currently being processed
		Game currentGame = null;
		
		int option = displayMenu();
		switch (option) {
		case gameSelect: 			game.gameSelect(); break;
		case gamePrediction: 		game.gamePrediction(); break;
		case gameStart: 			game.gameStart(); break;
		case displayFinalResult: 	game.displayFinalResult(); break;
		case displayAthletePoints: 	game.displayAthletePoints(); break;
		case gameExit: 				System.out.println("Game Over!"); System.exit(0); break;
		}
	}

}