package assignment1;

/*
 * Ozlympic Game ver 1.0 - Sprinter class
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

//Sprinter class refer to Super class Athlete
public class Sprinter extends Athlete {
	private String sprinterID;
	private String sprinterName;
	private int sprinterAge;
	private String sprinterState;
	private String athleteType;

	// constructor for Sprinter class referencing to Athlete Class
	public Sprinter(String sprinterID, String sprinterName, int sprinterAge, String sprinterState, String athleteType) {
		super(sprinterID, sprinterName, sprinterAge, sprinterState, athleteType);
		this.sprinterID = sprinterID;
		this.sprinterName = sprinterName;
		this.sprinterAge = sprinterAge;
		this.sprinterState = sprinterState;
		this.athleteType = athleteType;
	} // end of Sprinter constructor

	// to print ArrayList of Sprinters' information
	public String toString() {
		return sprinterID + "\t" + "\t" + sprinterName + "\t" + "\t" + sprinterAge + "\t" + "\t" + sprinterState;
	} // end method toString

	@Override // Override Athlete's compete abstract method
	// to generate each Sprinter race time
	public int compete() {
		int minTime = 10; // Sprinter minimum time to cycling race
		int maxTime = 20; // Sprinter maximum time to cycling race
		int randomNum = (int) (Math.random() * (maxTime - minTime + 1)) + minTime;
		return randomNum; // return Sprinter race time
	} // end method compete
} // end class Sprinter
