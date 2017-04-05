package assignment1;

import java.util.ArrayList;

public class Official extends Participant {
	private String officialID;
	private String officialName;
	private int officialAge;
	private String officialState;
	private String sportType;
	private int score;
	private double completeTime;

	public Official(String officialID, String officialName, int officialAge, String officialState, String sportType) {
		super(officialID, officialName, officialAge, officialState, sportType);
		this.officialID = officialID;
		this.officialName = officialName;
		this.officialAge = officialAge;
		this.officialState = officialState;
		this.sportType = sportType;
	}
	
	public String toString(){
		return officialID + "\t" + officialName;
	}

	public void countScore(){
		// if participant with shortest time get 5 points
		// if participant with between longest - shortest time get 2 points
		// if participant with longest time get 1 points
	}

}
