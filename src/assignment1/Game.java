package assignment1;

import java.util.*;

public class Game {
	private int gameRounds;

	private Database Database = new Database();

	private ArrayList<Race> Race = new ArrayList<Race>();
	ArrayList<Participant> Participant = Database.getAllParticipants();

	public int getGameRounds() {
		return gameRounds;
	}

	public int gameSelect() {
		int gameSelectInput = 0;
		boolean validInput = false;

		do {
			validInput = true;
			try {
				String menu[] = { "Select a sport to play: ", "========================", "1. Swimming race",
						"2. Running race", "3. Cycling race" };
				for (int i = 0; i < menu.length; i++)
					System.out.println(menu[i]); // display the sport selection
													// menu

				System.out.print("Enter a option: ");
				Scanner scanner = new Scanner(System.in);
				gameSelectInput = scanner.nextInt(); // user insert input

				if (gameSelectInput == 1) {
					addGameRound(gameSelectInput);
					System.out.println("\nCurrent sport: Swimming Race\n");
				} else if (gameSelectInput == 2) {
					addGameRound(gameSelectInput);
					System.out.println("\nCurrent sport: Running Race\n");
				} else if (gameSelectInput == 3) {
					addGameRound(gameSelectInput);
					System.out.println("\nCurrent sport: Cycling Race\n");
				} else {
					System.out.println("\nPlease insert a valid input!\n");
					validInput = false;
				}
			} catch (Exception e) {
				System.out.println("\nNot a valid Input. Please try again!\n");
				validInput = false;
			}
		} while (!validInput);

		return gameSelectInput;
	}

	public int addGameRound(int raceType) {
		boolean gameRound = false;

		do {
			String.format("%02d", gameRounds);
			if (raceType >= 1 && raceType <= 3) {
				gameRounds += 1;
				break;
			} else {
				System.out.println("\nError\n!");
				gameSelect();
			}
		} while (!gameRound);
		return gameRounds;
	}

	public int gamePrediction(int raceType) {
		int userPredict = 0;
		boolean validInput = false;

		do {
			printAthleteList(raceType);
			try {
				System.out.println("\nPlease predict the winner by entering the athlete's ID: ");
				Scanner scanner = new Scanner(System.in);
				userPredict = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Please insert valid athlete's ID!");
				validInput = false;
			}
			break;
		} while (!validInput);
		return userPredict;

	}

	public void printAthleteList(int raceType) {
		boolean printLoop = false;

		System.out.println("No." + "\t" + "Athlete ID" + "\t" + "Athlete Name" + "\t" + "Athlete Age" + "\t"
				+ "Athlete State" + "\t");
		do {
			for (int i = 0, No = 1; i < Database.getAllParticipants().size(); i++, No++) {
				String checkType = Database.getAllParticipants().get(i).getType();
				String id = Database.getAllParticipants().get(i).getID();
				String name = Database.getAllParticipants().get(i).getName();
				int age = Database.getAllParticipants().get(i).getAge();
				String state = Database.getAllParticipants().get(i).getState();

				if (raceType == 1 && checkType.equals("Swimmer")) {
					System.out.println(No + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state);
				} else if (raceType == 2 && checkType.equals("Runner")) {
					System.out.println(No + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state);
				} else if (raceType == 3 && checkType.equals("Cyclist")) {
					System.out.println(No + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state);
				} else {
					printLoop=true;
				}
			}
		} while (!printLoop);
	}

	public void gameStart() {
		Race = new ArrayList<Race>();
		Race.add(null);
		System.out.println("gameStart");

	}

	public void displayFinalResult() {
		System.out.println("displayFinalResult");
	}

	public void displayAthletePoints() {
		System.out.println("displayAthletePoints");

	}

}
