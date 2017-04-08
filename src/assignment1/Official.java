package assignment1;

/*
 * Ozlympic Game ver 1.0 - Official class
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

//Official class refer to Super class Participant
public class Official extends Participant {
	private String officialID;
	private String officialName;
	private int officialAge;
	private String officialState;
	private String sportType;

	// constructor for Official class referencing to Participant Class
	public Official(String officialID, String officialName, int officialAge, String officialState, String sportType) {
		super(officialID, officialName, officialAge, officialState, sportType);
		this.officialID = officialID;
		this.officialName = officialName;
		this.officialAge = officialAge;
		this.officialState = officialState;
		this.sportType = sportType;
	} // end of Official constructor

	// to print ArrayList of Official' information
	public String toString() {
		return officialID + ", " + officialName;
	} // end method toString

	// Official count and set the score for winner
	public void setScore(ArrayList<Race> raceResult) {
		raceResult.get(0).setAthleteScore(5); // 1st winner get 5 points
		raceResult.get(1).setAthleteScore(2); // 2nd winner get 2 points
		raceResult.get(2).setAthleteScore(1); // 3rd winner get 1 points
	} // end method setScore

} // end class Official
