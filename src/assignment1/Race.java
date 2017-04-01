package assignment1;

import java.util.ArrayList;

public class Race extends Game {

	private int minTime;
	private int maxTime;
	private int competeTime;
	private int minAthlete = 4;
	private int maxAthlete = 8;
	
	public Race(int raceID, int minAthlete, int maxAthlete, int competeTime) {
		super(raceID);
		this.minAthlete = minAthlete;
		this.maxAthlete = maxAthlete;
		this.competeTime = competeTime;
	}

	private ParticipantsDatabase pd = new ParticipantsDatabase();

	public ArrayList<Participant> getList() {
		return pd.getParticipant();
	}

	public void printAthletes(int option) {
		for (int i = 0; i < pd.getParticipant().size(); i++) {
			String checkType = pd.getParticipant().get(i).getType();
			String id = pd.getParticipant().get(i).getID();
			String name = pd.getParticipant().get(i).getName();
			int age = pd.getParticipant().get(i).getAge();
			String state = pd.getParticipant().get(i).getState();
			String type = pd.getParticipant().get(i).getType();

			if (option == 1 && checkType.equals("Swimmer")) {
				System.out.println(id + name + age + state + type);
			} else if (option == 2 && checkType.equals("Runner")) {
				System.out.println(id + name + age + state + type);
			} else if (option == 3 && checkType.equals("Cyclist")) {
				System.out.println(id + name + age + state + type);
			}
		}
	}



	public int raceSwim(String raceType) {
		// generate
		return 0;
	}

	public int raceCycle(String raceType) {
		return 0;
	}

	public int raceRun(String raceType) {
		return 0;
	}

	public int raceTime() {
		// Swimmer swimmer = new Swimmer();
		// double timeSwim = Swimmer.compete();
		return 0;

	}
	
	/*	public void printAllParticipant() { // Test to print all athletes
	for (int i = 0; i < pd.getParticipant().size(); i++) {
		String id = pd.getParticipant().get(i).getID();
		String name = pd.getParticipant().get(i).getName();
		int age = pd.getParticipant().get(i).getAge();
		String state = pd.getParticipant().get(i).getState();
		String athleteType = pd.getParticipant().get(i).getType();
		System.out.println("ID = " + id + " name = " + name + " age = " + age + " state = " + state
				+ " athlete type = " + athleteType);
	}
}*/
}
