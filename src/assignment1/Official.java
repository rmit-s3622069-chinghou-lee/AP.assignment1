package assignment1;

import java.util.ArrayList;

public class Official extends Participant {
	private String officialID;
	private String officialName;
	private int officialAge;
	private String officialState;
	private String sportType;

	public Official(String officialID, String officialName, int officialAge, String officialState, String sportType) {
		super(officialID, officialName, officialAge, officialState, sportType);
		this.officialID = officialID;
		this.officialName = officialName;
		this.officialAge = officialAge;
		this.officialState = officialState;
		this.sportType = sportType;
	}
	
	public String toString(){
		return officialID + ", " + officialName ;
	}

	public void setScore(ArrayList<Race> raceResult){
		raceResult.get(0).setAthleteScore(5);
		raceResult.get(1).setAthleteScore(2);
		raceResult.get(2).setAthleteScore(1);
	}

}
