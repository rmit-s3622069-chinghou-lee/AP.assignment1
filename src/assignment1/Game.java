package assignment1;

import java.util.*;

public class Game {
	private String raceID;
	private int raceRounds;
	private int raceType;
	private int userInputPrediction;
	private String athleteIDPredict;
	private int competeTime;

	final static int minAthlete = 4;
	final static int maxAthlete = 8;

	public int gameSelect() {
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
				setRaceID(raceID);
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
		System.out.println("======================================================================");
		if (participantsByType.size() >= 4 && participantsByType.size() <= 8) {
			for (int i = 0, No = 0; i < participantsByType.size(); i++, No++) {
				System.out.println(No + "\t" + participantsByType.get(i).toString());
			}
		} else if (participantsByType.size() <= 4 && participantsByType.size() >= 8) {
			System.out.println("Sorry! There is enough athletes to run the race!");
		}System.out.println("======================================================================");
	}

	public String getUserPrediction(ArrayList<Participant> participantsByType) {

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

	public String gameStart(String userPrediction, ArrayList<Race> raceResult) {
		String raceWinner = raceResult.get(0).getParticipant().getParticipantID();

		if (userPrediction == raceWinner) {
			System.out.println("Great Gob! You got the right one!");
			System.out.println("The Winner is " + raceWinner + ", "
					+ raceResult.get(0).getParticipant().getParticipantName() + "\n");
		} else if (userPrediction != raceWinner) {
			System.out.println("Better luck next time!\n");
			System.out.println("The Winner is " + raceWinner + ", "
					+ raceResult.get(0).getParticipant().getParticipantName() + "\n");
		}
		return raceWinner;
	}

	public ArrayList<Race> setRaceList(String gameID, int raceType, ArrayList<Participant> participantsByType,
			ArrayList<Official> official) {

		ArrayList<Race> raceResult = new ArrayList<Race>();

		for (int i = 0; i < participantsByType.size(); i++) {
			int competeTime = getCompeteTime(raceType);
			if (raceType == 1) {
				raceResult.add(new Race(gameID, participantsByType.get(i), official.get(0), competeTime, 0));
			} else if (raceType == 2) {
				raceResult.add(new Race(gameID, participantsByType.get(i), official.get(0), competeTime, 0));
			} else if (raceType == 3) {
				raceResult.add(new Race(gameID, participantsByType.get(i), official.get(0), 0, 0));
			} else {
				System.out.println("There is no race available!\n");
			}

		}
		Collections.sort(raceResult, Comparator.comparingInt(Race::getCompleteTime));
		Official o = new Official(null, null, 0, null, null);
		o.setScore(raceResult);
		return raceResult;
	}

	public void displayFinalResult(String raceID, ArrayList<Race> raceResult) {
		System.out.println("Race ID: " + raceID);
		System.out.println("Referee: " + raceResult.get(0).getOfficial());
		System.out.println("============================================================================");
		System.out.println("Athlete ID" + "\t" + "Athlete Name" + "\t" + "Athlete Age" + "\t" + "Athlete State" + "\t"
				+ "Race Time(s)");
		System.out.println("============================================================================");
		for (int i = 0; i < raceResult.size(); i++) {
			System.out.println(raceResult.get(i).toRaceResult());
		}
		System.out.println("");
	}

	public void displayAthletePoints(String raceID, ArrayList<Race> raceResult) {
		System.out.println("Race ID: " + raceID);
		System.out.println("===============================================");
		System.out.println("Athlete ID" + "\t" + "Athlete Name" + "\t" + "Athlete Points");
		System.out.println("===============================================");
		raceResult.forEach(System.out::println);
		System.out.println("");

	}

	public String getRaceID() {
		return raceID;
	}
	
	public void setRaceID(String raceID){
		this.raceID = raceID;
	}

	public int getCompeteTime(int raceType) {

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

}
