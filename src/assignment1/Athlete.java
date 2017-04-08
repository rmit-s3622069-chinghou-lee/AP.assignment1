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

abstract public class Athlete extends Participant {

	public Athlete(String id, String name, int age, String state, String type) {
		super(id, name, age, state, type);
	}

	abstract public int compete();

}
