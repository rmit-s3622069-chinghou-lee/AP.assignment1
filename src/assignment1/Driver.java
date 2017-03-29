package assignment1;

import java.util.Scanner;

/*
 * Driver program for the Ozlympic
 */
public class Driver {
	private static Scanner scanner = new Scanner(System.in);
	private int option = 0;
	private boolean validInput= false;
	
	public void run() {
		menuSelect();
	}

	// start Ozylimpic
	public int menuDisplay() {
		
		do {
			String menu[] = { "Ozlympic Game", 
					"========================", 
					"1. Select a game to run",
					"2. Predict the winner of the game", 
					"3. Start the game",
					"4. Display the final results of all games", 
					"5. Display the points of all athletes", 
					"6. Exit" };
			for (int i = 0; i < menu.length; i++)
				System.out.println(menu[i]); // display the main menu

			System.out.print("Enter a option: ");
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
	
	public void menuSelect(){
		int option = menuDisplay();
		switch (option) {
		case (1):
			gameSelect();
			break;
		case (2):
			gamePrediction();
			break;
		case (3):
			gameStart();
			break;
		case (4):
			displayFinalResult();
			break;
		case (5):
			displayAthletePoints();
			break;
		case (6):
			System.out.println("Game Over!");
			System.exit(0);
			break;
		}
	}

	public void gameSelect() {
//		System.out.println("selectGame");
		
		do{
			String menu[] = { "Select a sport to play: ", 
					"1. Swimming race",
					"2. Running race", 
					"3. Cycling race" };
			for (int i = 0; i < menu.length; i++)
				System.out.println(menu[i]); // display the main menu

			System.out.print("Enter a option: ");
			option = scanner.nextInt(); // user insert input
			
			if (option == 1){
				System.out.println("Swimming Race");
			}
			else if (option == 2){
				System.out.println("Running Race");
			}
			else if (option == 3){
				System.out.println("Cycling Race");
			} else {
				System.out.println("Invalid Input!");
				validInput = false;
			}
		} while (!validInput);

	}

	public void gamePrediction() {
		System.out.println("prediction");

	}

	public void gameStart() {
		System.out.println("startGame");

	}

	public void displayFinalResult() {
		System.out.println("displayFinalResult");

	}

	public void displayAthletePoints() {
		System.out.println("displayAthletePoints");

	}
}