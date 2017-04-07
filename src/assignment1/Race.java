package assignment1;

/*
 * Ozlympic Game ver 1.0 - Race class
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

public class Race extends Game {

	private String raceID;
	private Participant participant;
	private Official official;
	private int completeTime;
	private int athleteScore;

	public Race(String raceID, Participant participant, Official official, int completeTime, int athleteScore) {
		this.raceID = raceID;
		this.participant = participant;
		this.official = official;
		this.completeTime = completeTime;
		this.athleteScore = athleteScore;
	}

	public void setRaceID(String raceID) {
		this.raceID = raceID;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Official getOfficial() {
		return official;
	}

	public void setOfficial(Official official) {
		this.official = official;
	}

	public double setCompleteTime(double completeTime) {
		return completeTime;
	}

	public int getCompleteTime() {
		return completeTime;
	}

	public int getAthleteScore() {
		return athleteScore;
	}

	public void setAthleteScore(int athleteScore) {
		this.athleteScore = athleteScore;
	}

	/*
	 * Method to able to display print based on athlete's ID, athlete's name,
	 * athlete's age, athlete's state and athlete's complete time
	 */
	public String toRaceResult() { // print Race Result
		return participant.getParticipantID() + "\t" + "\t" + participant.getParticipantName() + "\t" + "\t"
				+ participant.getParticipantAge() + "\t" + "\t" + participant.getParticipantState() + "\t" + "\t"
				+ getCompleteTime();

	}

	/*
	 * Method to able to display print based on athlete's ID, athlete's name and
	 * athlete's respective score
	 */
	public String toString() { // print athlete's ID, athlete's name and
								// athlete's respective score
		return participant.getParticipantID() + "\t" + "\t" + participant.getParticipantName() + "\t" + "\t"
				+ getAthleteScore();
	} // end method toString

} // end class Race
