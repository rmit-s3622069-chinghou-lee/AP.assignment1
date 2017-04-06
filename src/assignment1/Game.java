package assignment1;

import java.util.*;

public class Game {
	private String raceID;
	private int raceRounds;
	private int userPrediction;

	final static int minAthlete = 4;
	final static int maxAthlete = 8;
	
	public void displayFinalResult(ArrayList<Race> raceResult) {
		// raceStart = storeRace(raceType);
		for (int i = 0; i < raceResult.size(); i++) {
			System.out.println(raceResult.get(i).toRaceResult());
		}
		// System.out.println("displayFinalResult");
	}

	public void displayAthletePoints(ArrayList<Race> raceResult) {
		raceResult.forEach(System.out::println);

	}

	public ArrayList<Race> setRaceList(String gameID, int raceType, ArrayList<Participant> participantsByType,
			ArrayList<Official> official) {

		ArrayList<Race> raceStart = new ArrayList<Race>();

		for (int i = 0; i < participantsByType.size(); i++) {
			int competeTime = getCompeteTime(raceType);
			if (raceType == 1) {
				raceStart.add(new Race(gameID, participantsByType.get(i), official.get(0), competeTime, 0));
			} else if (raceType == 2) {
				raceStart.add(new Race(gameID, participantsByType.get(i), official.get(0), competeTime, 0));
			} else if (raceType == 3) {
				raceStart.add(new Race(gameID, participantsByType.get(i), official.get(0), 0, 0));
			} else {
				System.out.println("There is no race available!\n");
			}

		}
		Collections.sort(raceStart, Comparator.comparingInt(Race::getCompleteTime));
		raceStart.get(0).setAthleteScore(5);
		raceStart.get(1).setAthleteScore(2);
		raceStart.get(2).setAthleteScore(1);
		return raceStart;
	}

	public int getCompeteTime(int raceType) {
		int competeTime = 0;
		if (raceType == 1) {
			Swimmer s = new Swimmer(null, null, 0, null, null);
			competeTime = s.compete();
		} else if (raceType == 1) {
			Sprinter r = new Sprinter(null, null, 0, null, null);
			competeTime = r.compete();
		} else if (raceType == 1) {
			Cyclist c = new Cyclist(null, null, 0, null, null);
			competeTime = c.compete();
		}
		return competeTime;

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



	public String getRaceID() {
		return raceID;
	}

}
