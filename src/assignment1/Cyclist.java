package assignment1;

/*
 * Ozlympic Game ver 1.0 - Cyclist class
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

// Cyclist class refer to Super class Athlete
public class Cyclist extends Athlete {
	private String cyclistID;
	private String cyclistName;
	private int cyclistAge;
	private String cyclistState;
	private String athleteType;

	// constructor for Cyclist class referencing to Athlete Class
	public Cyclist(String cyclistID, String cyclistName, int cyclistAge, String cyclistState, String athleteType) {
		super(cyclistID, cyclistName, cyclistAge, cyclistState, athleteType);
		this.cyclistID = cyclistID;
		this.cyclistName = cyclistName;
		this.cyclistAge = cyclistAge;
		this.cyclistState = cyclistState;
		this.athleteType = athleteType;
	} // end of Cyclist constructor

	// to print ArrayList of Cyclists' information
	public String toString() {
		return cyclistID + "\t" + "\t" + cyclistName + "\t" + "\t" + cyclistAge + "\t" + "\t" + cyclistState;
	} // end method toString

	@Override // Override Athlete's compete abstract method
	// to generate each Cyclist race time
	public int compete() {
		int minTime = 500; // Cyclist minimum time to cycling race
		int maxTime = 800; // Cyclist maximum time to cycling race
		int randomNum = (int) (Math.random() * (maxTime - minTime + 1)) + minTime;
		return randomNum; // return cyclist race time
	} // end method compete

} // end class Cyclist
