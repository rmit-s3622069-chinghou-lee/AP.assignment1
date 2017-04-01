package assignment1;

import java.util.Scanner;

public class Driver {
	
	private Game game;
	private ParticipantsDatabase pd = new ParticipantsDatabase();

	// constants corresponding to main menu options
	private static final int gameSelect = 1;
	private static final int gamePrediction = 2;
	private static final int gameStart = 3;
	private static final int displayFinalResult = 4;
	private static final int displayAthletePoints = 5;
	private static final int gameExit = 6;

	public void menuSelect() {

		int option = displayMenu();

		switch (option) {
		case gameSelect:
			gameSelect();
			menuSelect();
			break;
		case gamePrediction:
			gamePrediction();
			break;
		case gameStart:
			gameStart();
			break;
		case displayFinalResult:
			displayFinalResult();
			break;
		case displayAthletePoints:
			displayAthletePoints();
			break;
		case gameExit:
			System.out.println("Game Over!");
			System.exit(0);
			break;
		}
	}

	public int displayMenu() { // display the Ozlympic's main menu and return an
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
					System.out.println("Please insert a valid input!");
					System.out.println("");
					validInput = false;
				}
			} catch (Exception e) {
				System.out.println("Not a valid Input. Please try again!");
				System.out.println("");
				validInput = false;
			}
		} while (!validInput);
		return option; // return user's selection
	} // end method displayMenu

	public int gameSelect() {
		int option = 0;
		boolean validInput = false;

		do {
			validInput = true;
			try {
				String menu[] = { "Select a sport to play: ", "1. Swimming race", "2. Running race",
						"3. Cycling race" };
				for (int i = 0; i < menu.length; i++)
					System.out.println(menu[i]); // display the main menu

				System.out.print("Enter a option: ");
				Scanner scanner = new Scanner(System.in);
				option = scanner.nextInt(); // user insert input
				
				if (option == 1 || option ==2 || option ==3) {
					System.out.println("");
				} else {
					System.out.println("Please insert a valid input!");
					System.out.println("");
					validInput = false;
				}
			} catch (Exception e) {
				System.out.println("Not a valid Input. Please try again!");
				System.out.println("");
				validInput = false;
			}
		} while (!validInput);

		return option;
	}

	public int gamePrediction() {
		int userPredict = 0;
		boolean validInput = false;
		
		pd.printAthletes();
		do {
			try {
				System.out.println("Please predict the winner by entering the athlete's ID: ");
				Scanner scanner = new Scanner(System.in);
				userPredict = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Please insert valid athlete's ID!");
			}
		} while (!validInput);

		return userPredict;
	}

	public void gameStart() {
		System.out.println("gameStart");

	}

	public void displayFinalResult() {
		System.out.println("displayFinalResult");
	}

	public void displayAthletePoints() {
		System.out.println("displayAthletePoints");

	}

}