package assignment1;

/*
 * Ozlympic Game ver 1.0 - SuperAthlete class
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

//SuperAthlete class refer to Super class Athlete
public class SuperAthlete extends Athlete {
	private String superAthleteID;
	private String superAthleteName;
	private int superAthleteAge;
	private String superAthleteState;
	private String athleteType;

	// constructor for SuperAthlete class referencing to Athlete Class
	public SuperAthlete(String superAthleteID, String superAthleteName, int superAthleteAge, String superAthleteState,
			String athleteType) {
		super(superAthleteID, superAthleteName, superAthleteAge, superAthleteState, athleteType);
		this.superAthleteID = superAthleteID;
		this.superAthleteName = superAthleteName;
		this.superAthleteAge = superAthleteAge;
		this.superAthleteState = superAthleteState;
		this.athleteType = athleteType;
	}  // end of SuperAthlete constructor

	// to print ArrayList of SuperAthletes' information
	public String toString() {
		return superAthleteID + "\t" + "\t" + superAthleteName + "\t" + "\t" + superAthleteAge + "\t" + "\t"
				+ superAthleteState;
	} // end method toString

	@Override // Override Athlete's compete abstract method
	// to generate each SuperAthlete race time
	public int compete() {
		int minTime = 0; // No minimum time
		int maxTime = 0; // No maximum time
		int randomNum = (int) (Math.random() * (maxTime - minTime + 1)) + minTime;
		return randomNum; // return SuperAthlete race time
	} // end method compete
} // end class SuperAthlete
