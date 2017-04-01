package assignment1;

import java.util.ArrayList;

public class ParticipantsDatabase{
	
	private ArrayList<Participant> participant;

	private ArrayList<Participant> participant(){
		participant = new ArrayList<Participant>();
		participant.add(new Swimmer("SW01", "Michael", 30, "TAS", "Swimmer"));
		participant.add(new Swimmer("SW02", "Ryan", 32, "NSW", "Swimmer"));
		participant.add(new Swimmer("SW03", "Ian", 27, "NT", "Swimmer"));
		participant.add(new Swimmer("SW04", "Katie", 25, "VIC", "Swimmer"));
		participant.add(new Cyclist("CY01", "Eddy", 24, "VIC", "Cyclist"));
		participant.add(new Cyclist("CY02", "Mario", 26, "NT", "Cyclist"));
		participant.add(new Cyclist("CY03", "Jan", 27, "SA", "Cyclist"));
		participant.add(new Cyclist("CY04", "Fausto", 25, "VIC", "Cyclist"));
		participant.add(new Runner("RU01", "Haile", 35, "NT", "Runner"));
		participant.add(new Runner("RU02", "Paula", 30, "NSW", "Runner"));
		participant.add(new Runner("RU03", "Joan", 32, "Queensland", "Runner"));
		participant.add(new Runner("RU04", "Meb", 27, "VIC", "Runner"));
		participant.add(new superAthlete("SA01", "Jay", 30, "SA", "Super Athlete"));
		participant.add(new superAthlete("SA02", "Charissa", 27, "TAS", "Super Athlete"));
		participant.add(new superAthlete("SA03", "Shelden", 28, "NSW", "Super Athlete"));
		participant.add(new superAthlete("SA04", "Candace", 26, "VIC", "Super Athlete"));
		participant.add(new Official("OF01", "Ed", 47, "VIC", "Referee"));
		participant.add(new Official("OF02", "Walt", 45, "TAS", "Referee"));
		participant.add(new Official("OF03", "Jeff", 40, "NSW", "Referee"));
		participant.add(new Official("OF04", "Gene", 35, "NT", "Referee"));
		return participant;
	}
	
	public ArrayList<Participant> getParticipant(){
		return this.participant();
	}
	

}
	

	/*public void printAllParticipant() {
		addParticipant();
		for (int i = 0; i < participant.size(); i++) {
			String id = participant.get(i).getID();
			String name = participant.get(i).getName();
			int age = participant.get(i).getAge();
			String state = participant.get(i).getState();
			String athleteType = participant.get(i).getType();
			System.out.println("ID = " + id + " name = " + name + " age = " + age + " state = " + state
					+ " athlete type = " + athleteType);*/

	/*
	 * public Participant getParticipantType(String userType) {
	 * 
	 * for (Participant participant : participant) { if (participant.getType()
	 * == userType) participant.forEach(System.out::println) return participant;
	 * } return null; }
	 */


