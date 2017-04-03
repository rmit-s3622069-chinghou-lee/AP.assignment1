package assignment1;

import java.util.ArrayList;

public class Race extends Game {

	private int athleteSelect;
	private double completeTime;
	private int gameScore;
	private int minAthlete = 4;
	private int maxAthlete = 8;

	private Database Database = new Database();

	private Game Game = new Game();

	public Race(int athleteSelect, String athleteID, String athleteName, int athleteAge, String athleteState,
			double completeTime, int gameScore) {
		this.athleteSelect = athleteSelect;
		this.completeTime = completeTime;
		this.gameScore = gameScore;

	}
	
	public void getAthleteID(int raceType) {
		Database.getParticipant();
		for (int i = 0; i < 1; i++) {
			String checkType = Database.getParticipant().get(i).getType();
			if (raceType == 1 && checkType.equals("Swimmer")) {
			} else if (raceType == 2 && checkType.equals("Runner")) {
			} else if (raceType == 3 && checkType.equals("Cyclist")) {
			} else {
				System.out.println("There is no race selected!");
				break;
			}
		}
	}

	public int compete(int raceType) {
		// raceType determine athlete and generate random time
		// for loop and return random time
		return athleteSelect;

	}

/*	public ArrayList<Race> AthleteResults() {
		ArrayList<Race> athleteResults = new ArrayList<Race>();
		int i = 
		athleteResults.add(new Race(i, athleteID, athleteName, athleteAge, athleteState, completeTime, gameScore)))
		return AthleteResults;
	}

	public ArrayList<Race> addAthleteResults(int gameType, int completeTime, int gameScore) {
		boolean gameON = false;

		do {
			if (gameType == 1 || gameType == 2 || gameType == 3) {

			}
			for (int i = 0; i < AthleteResults.size(); i++) {
				String athleteID = Participant.getID();
				String athleteName = Participant.getName();
				int athleteAge = Participant.getAge();
				String athleteState = Participant.getState();
				AthleteResults
						.add(new Race(i, athleteID, athleteName, athleteAge, athleteState, completeTime, gameScore));
			}
		} while (!gameON);
		return AthleteResults;
	}*/

	public int raceSwim(String raceType) {
		// generate
		return 0;
	}

	public int raceCycle(String raceType) {
		return 0;
	}

	public int raceRun(String raceType) {
		return 0;
	}

	public int raceTime() {
		// Swimmer swimmer = new Swimmer();
		// double timeSwim = Swimmer.compete();
		return 0;

	}

	/*
	 * public void printAllParticipant() { // Test to print all athletes for
	 * (int i = 0; i < pd.getParticipant().size(); i++) { String id =
	 * pd.getParticipant().get(i).getID(); String name =
	 * pd.getParticipant().get(i).getName(); int age =
	 * pd.getParticipant().get(i).getAge(); String state =
	 * pd.getParticipant().get(i).getState(); String athleteType =
	 * pd.getParticipant().get(i).getType(); System.out.println("ID = " + id +
	 * " name = " + name + " age = " + age + " state = " + state +
	 * " athlete type = " + athleteType); } }
	 */
}
