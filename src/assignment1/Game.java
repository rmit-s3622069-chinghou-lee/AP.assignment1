package assignment1;

/*
 * Ozlympic Game ver 1.0 - Game class
 * 
 * Author: Ching Hou, Lee
 * 
 * Date created: Mar 29, 2017
 * 
 * This program is a system for managing a mini game event - Ozlympic Game.
 * 
 * This Ozlympic Game event has three sports: swimming, cycling and running.
 * User's prediction is limited to only one athlete for each game.
 * In the end of the game, the user is able to view results and athlete's points.
 * 
 * (C) Copyright by Ching Hou,Lee. All Rights Reserved.
 */

import java.util.*;

//Menu selection's methods for Ozlympic Game
public class Game {

	private String raceID;
	private int raceRounds;
	private int raceType;

	private String userPrediction;

	private Database Database = new Database();

	private ArrayList<Official> official = Database.getOfficial();

	private ArrayList<Participant> participantsByType;
	private ArrayList<Race> raceStart;
	private ArrayList<Race> raceResult;

	public ArrayList<Participant> getParticipantByType(int raceType) {
		participantsByType = Database.ParticipantsByType(raceType); // get
																	// ParticipantsByType()
		return participantsByType; // return participant based by race type
	} // end method ParticipantsByType()

	/*
	 * Method for the Ozlympic Game Menu No.1 to get and return user input for
	 * sport race
	 */
	public int gameSelect() {

		boolean validInput = false;
		do {

			try { // to print sport race menu
				String menu[] = { "Select a sport to play: ", "========================", "1. Swimming race",
						"2. Running race", "3. Cycling race" };
				for (int i = 0; i < menu.length; i++)
					System.out.println(menu[i]);

				System.out.print("Enter a option: ");
				Scanner scanner = new Scanner(System.in);
				raceType = scanner.nextInt(); // user insert input

				if (raceType == 1) { // 1 = swimming race
					raceRounds += 1;
					raceID = "SW" + raceRounds; // set the Swimming Race ID
					System.out.println("\nCurrent sport: Swimming Race " + raceID + "\n");
					validInput = true;
				} else if (raceType == 2) { // 2 is running race
					raceRounds += 1;
					raceID = "SP" + raceRounds; // set the Running Race ID
					System.out.println("\nCurrent sport: Running Race " + raceID + "\n");
				} else if (raceType == 3) { // 3 is cycling race
					raceRounds += 1;
					raceID = "CY" + raceRounds; // set the Cycling Race ID
					System.out.println("\nCurrent sport: Cycling Race " + raceID + "\n");
				} else { // to tell user that they insert wrong input
					System.out.println("\nNot a valid Input. Please try again!\n");
					validInput = false;
				}
			} catch (Exception e) { // to tell user to input valid input
				System.out.println("\nNot a valid Input. Please try again!\n");
				validInput = false;
			}
		} while (!validInput); // end while if true
		return raceType; // return race type
	} // end method gameSelect

	/*
	 * Method to print athlete list based race type and to check sufficiency of
	 * athlete to compete.
	 */
	public void printAthleteSelection(int raceType) {
		final int minAthlete = 4; // min athlete allowed to join is 4
		final int maxAthlete = 8; // max athlete allowed to join is 8

		System.out.println(
				"No" + "\t" + "Athlete ID" + "\t" + "Athlete Name" + "\t" + "Athlete Age" + "\t" + "Athlete State");
		System.out.println("======================================================================");
		if (participantsByType.size() >= 4 && participantsByType.size() <= 8) { // check
			// sufficiency
			// of
			// athlete
			// to
			// compete
			for (int i = 0, No = 0; i < participantsByType.size(); i++, No++) {
				System.out.println(No + "\t" + participantsByType.get(i).toString());
			}
		} else if (participantsByType.size() <= minAthlete && participantsByType.size() >= maxAthlete) { // not
			// enough
			// participant
			System.out.println("Sorry! There is enough athletes to run the race!");
		}
		System.out.println("======================================================================");
	} // end method printAthleteSelection

	/*
	 * Method to let user input their prediction and return user prediction by
	 * converting to athlete ID
	 */
	public String getUserPrediction(int raceType) {
		int userInputPrediction;
		String athleteIDPredict = null;
		boolean validInput = false;

		getParticipantByType(raceType);
		printAthleteSelection(raceType);
		do {
			try {
				System.out.println("\nPlease predict the winner by entering the athlete's ID: ");
				Scanner scanner = new Scanner(System.in);
				userInputPrediction = scanner.nextInt(); // user input their
				// prediction
				athleteIDPredict = participantsByType.get(userInputPrediction).getParticipantID(); // convert
				// user
				// prediction
				// to
				// athlete's
				// ID
				// for
				// later
				// comparison
			} catch (Exception e) { // if user insert not according to athlete
				// list provided
				System.out.println("Please insert valid athlete's ID!");
				validInput = false;
			}
			break;
		} while (!validInput); // end loop if true
		return athleteIDPredict; // return athlete ID for comparison
	} // end method getUserPrediction

