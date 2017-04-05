package assignment1;

import java.util.*;

public class Game {
	private int gameRounds;
	final static int minAthlete = 4;
	final static int maxAthlete = 8;

	private Database Database = new Database();

	private ArrayList<Participant> Participant;
	private ArrayList<Official> Official = Database.getOfficial();
	private ArrayList<Participant> AthleteList = Database.getAllParticipants();;
	private ArrayList<Race> raceStart;

	public void gameStart(int raceType) {
		raceStart = storeRace(raceType);
		for (int i = 0; i < raceStart.size(); i++)
		System.out.println(raceStart.get(i).toString());
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
			if (raceType >= 1 && raceType <= 3) {
				gameRounds += 1;
				break;
			} else {
				System.out.println("\nError\n!");
				gameSelect(); // return to Menu
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
				compareResult(userPredict);
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
			for (int i = 0, No = 1; i < AthleteList.size(); i++, No++) {
				String checkType = AthleteList.get(i).getType();

				if (raceType == 1 && checkType.equals("Swimmer")) {
					System.out.println(No + "\t" + AthleteList.get(i).toString());
				} else if (raceType == 2 && checkType.equals("Sprinter")) {
					System.out.println(No + "\t" + AthleteList.get(i).toString());
				} else if (raceType == 3 && checkType.equals("Cyclist")) {
					System.out.println(No + "\t" + AthleteList.get(i).toString());
				} else {
					AthleteList.trimToSize();
					printLoop = true; // end the loop
				}
			}
		} while (!printLoop);
	}

	public ArrayList<Race> storeRace(int raceType) {
		boolean printLoop = false;
		raceStart = new ArrayList<Race>();

		do {
			for (int i = 0, No = 1; i < AthleteList.size(); i++, No++) {
				String checkType = AthleteList.get(i).getType();

				if (raceType == 1 && checkType.equals("Swimmer")) {
					raceStart.add(new Race(No, AthleteList.get(i), Official.get(1), i, No));
				} else if (raceType == 2 && checkType.equals("Sprinter")) {
					raceStart.add(new Race(No, AthleteList.get(i), Official.get(1), i, No));
				} else if (raceType == 3 && checkType.equals("Cyclist")) {
					raceStart.add(new Race(No, AthleteList.get(i), Official.get(1), i, No));
				} else {
					AthleteList.trimToSize();
					printLoop = true; // end the loop
				}
			}Collections.sort(raceStart, Comparator.comparing(Race::getCompleteTime).reversed());
		} while (!printLoop);
		return raceStart;
	}

	public int compareResult(int userPrediction) {
		// if(userPrediction == raceStart.get(1)){
		//
		// }
		return 0;
	}

	public ArrayList<Race> setRacePoints() { // not adding
		raceStart.get(0).setGameRounds(5);
		raceStart.get(1).setGameRounds(2);
		raceStart.get(2).setGameRounds(1);
		return raceStart;

	}

	public void displayFinalResult() {
		raceStart = new ArrayList<Race>();
		
		raceStart = setRacePoints();
		for (int i = 0; i < raceStart.size(); i++) {
//			System.out.println("Result for race: " + raceStart.get(i).getGameRounds());
//			System.out.println("Referee for this race is: " + raceStart.get(i).getOfficial());
			System.out.println(raceStart.get(i).toString());
		}
		// System.out.println("displayFinalResult");
	}

	public void displayAthletePoints() {
		System.out.println("displayAthletePoints");

	}

}
