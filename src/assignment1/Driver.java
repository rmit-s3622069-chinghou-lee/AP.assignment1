package assignment1;

/*
 * Ozlympic Game ver 1.0 - Driver class
 * 
 * Author: Ching Hou, Lee
 * 
 * Date created: Mar 29, 2017
 * 
 * This program is a system for managing a mini game event - Ozlympic Game.
 * 
 * This Ozlympic Game event has three sports: swimming, cycling and running.
 * User's prediction is limited to only one athlete for each game.
 * In the end of the game, the user is able to view results and athlete's points.
 * 
 * (C) Copyright by Ching Hou,Lee. All Rights Reserved.
 */

import java.util.*;

/*Driver program for the Ozlympic Game*/
public class Driver {
	String raceID = null; // Race ID is not yet generated

	// constants corresponding to main menu options
	private static final int gameSelect = 1;
	private static final int gamePrediction = 2;
	private static final int gameStart = 3;
	private static final int displayFinalResult = 4;
	private static final int displayAthletePoints = 5;
	private static final int gameExit = 6;

	Game Game = new Game(); // to call Game class methods

	/* Method to start the Ozlympic Game */
	public void gameRun() {
		int gameOption; // input game menu

		int raceType = 0; // Race type is not yet generated

		boolean gameLoop = false;

		do {

			gameOption = displayMenu();

			switch (gameOption) { // user input game menu
			case gameSelect:
				raceType = Game.gameSelect(); // select a game to start
				raceID = Game.getRaceID(); // get and store RaceID
				gameLoop = false;
				break;
			case gamePrediction: // user predict the winner
				Game.getUserPrediction(raceType);
				gameLoop = false;
				break;
			case gameStart: // start game, compare user prediction, generate
				// result
				Game.gameStart(raceType);
				gameLoop = false;
				break;
			case displayFinalResult: // display final result to user
				Game.displayFinalResult(gameOption);
				gameLoop = false;
				break;
			case displayAthletePoints: // display athlete points to user
				Game.displayFinalResult(gameOption);
				gameLoop = false;
				break;
			case gameExit: // user exit the program
				System.out.println("Game Over!");
				System.exit(0); // this Ozlympic Game should end
				break;
			default:
				System.out.println("\nInput error! Again.");
			}
		} while (!gameLoop); // end while if true
	}// end method gameRun

	/* Method to print the Ozlympic's main menu and return an input selection */
	public int displayMenu() { // display
		int option = 0; // game menu input not yet generated
		boolean validInput = false;

		do { // do-while loop until user enter right menu input
			validInput = true;
			try {// print the Ozlympic Game's Menu
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
			} catch (Exception e) { // to catch if user input is not an integer
				System.out.println("\nNot a valid Input. Please try again!\n");
				validInput = false;
			}
		} while (!validInput); // end while if true
		return option; // return user's selection
	} // end method displayMenu

}