package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	ArrayList<Participant> Participant = new ArrayList<Participant>();
	private Database Database = new Database();
	private Race Race;

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

	public int generateGameRound(int raceType) {
		boolean gameRound = false;
		int rounds = 01; // not looping 1 -> 2

		do {
			String.format("%02d", rounds);
			if (raceType == 1 || raceType == 2 || raceType == 3) {
				if (raceType == 1) { // swimming
					rounds = rounds++;

					System.out.println("S" + rounds);
				}
				if (raceType == 2) { // running
					rounds += 1;
					System.out.print("R" + rounds);
				}
				if (raceType == 3) { // cycling
					rounds += 1;
					System.out.print("C" + rounds);
				}
				break;
			} else if (raceType != 1 || raceType != 2 || raceType != 3) {
				System.out.println("No game round!");
				gameRound = false;
			} else {
				System.out.println("Error!");
				break;
			}
		} while (!gameRound);
		return rounds;
	}

	public int gamePrediction(int raceType) {
		int userPredict = 0;
		boolean validInput = false;

		do {
			printGameSelectList(raceType);
			printGameSelectAthleteList(raceType);
			try {
				System.out.println("\nPlease predict the winner by entering the athlete's ID: ");
				Scanner scanner = new Scanner(System.in);
				userPredict = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Please insert valid athlete's ID!");
				validInput=false;
			}
		} while (!validInput);
		return userPredict;

	}

	public void printGameSelectList(int raceType) {
		Database.getParticipant();
		for (int i = 0; i < 1; i++) {
			String checkType = Database.getParticipant().get(i).getType();
			if (raceType == 1 && checkType.equals("Swimmer")) {
				System.out.println("No." + "\t" + "Swimmer ID" + "\t" + "Swimmer Name" + "\t" + "Swimmer Age" + "\t"
						+ "Swimmer State" + "\t");

			} else if (raceType == 2 && checkType.equals("Runner")) {
				System.out.println("No." + "\t" + "Runner ID" + "\t" + "Runner Name" + "\t" + "Runner Age" + "\t"
						+ "Runner State" + "\t");

			} else if (raceType == 3 && checkType.equals("Cyclist")) {
				System.out.println("No." + "\t" + "Cyclist ID" + "\t" + "Cyclist Name" + "\t" + "Cyclist Age" + "\t"
						+ "Cyclist State" + "\t");

			} else {
				System.out.println("Invalid Menu!");
				break;
			}
		}
	}

	public void printGameSelectAthleteList(int raceType) {
		Database.getParticipant();
		for (int i = 0, No = 1; i < Database.getParticipant().size(); i++, No++) {
			String checkType = Database.getParticipant().get(i).getType();
			String id = Database.getParticipant().get(i).getID();
			String name = Database.getParticipant().get(i).getName();
			int age = Database.getParticipant().get(i).getAge();
			String state = Database.getParticipant().get(i).getState();

			if (raceType == 1 && checkType.equals("Swimmer")) {
				System.out.println(
						No + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state + checkType);
			} else if (raceType == 2 && checkType.equals("Runner")) {
				System.out.println(
						No + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state + checkType);
			} else if (raceType == 3 && checkType.equals("Cyclist")) {
				System.out.println(
						No + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state + checkType);
			} else {
				// System.out.println("Empty Athletes!"); // to validate the
				// athlete print list
				break;
			}
		}
	}

	public int getUserPrediction(int raceType) {
		int userPrediction = gamePrediction(raceType);
		return userPrediction;

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
