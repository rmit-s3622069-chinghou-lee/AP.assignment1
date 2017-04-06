package assignment1;

import java.util.*;

public class Game {
	private String raceID;
	private int raceRounds;
	private int userPrediction;

	final static int minAthlete = 4;
	final static int maxAthlete = 8;

	private ArrayList<Race> raceStart; // store race
	private ArrayList<Participant> ParticipantList; // get participant by type

	public void printAthleteList(int raceType, ArrayList<Participant> participantsByType, ArrayList<Official> official) {
		boolean printLoop = false;
		ArrayList<Race> raceStart = new ArrayList<Race>();
		do {
			for (int i = 0; i < participantsByType.size(); i++) {
				if (raceType >= 1 && raceType <= 3) {
					raceStart.add(new Race(i, participantsByType.get(i), official.get(1), i, i));
					System.out.println(ParticipantList.toString());
				} else {
					System.out.println("No Participant List!");
					printLoop = true; // end the loop
				}
			}
			raceStart.trimToSize();
			Collections.sort(raceStart, Comparator.comparing(Race::getCompleteTime).reversed());
			break;
		} while (!printLoop);
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
					System.out.println("\nCurrent sport: Swimming Race " + raceID +"\n");
				} else if (raceType == 2) {
					raceRounds += 1;
					raceID = "SP" + raceRounds;
					System.out.println("\nCurrent sport: Running Race " + raceID +"\n");
				} else if (raceType == 3) {
					raceRounds += 1;
					raceID = "CY" + raceRounds;
					System.out.println("\nCurrent sport: Cycling Race " + raceID +"\n");
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
		System.out.println("No" + "\t" + "Athlete ID" + "\t" + "Athlete Name" + "\t" + "Athlete Age" + "\t" + "Athlete State");
		for (int i = 0, No = 1; i < participantsByType.size(); i++, No++) {
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

	public String gameStart(String userPrediction, ArrayList<Participant> participantsByType) {
		String raceWinner = participantsByType.get(1).getParticipantID();
		if (userPrediction == raceWinner){
			System.out.println("\nYou Win\n");
		}else if (userPrediction != raceWinner){
			System.out.println("The winner is " + raceWinner);
		}
		return raceWinner;
	}
	
	public void displayFinalResult() {
		// raceStart = storeRace(raceType);
		for (int i = 0; i < raceStart.size(); i++) {
			System.out.println(raceStart.get(i).toString());
		}
		// System.out.println("displayFinalResult");
	}

	public void displayAthletePoints() {
		System.out.println("displayAthletePoints");

	}
	
	public String getRaceID(){
		return raceID;
	}

}
