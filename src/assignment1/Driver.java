package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	// constants corresponding to main menu options
	private static final int gameSelect = 1;
	private static final int gamePrediction = 2;
	private static final int gameStart = 3;
	private static final int displayFinalResult = 4;
	private static final int displayAthletePoints = 5;
	private static final int gameExit = 6;

	public void gameRun() {
		String raceID = null;
		int gameOption;
		String raceWinner;
		String userPrediction = null;
		int raceType = 0;

		boolean gameLoop = false;
		
		Database Database = new Database();
		
		ArrayList<Participant> participantsByType = null;
		ArrayList<Race> raceResult = null;
		ArrayList<Official> Official = Database.getOfficial();

		do {
			Game Game = new Game();
			gameOption = displayMenu();

			switch (gameOption) {
			case gameSelect:
				raceType = Game.gameSelect();
				raceID = Game.getRaceID();
				gameLoop = false;
				break;
			case gamePrediction:
				participantsByType = Database.ParticipantsByType(raceType);
				Game.printAthleteSelection(participantsByType);
				userPrediction = Game.getUserPrediction(participantsByType);
				gameLoop = false;
				break;
			case gameStart:
				raceResult = Game.setRaceList(raceID, raceType, participantsByType, Official);
				raceWinner = Game.gameStart(userPrediction, participantsByType,raceResult);
				gameLoop = false;
				break;
			case displayFinalResult:
				Game.displayFinalResult(raceResult);
				gameLoop = false;
				break;
			case displayAthletePoints:
				Game.displayAthletePoints(raceResult);
				gameLoop = false;
				break;
			case gameExit:
				System.out.println("Game Over!");
				System.exit(0);
				break;
			default:
				System.out.println("\nInput error! Again.");
			}
		} while (!gameLoop);
	}

	public int displayMenu() { // display the Ozlympic's main menu
		// and return an
		// input selection
		int option = 0;
		boolean validInput = false;

		do {
			validInput = true;
			try {
				String menu[] = { "Ozlympic Game", "========================", "1. Select a game to run",
						"2. Predict the winner of the game", "3. Start the game",
						"4. Display the final results of all games", "5. Display the points of all athletes",
						"6. Exit" };
				for (int i = 0; i < menu.length; i++)
					System.out.println(menu[i]); // display the main menu

				System.out.print("Enter a option: ");
				Scanner scanner = new Scanner(System.in);
				option = scanner.nextInt(); // user insert input
				if (option >= 1 && option <= 6) {
					System.out.println("");
				} else {
					System.out.println("\nPlease insert a valid input!\n");
					validInput = false;
				}
			} catch (Exception e) {
				System.out.println("\nNot a valid Input. Please try again!\n");
				validInput = false;
			}
		} while (!validInput);
		return option; // return user's selection
	} // end method displayMenu

}