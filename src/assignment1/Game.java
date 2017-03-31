package assignment1;

import java.util.Scanner;

public class Game {

	private String raceID;

	private int minAthletes;
	private int maxAthletes;
	private int minTime;
	private int maxTime;

	private ParticipantsDatabase pd;

	public Game() {
		pd = new ParticipantsDatabase();
	}

	public String gameSelect() {
		int option = 0;
		String raceType = null;
		boolean validInput = false;

		do {
			try {
				String menu[] = { "Select a sport to play: ", "1. Swimming race", "2. Running race",
						"3. Cycling race" };
				for (int i = 0; i < menu.length; i++)
					System.out.println(menu[i]); // display the main menu

				System.out.print("Enter a option: ");
				Scanner scanner = new Scanner(System.in);
				option = scanner.nextInt(); // user insert input

				if (option == 1) {
					raceType = "swim";
					validInput = true;
				} else if (option == 2) {
					raceType = "run";
					validInput = true;
				} else if (option == 3) {
					raceType = "cycle";
					validInput = true;
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
		// System.out.println(raceType);
		return raceType;
	}

	public int gamePrediction() {
		int userPredict = 0;
		boolean validInput = false;
		do {
			try {
				System.out.println("Print out athletes base on gameType!");
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

	}

	public void displayFinalResult() {
		System.out.println("displayFinalResult");

	}

	public void displayAthletePoints() {
		System.out.println("displayAthletePoints");

	}
}

