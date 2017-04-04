package assignment1;

import java.util.ArrayList;

public class Database {

	private ArrayList<Swimmer> Swimmer() {
		ArrayList<Swimmer> swimmer = new ArrayList<Swimmer>();
		swimmer.add(new Swimmer("SW01", "Michael", 30, "TAS", "Swimmer"));
		swimmer.add(new Swimmer("SW02", "Ryan", 32, "NSW", "Swimmer"));
		swimmer.add(new Swimmer("SW03", "Ian", 27, "NT", "Swimmer"));
		swimmer.add(new Swimmer("SW04", "Katie", 25, "VIC", "Swimmer"));
		return swimmer;
	}

	public ArrayList<Swimmer> getSwimmer() {
		return Swimmer();
	}

	private ArrayList<Runner> Runner() {
		ArrayList<Runner> runner = new ArrayList<Runner>();
		runner.add(new Runner("RU01", "Haile", 35, "NT", "Runner"));
		runner.add(new Runner("RU02", "Paula", 30, "NSW", "Runner"));
		runner.add(new Runner("RU03", "Joan", 32, "Queensland", "Runner"));
		runner.add(new Runner("RU04", "Meb", 27, "VIC", "Runner"));
		return runner;
	}

	public ArrayList<Runner> getRunner() {
		return Runner();
	}

	private ArrayList<Cyclist> Cyclist() {
		ArrayList<Cyclist> cyclist = new ArrayList<Cyclist>();
		cyclist.add(new Cyclist("CY01", "Eddy", 24, "VIC", "Cyclist"));
		cyclist.add(new Cyclist("CY02", "Mario", 26, "NT", "Cyclist"));
		cyclist.add(new Cyclist("CY03", "Jan", 27, "SA", "Cyclist"));
		cyclist.add(new Cyclist("CY04", "Fausto", 25, "VIC", "Cyclist"));
		return cyclist;
	}

	public ArrayList<Cyclist> getCyclist() {
		return Cyclist();
	}

	private ArrayList<SuperAthlete> SuperAthlete() {
		ArrayList<SuperAthlete> superAthlete = new ArrayList<SuperAthlete>();
		superAthlete.add(new SuperAthlete("SA01", "Jay", 30, "SA", "SuperAthlete"));
		superAthlete.add(new SuperAthlete("SA02", "Charissa", 27, "TAS", "SuperAthlete"));
		superAthlete.add(new SuperAthlete("SA03", "Shelden", 28, "NSW", "SuperAthlete"));
		superAthlete.add(new SuperAthlete("SA04", "Candace", 26, "VIC", "SuperAthlete"));
		return superAthlete;
	}

	public ArrayList<SuperAthlete> getSuperAthlete() {
		return SuperAthlete();
	}

	private ArrayList<Official> Official() {
		ArrayList<Official> official = new ArrayList<Official>();
		official.add(new Official("OF01", "Ed", 47, "VIC", "Referee"));
		official.add(new Official("OF02", "Walt", 45, "TAS", "Referee"));
		official.add(new Official("OF03", "Jeff", 40, "NSW", "Referee"));
		official.add(new Official("OF04", "Gene", 35, "NT", "Referee"));
		return official;
	}

	public ArrayList<Official> getOfficial() {
		return Official();
	}

	private ArrayList<Participant> participant() {
		ArrayList<Participant> participant = new ArrayList<Participant>();
		participant.addAll(getSwimmer());
		participant.addAll(getRunner());
		participant.addAll(getCyclist());
		participant.addAll(getSuperAthlete());
		// participant.addAll(getOfficial());
		return participant;
	}

	public ArrayList<Participant> getAllParticipants() {
		return participant();
	}

}