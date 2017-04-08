package assignment1;

/*
 * Ozlympic Game ver 1.0 - Athlete class
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

// Abstract class of Athlete refer to Super class Participant
public abstract class Athlete extends Participant {

	// constructor for Athlete class referencing to Participant Class
	public Athlete(String athleteID, String athleteName, int athleteAge, String athleteState, String athleteType) {
		super(athleteID, athleteName, athleteAge, athleteState, athleteType);
	} // end Athlete constructor

	// abstract method to get different athlete's compete time
	public abstract int compete();

} // end method of Athlete
