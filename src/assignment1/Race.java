package assignment1;

import java.util.ArrayList;

public class Race extends Game {

	private int athleteSelect;
	private double completeTime;
	private int gameScore;
	private int minAthlete = 4;
	private int maxAthlete = 8;

	private ParticipantsDatabase PD = new ParticipantsDatabase();

	private Game Game = new Game();

	public Race(int athleteSelect, String athleteID, String athleteName, int athleteAge, String athleteState,
			double completeTime, int gameScore) {
		this.athleteSelect = athleteSelect;
		this.completeTime = completeTime;
		this.gameScore = gameScore;

	}

	public int compete(int raceType) {
		// raceType determine athlete and generate random time
		// for loop and return random time
		return athleteSelect;

	}

/*	 public void printGameSelect(int raceType, ArrayList<Participant>
	 Participant) {
	 for (int i = 0; i < 1; i++) {
	 String checkType = Participant.get(i).getType();
	 if (raceType == 1 && checkType.equals("Swimmer")) {
	 System.out.println("No." + "\t" + "Swimmer ID" + "\t" + "Swimmer Name" +
	 "\t" + "Swimmer Age" + "\t"
	 + "Swimmer State" + "\t");
	
	 } else if (raceType == 2 && checkType.equals("Runner")) {
	 System.out.println("No." + "\t" + "Runner ID" + "\t" + "Runner Name" +
	 "\t" + "Runner Age" + "\t"
	 + "Runner State" + "\t");
	
	 } else if (raceType == 3 && checkType.equals("Cyclist")) {
	 System.out.println("No." + "\t" + "Cyclist ID" + "\t" + "Cyclist Name" +
	 "\t" + "Cyclist Age" + "\t"
	 + "Cyclist State" + "\t");
	
	 }
	 }
	
	 for (int i = 1; i < Participant.size(); i++) {
	 String id = Participant.get(i).getID();
	 String name = Participant.get(i).getName();
	 int age = Participant.get(i).getAge();
	 String state = Participant.get(i).getState();
	 String checkType = Participant.get(i).getType();
	
	 if (raceType == 1 && checkType.equals("Swimmer")) {
	 System.out.println(i + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age
	 + "\t" + "\t" + state);
	 } else if (raceType == 2 && checkType.equals("Runner")) {
	 System.out.println(i + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age
	 + "\t" + "\t" + state);
	 } else if (raceType == 3 && checkType.equals("Cyclist")) {
	 System.out.println(i + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age
	 + "\t" + "\t" + state);
	 }
	 }
	 }*/

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
