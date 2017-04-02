package assignment1;

import java.util.Scanner;

public class Game {
	
	private ParticipantsDatabase PD = new ParticipantsDatabase();

	public int gameSelect() {
		int gameSelectInput = 0;
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
				gameSelectInput = scanner.nextInt(); // user insert input

				if (gameSelectInput == 1 || gameSelectInput == 2 || gameSelectInput == 3) {
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

		return gameSelectInput;
	}

	public void gamePrediction(int gameType) {
		boolean validInput = false;

		PD.printAthletes(gameType);
		do {
			try {
				System.out.println("Please predict the winner by entering the athlete's ID: ");
				Scanner scanner = new Scanner(System.in);
				int userPredict = scanner.nextInt();
				System.out.println(userPredict);
			} catch (Exception e) {
				System.out.println("Please insert valid athlete's ID!");
			}
		} while (!validInput);

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
