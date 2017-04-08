package assignment1;

/*
 * Ozlympic Game ver 1.0 - Database class
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

// Database Class contains all Ozlympic game data
public class Database {

	// to generate all swimmer
	private ArrayList<Swimmer> Swimmer() {
		ArrayList<Swimmer> swimmer = new ArrayList<Swimmer>();
		swimmer.add(new Swimmer("SW01", "Michael", 30, "TAS", "Swimmer"));
		swimmer.add(new Swimmer("SW02", "Ryan", 32, "NSW", "Swimmer"));
		swimmer.add(new Swimmer("SW03", "Ian", 27, "NT", "Swimmer"));
		swimmer.add(new Swimmer("SW04", "Katie", 25, "VIC", "Swimmer"));
		return swimmer; // return all swimmer
	} // end method Swimmer

	public ArrayList<Swimmer> getSwimmer() {
		return Swimmer(); // get Swimmer() 
	} // end method getSwimmer

	// to generate all sprinter
	private ArrayList<Sprinter> Sprinter() {
		ArrayList<Sprinter> sprinter = new ArrayList<Sprinter>();
		sprinter.add(new Sprinter("RU01", "Haile", 35, "NT", "Sprinter"));
		sprinter.add(new Sprinter("RU02", "Paula", 30, "NSW", "Sprinter"));
		sprinter.add(new Sprinter("RU03", "Joan", 32, "Queensland", "Sprinter"));
		sprinter.add(new Sprinter("RU04", "Meb", 27, "VIC", "Sprinter"));
		return sprinter; // return all sprinter
	} // end method Sprinter

	public ArrayList<Sprinter> getSprinter() {
		return Sprinter(); // get Sprinter() 
	} // end method getSprinter

	// to generate all cyclist
	private ArrayList<Cyclist> Cyclist() {
		ArrayList<Cyclist> cyclist = new ArrayList<Cyclist>();
		cyclist.add(new Cyclist("CY01", "Eddy", 24, "VIC", "Cyclist"));
		cyclist.add(new Cyclist("CY02", "Mario", 26, "NT", "Cyclist"));
		cyclist.add(new Cyclist("CY03", "Jan", 27, "SA", "Cyclist"));
		cyclist.add(new Cyclist("CY04", "Fausto", 25, "VIC", "Cyclist"));
		return cyclist; // return all cyclist
	} // end method Cyclist

	public ArrayList<Cyclist> getCyclist() {
		return Cyclist(); // get Cyclist() 
	} // end method getCyclist

	// to generate all super athlete
	private ArrayList<SuperAthlete> SuperAthlete() {
		ArrayList<SuperAthlete> superAthlete = new ArrayList<SuperAthlete>();
		superAthlete.add(new SuperAthlete("SA01", "Jay", 30, "SA", "SuperAthlete"));
		superAthlete.add(new SuperAthlete("SA02", "Cookie", 27, "TAS", "SuperAthlete"));
		superAthlete.add(new SuperAthlete("SA03", "Shelden", 28, "NSW", "SuperAthlete"));
		superAthlete.add(new SuperAthlete("SA04", "Candace", 26, "VIC", "SuperAthlete"));
		return superAthlete; /// return all super athlete
	} // end method SuperAthlete

	public ArrayList<SuperAthlete> getSuperAthlete() {
		return SuperAthlete(); // get SuperAthlete() 
	} // end method getSuperAthlete

	// to generate all official
	private ArrayList<Official> Official() {
		ArrayList<Official> official = new ArrayList<Official>();
		official.add(new Official("OF01", "Ed", 47, "VIC", "Referee"));
		official.add(new Official("OF02", "Walt", 45, "TAS", "Referee"));
		official.add(new Official("OF03", "Jeff", 40, "NSW", "Referee"));
		official.add(new Official("OF04", "Gene", 35, "NT", "Referee"));
		Collections.shuffle(official);
		return official; // return all official 
	} // end method getOfficial

	public ArrayList<Official> getOfficial() {
		return Official(); // get Official() 
	} // end method getOfficial
	
	// to generate all athlete
	private ArrayList<Participant> Athletes() {
		ArrayList<Participant> participant = new ArrayList<Participant>();
		participant.addAll(getSwimmer()); // add all Swimmer
		participant.addAll(getSprinter()); // add all Sprinter
		participant.addAll(getCyclist()); // add all Cyclist
		participant.addAll(getSuperAthlete()); // add all Super Athlete
		Collections.shuffle(participant); // shuffle all athlete
		return participant; // return ArrayList<Participant> All Athletes 
	} // end method Athletes

	// to get all athletes
	public ArrayList<Participant> getAllAthletes() {
		return Athletes(); // return ArrayList<Participant> All Athletes 
	} // end method getAllAthletes

	// to sort relevant athletes based on the race type
	public ArrayList<Participant> ParticipantsByType(int raceType) {
		ArrayList<Participant> ParticipantList = new ArrayList<Participant>();
		if (raceType == 1) { // 1 = swimming race
			ParticipantList.addAll(getSwimmer());
			ParticipantList.addAll(getSuperAthlete());
		} else if (raceType == 2) { // 2 = sprinter race
			ParticipantList.addAll(getSprinter());
			ParticipantList.addAll(getSuperAthlete());
		} else if (raceType == 3) { // 3 = cycling race
			ParticipantList.addAll(getCyclist());
			ParticipantList.addAll(getSuperAthlete());
		}
		ParticipantList.trimToSize(); //reduce ArrayList size to avoid extra printing
		Collections.shuffle(ParticipantList); // shuffle participant
		return ParticipantList; // return ArrayList<Participant> Participants based by athlete type
	} // end method ParticipantsByType
	
	
} // end Database method
