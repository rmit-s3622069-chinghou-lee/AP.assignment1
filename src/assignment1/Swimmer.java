package assignment1;

/*
 * Ozlympic Game ver 1.0 - Swimmer class
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

//Swimmer class refer to Super class Athlete
public class Swimmer extends Athlete {
	private String swimmerID;
	private String swimmeName;
	private int swimmerAge;
	private String swimmerState;
	private String athleteType;

	// constructor for Swimmer class referencing to Athlete Class
	public Swimmer(String swimmerID, String swimmeName, int swimmerAge, String swimmerState, String athleteType) {
		super(swimmerID, swimmeName, swimmerAge, swimmerState, athleteType);
		this.swimmerID = swimmerID;
		this.swimmeName = swimmeName;
		this.swimmerAge = swimmerAge;
		this.swimmerState = swimmerState;
		this.athleteType = athleteType;
	} // end of Swimmer constructor

	// to print ArrayList of Swimmer' information
	public String toString() {
		return swimmerID + "\t" + "\t" + swimmeName + "\t" + "\t" + swimmerAge + "\t" + "\t" + swimmerState;
	} // end method toString

	@Override // Override Athlete's compete abstract method
	// to generate each Swimmer race time
	public int compete() {
		int minTime = 100; // Swimmer minimum time to cycling race
		int maxTime = 200; // Swimmer maximum time to cycling race
		int randomNum = (int) (Math.random() * (maxTime - minTime + 1)) + minTime;
		return randomNum; // return Swimmer race time
	} // end method compete

} // end class Swimmer