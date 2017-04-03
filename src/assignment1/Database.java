package assignment1;

import java.util.ArrayList;

public class Database {

	private ArrayList<Participant> participant() {
		ArrayList<Participant> participant = new ArrayList<Participant>();
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

	public ArrayList<Participant> getParticipant() {
		return participant();
	}

	public String getAthleteID(int raceType) {
		for (int i = 0; i < 1; i++) {
			String checkType = getParticipant().get(i).getType();
			String ID = getParticipant().get(i).getID();
			if (raceType == 1 && checkType.equals("Swimmer")) {
				return ID;
			} else if (raceType == 2 && checkType.equals("Runner")) {
				return ID;
			} else if (raceType == 3 && checkType.equals("Cyclist")) {
				return ID;
			} else {
				System.out.println("There is no race selected!");
			}
		}
		return null;
	}

	public void printGameSelect(int raceType) {
		for (int i = 0; i < 1; i++) {
			String checkType = getParticipant().get(i).getType();
			if (raceType == 1 && checkType.equals("Swimmer")) {
				System.out.println("No." + "\t" + "Swimmer ID" + "\t" + "Swimmer Name" + "\t" + "Swimmer Age" + "\t"
						+ "Swimmer State" + "\t");

			} else if (raceType == 2 && checkType.equals("Runner")) {
				System.out.println("No." + "\t" + "Runner ID" + "\t" + "Runner Name" + "\t" + "Runner Age" + "\t"
						+ "Runner State" + "\t");

			} else if (raceType == 3 && checkType.equals("Cyclist")) {
				System.out.println("No." + "\t" + "Cyclist ID" + "\t" + "Cyclist Name" + "\t" + "Cyclist Age" + "\t"
						+ "Cyclist State" + "\t");

			} else {
				System.out.println("Invalid Menu!");
			}
		}

		for (int i = 0; i < getParticipant().size(); i++) {
			String checkType = getParticipant().get(i).getType();
			String id = getParticipant().get(i).getID();
			String name = getParticipant().get(i).getName();
			int age = getParticipant().get(i).getAge();
			String state = getParticipant().get(i).getState();

			if (raceType == 1 && checkType.equals("Swimmer")) {
				System.out.println(i + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state + checkType);
			} else if (raceType == 2 && checkType.equals("Runner")) {
				System.out.println(i + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state + checkType);
			} else if (raceType == 3 && checkType.equals("Cyclist")) {
				System.out.println(i + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state + checkType);
			} else {
				 // System.out.println("Empty Athletes!"); // to validate the athlete print list
			break;
			}
		}
	}
}

/*	public String getAthletes(int raceType) {
		for (int i = 0; i < getParticipant().size(); i++) {
			String checkType = getParticipant().get(i).getType();
			String id = getParticipant().get(i).getID();
			String name = getParticipant().get(i).getName();
			int age = getParticipant().get(i).getAge();
			String state = getParticipant().get(i).getState();

			if (raceType == 1 && checkType.equals("Swimmer")) {
				return i + id + name + age + state;
				break;
			} else if (raceType == 2 && checkType.equals("Runner")) {
				return i + id + name + age + state;
				break;
			} else if (raceType == 3 && checkType.equals("Cyclist")) {
				return i + id + name + age + state;
				break;
			} else {
				System.out.println("Invalid Athletes!");
			}
		}
		return i + id + name + age + state;
	}
}*/