	/*
	 * Method of Game menu no 3. This method compare user prediction and system
	 * generated winner. After that, system will generate congratulations
	 * message.
	 */
	public void gameStart(int raceType) {

		raceStart = setRaceList(raceType);
		String raceWinner = raceStart.get(0).getParticipant().getParticipantID(); // get
		// winner
		// from
		// race
		// result

		if (userPrediction == raceWinner) { // if user prediction is same as
			// race result's winner
			System.out.println("Great Gob! You got the right one!");
			System.out.println("The Winner is " + raceWinner + ", "
					+ raceStart.get(0).getParticipant().getParticipantName() + "\n"); // display
			// the
			// winner
			// name
		} else if (userPrediction != raceWinner) { // if user prediction is not
			// the same as race result's
			// winner
			System.out.println("Better luck next time!\n");
			System.out.println("The Winner is " + raceWinner + ", "
					+ raceStart.get(0).getParticipant().getParticipantName() + "\n"); // display
			// the
			// winner
			// name
		}
	} // end method gameStart

	public ArrayList<Race> setRaceList(int raceType) {

		raceResult = new ArrayList<Race>();

		for (int i = 0; i < participantsByType.size(); i++) {
			int competeTime = getCompeteTime(raceType);
			if (raceType == 1) { // 1 = swimming race
				raceResult.add(new Race(raceID, participantsByType.get(i), official.get(0), competeTime, 0));
			} else if (raceType == 2) { // 2 = sprinter race
				raceResult.add(new Race(raceID, participantsByType.get(i), official.get(0), competeTime, 0));
			} else if (raceType == 3) { // 3 = cycling race
				raceResult.add(new Race(raceID, participantsByType.get(i), official.get(0), 0, 0));
			} else { // if no race available
				System.out.println("There is no race available!\n");
			}

		}
		Collections.sort(raceResult, Comparator.comparingInt(Race::getCompleteTime)); // sort
		// race
		// based
		// on
		// shortest
		// athlete's
		// complete
		// time
		Official o = new Official(null, null, 0, null, null);// call
		// official/referee
		o.setScore(raceResult);// referee to set score for winner
		return raceResult; // return ArrayList<Race> Race Result
	} // end method setRaceList

	/*
	 * Method to display final result depends on user's menu input. Game menu no
	 * 4 will generate race result. Game menu no 5 will generate respective
	 * athlete points based on race result
	 */
	public void displayFinalResult(int gameOption) {

		if (gameOption == 4 && raceResult != null) { // Ozlympic menu No 4 and
			// race result is not
			// empty
			System.out.println("Race ID: " + raceID); // display race ID
			System.out.println("Referee: " + raceResult.get(0).getOfficial());
			System.out.println("============================================================================");
			System.out.println("Athlete ID" + "\t" + "Athlete Name" + "\t" + "Athlete Age" + "\t" + "Athlete State"
					+ "\t" + "Race Time(s)");
			System.out.println("============================================================================");
			for (int i = 0; i < raceResult.size(); i++) {
				System.out.println(raceResult.get(i).toRaceResult()); // print
				// race
				// result
			}
			System.out.println("");
		} else if (gameOption == 5 && raceResult != null) { // Ozlympic menu No
			// 5 and race result
			// is not empty
			System.out.println("Race ID: " + raceID);
			System.out.println("===============================================");
			System.out.println("Athlete ID" + "\t" + "Athlete Name" + "\t" + "Athlete Points");
			System.out.println("===============================================");
			raceResult.forEach(System.out::println); // print athletes' point
			// list
			System.out.println("");
		} else if (raceResult.isEmpty()) { // if race result list is empty
			System.out.println("Please run a race to get the race result!\n");
		}
	} // end method displayFinalResult

	/* Method to get Race ID */
	public String getRaceID() {
		return raceID;
	} // end method getRaceID

	/* Method to get respective athlete's complete race time by race type */
	public int getCompeteTime(int raceType) {
		int competeTime = 0;
		if (raceType == 1) { // 1 = swimming race
			Swimmer s = new Swimmer(null, null, 0, null, null); // get Swimmer
			competeTime = s.compete(); // get individual Swimmer's complete race
			// time
		} else if (raceType == 2) { // 1 = running race
			Sprinter r = new Sprinter(null, null, 0, null, null); // get
			// Sprinter
			competeTime = r.compete(); // get individual Sprinter's complete
			// race time
		} else if (raceType == 3) { // 1 = cycling race
			Cyclist c = new Cyclist(null, null, 0, null, null); // get Cyclist
			competeTime = c.compete(); // get individual Cyclist's complete race
			// time
		}
		return competeTime; // return respective athletes' individual race time

	} // end method getCompeteTime

} // end class Game
