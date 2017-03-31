package assignment1;

import java.util.ArrayList;

public class superAthlete extends Participant{
	
	public superAthlete(String id, String name, int age, String state,String type) {
		super(id, name, age, state, type);
	}
	
	public static void addSuperAthlete() {
		ArrayList<superAthlete> participant = new ArrayList<superAthlete>();
		participant.add(new superAthlete("CY01", "Gavin", 45, "VIC", "Swimmer" ));
		participant.add(new superAthlete("CY02", "fred", 41, "NSW", "Swimmer"));
		participant.add(new superAthlete("CY03", "Peter", 52, "NSW", "Swimmer"));
		participant.add(new superAthlete("CY04", "Messi", 39, "VIC", "Swimmer"));
	}

	public double compete() {
		// TODO Auto-generated method stub
		return 0;
	}
}
