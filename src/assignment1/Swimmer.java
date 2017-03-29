package assignment1;

import java.util.ArrayList;

public class Swimmer extends Participants {

	public String swimmerID;
	public String swimmerName;
	public int swimmerAge;
	public String swimmerState;
	public String swimmerType;
	
	public Swimmer(String id, String name, int age, String state,String type) {
		super(id, name, age, state, type);
		this.swimmerID = id;
		this.swimmerName =name;
		this.swimmerAge = age;
		this.swimmerState =state;
		this.swimmerType = type;
	}
	
	public static void addSwimmer() {
		ArrayList<Swimmer> participant = new ArrayList<Swimmer>();
		participant.add(new Swimmer("CY01", "Gavin", 45, "VIC", "Swimmer" ));
		participant.add(new Swimmer("CY02", "fred", 41, "NSW", "Swimmer"));
		participant.add(new Swimmer("CY03", "Peter", 52, "NSW", "Swimmer"));
		participant.add(new Swimmer("CY04", "Messi", 39, "VIC", "Swimmer"));
	}
}
