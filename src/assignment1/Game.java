package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	private ParticipantsDatabase PD = new ParticipantsDatabase();
	private Race Race;

	public int generateGameRound(int raceType) {  
		boolean gameRound = false;
		int rounds = 0; // not looping 1 -> 2

		do {
			String.format("%02d", rounds);
			if (raceType == 1 || raceType == 2 || raceType == 3) {
				if (raceType == 1) { // swimming
					rounds = rounds ++;

					System.out.println("S" + rounds);
				}
				if (raceType == 2) { // running
					rounds += 1;
					System.out.print("R"+ rounds);
				}
				if (raceType == 3) { // cycling
					rounds += 1;
					System.out.print("C"+ rounds);
				}break;
			} else if (raceType != 1 || raceType != 2 || raceType != 3) {
				System.out.println("No game round!");
				gameRound = false;
			} else {
				System.out.println("Error!");
			}
		} while (!gameRound);
		return rounds;
	}
	
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

	public void gamePrediction(int raceType) {
		boolean validInput = false;
		
		do {
			PD.printGameSelect(raceType);
			// Race.printGameSelect(raceType, PD.getParticipant()); // Can't use method?
			try {
				System.out.println("\nPlease predict the winner by entering the athlete's ID: ");
				Scanner scanner = new Scanner(System.in);
				int userPredict = scanner.nextInt();
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
