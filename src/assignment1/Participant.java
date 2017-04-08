package assignment1;

/*
 * Ozlympic Game ver 1.0 - Participant class
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

// Abstract class of Participant
public abstract class Participant {

	private String participantID; // represent participant's ID
	private String participantName; // represent participant's name
	private int participantAge; // represent participant's age
	private String participantState; // represent participant's state
	private String participantType; // represent participant's type
	private double competeTime; // represent participant's time

	// Participant constructor 
	public Participant(String participantID, String participantName, int participantAge, String participantState,
			String participantType) {
		this.participantID = participantID;
		this.participantName = participantName;
		this.participantAge = participantAge;
		this.participantState = participantState;
		this.participantType = participantType;
	} // end Participant constructor

	public String getParticipantID() {
		return participantID; // get participant's ID
	} // end method getID

	public String getParticipantName() {
		return participantName; // get participant's name
	} // end method getName

	public int getParticipantAge() {
		return participantAge; // get participant's age
	} // end method getAge

	public String getParticipantState() {
		return participantState; // get participant's state
	} // end method getState

	public String getParticipantType() {
		return participantType; // get participant's type
	} // end method getType

	// to print ArrayList of Participants' information
	public String toString() {
		return participantID + "\t" + "\t" + participantName + "\t" + "\t" + participantAge + "\t" + "\t"
				+ participantState;
	} // end method toString

} // end class Participant
