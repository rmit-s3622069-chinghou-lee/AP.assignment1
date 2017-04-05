package assignment1;

import java.util.ArrayList;

public class Cyclist extends Athlete {
	private String cyclistID;
	private String cyclistName;
	private int cyclistAge;
	private String cyclistState;
	private String sportType;

	public double minTime = 500;
	public double maxTime = 800;

	public Cyclist(String athleteID, String athleteName, int athleteAge, String athleteState, String athleteType) {
		super(athleteID, athleteName, athleteAge, athleteState, athleteType);
		this.cyclistID = athleteID;
		this.cyclistName = athleteName;
		this.cyclistAge = athleteAge;
		this.cyclistState = athleteState;
		this.sportType = sportType;
	}

	public String toString(){
		return cyclistID + "\t" + "\t" + cyclistName + "\t" + "\t" + cyclistAge + "\t" + "\t" + cyclistState;
	}

	public double compete(int raceType) {
		double randomNum = Math.random() * (maxTime - minTime + 1) + minTime;
		return randomNum;
	}

}
