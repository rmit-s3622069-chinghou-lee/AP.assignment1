package assignment1;

import java.util.ArrayList;

public class Cyclist extends Participants {
	public String cyclistID;
	public String cyclistName;
	public int cyclistAge;
	public String cyclistState;
	public String cyclistType;
	
	public Cyclist(String id, String name, int age, String state,String type) {
		super(id, name, age, state, type);
		this.cyclistID = id;
		this.cyclistName =name;
		this.cyclistAge = age;
		this.cyclistState =state;
		this.cyclistType = type;
	}
	
	public static void addCyclist() {
		ArrayList<Cyclist> participant = new ArrayList<Cyclist>();
		participant.add(new Cyclist("CY01", "Gavin", 45, "VIC", "Cyclist" ));
		participant.add(new Cyclist("CY02", "fred", 41, "NSW", "Cyclist"));
		participant.add(new Cyclist("CY03", "Peter", 52, "NSW", "Cyclist"));
		participant.add(new Cyclist("CY04", "Messi", 39, "VIC", "Cyclist"));
	}

}
