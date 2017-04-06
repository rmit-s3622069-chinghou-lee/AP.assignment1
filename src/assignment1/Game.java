package assignment1;

import java.util.*;

public class Game {
	private String raceID;
	private int raceRounds;
	private int userPrediction;

	final static int minAthlete = 4;
	final static int maxAthlete = 8;

	private Race race;

	public ArrayList<Race> setRaceList(String gameID, int raceType, ArrayList<Participant> participantsByType,
			ArrayList<Official> official) {
		boolean printLoop = false;

		race.getCompete(raceType);

		ArrayList<Race> raceStart = new ArrayList<Race>();

		do {
			for (int i = 0; i < participantsByType.size(); i++) {
				if (raceType == 1) {
					raceStart.add(new Race(gameID, participantsByType.get(i), official.get(0), 0, 0));
					System.out.println(raceStart.get(i).toString());
				} else if (raceType == 2) {
					raceStart.add(new Race(gameID, participantsByType.get(i), official.get(0), 0, 0));
					System.out.println(participantsByType.toString());
				} else if (raceType == 3) {
					raceStart.add(new Race(gameID, participantsByType.get(i), official.get(0), 0, 0));
					System.out.println(participantsByType.toString());
				}
				// System.out.println("No Participant List!");
				// printLoop = true; // end the loop
			}

			raceStart.trimToSize();
			Collections.sort(raceStart, Comparator.comparing(Race::getCompleteTime).reversed());
			break;
		} while (!printLoop);
		return raceStart;
	}

	public int gameSelect() {
		boolean validInput = false;
		int raceType = 0;

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
				raceType = scanner.nextInt(); // user insert input

				if (raceType == 1) {
					raceRounds += 1;
					raceID = "SW" + raceRounds;
					System.out.println("\nCurrent sport: Swimming Race " + raceID + "\n");
				} else if (raceType == 2) {
					raceRounds += 1;
					raceID = "SP" + raceRounds;
					System.out.println("\nCurrent sport: Running Race " + raceID + "\n");
				} else if (raceType == 3) {
					raceRounds += 1;
					raceID = "CY" + raceRounds;
					System.out.println("\nCurrent sport: Cycling Race " + raceID + "\n");
				} else {
					System.out.println("\nPlease insert a valid input!\n");
					validInput = false;
				}

			} catch (Exception e) {
				System.out.println("\nNot a valid Input. Please try again!\n");
				validInput = false;
			}
		} while (!validInput);
		return raceType;
	}

	public void printAthleteSelection(ArrayList<Participant> participantsByType) {
		System.out.println(
				"No" + "\t" + "Athlete ID" + "\t" + "Athlete Name" + "\t" + "Athlete Age" + "\t" + "Athlete State");
		for (int i = 0, No = 0; i < participantsByType.size(); i++, No++) {
			System.out.println(No + "\t" + participantsByType.get(i).toString());
		}
	}

	public String getUserPrediction(ArrayList<Participant> participantsByType) {
		int userInputPrediction = 0;
		String athleteIDPredict = null;
		boolean validInput = false;

		do {
			try {
				System.out.println("\nPlease predict the winner by entering the athlete's ID: ");
				Scanner scanner = new Scanner(System.in);
				userInputPrediction = scanner.nextInt();
				athleteIDPredict = participantsByType.get(userInputPrediction).getParticipantID();
			} catch (Exception e) {
				System.out.println("Please insert valid athlete's ID!");
				validInput = false;
			}
			break;
		} while (!validInput);
		return athleteIDPredict;
	}

	public String gameStart(String userPrediction, ArrayList<Participant> participantsByType,
			ArrayList<Race> raceResult) {
		String raceWinner = participantsByType.get(0).getParticipantID();
		raceResult.get(0).setAthleteScore(5);
		raceResult.get(1).setAthleteScore(2);
		raceResult.get(2).setAthleteScore(1);

		if (userPrediction == raceWinner) {
			System.out.println("You Win");
			System.out.println(
					"The Winner is " + raceWinner + ", " + participantsByType.get(1).getParticipantName() + "\n");
		} else if (userPrediction != raceWinner) {
			System.out.println("You lose!");
			System.out.println(
					"The Winner is " + raceWinner + ", " + participantsByType.get(1).getParticipantName() + "\n");
		}
		return raceWinner;
	}

	public void displayFinalResult(ArrayList<Race> raceResult) {
		// raceStart = storeRace(raceType);
		for (int i = 0; i < raceResult.size(); i++) {
			System.out.println(raceResult.get(i).toString());
		}
		// System.out.println("displayFinalResult");
	}

	public void displayAthletePoints() {
		System.out.println("displayAthletePoints");

	}

	public String getRaceID() {
		return raceID;
	}

}
