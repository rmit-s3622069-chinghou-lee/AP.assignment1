package assignment1;

import java.util.ArrayList;

public class Race extends Game {

	public Race(int raceID, int raceType, int minAthlete, int maxAthlete, int competeTime) {
		this.minAthlete = minAthlete;
		this.maxAthlete = maxAthlete;
		this.competeTime = competeTime;
	}

	private int minTime;
	private int maxTime;
	private int competeTime;
	private int minAthlete = 4;
	private int maxAthlete = 8;

	private ArrayList<Race> raceID = new ArrayList<Race>();
	private Driver driver = new Driver();

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
