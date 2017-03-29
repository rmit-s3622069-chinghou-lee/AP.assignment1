package assignment1;

import java.util.ArrayList;

public class superAthlete extends Participant{

	public String superID;
	public String superName;
	public int superAge;
	public String superState;
	public String superType;
	
	public superAthlete(String id, String name, int age, String state,String type) {
		super(id, name, age, state, type);
		this.superID = id;
		this.superName =name;
		this.superAge = age;
		this.superState =state;
		this.superType = type;
	}
	
	public static void addSuperAthlete() {
		ArrayList<superAthlete> participant = new ArrayList<superAthlete>();
		participant.add(new superAthlete("CY01", "Gavin", 45, "VIC", "Swimmer" ));
		participant.add(new superAthlete("CY02", "fred", 41, "NSW", "Swimmer"));
		participant.add(new superAthlete("CY03", "Peter", 52, "NSW", "Swimmer"));
		participant.add(new superAthlete("CY04", "Messi", 39, "VIC", "Swimmer"));
	}

	@Override
	public double compete() {
		// TODO Auto-generated method stub
		return 0;
	}
}
