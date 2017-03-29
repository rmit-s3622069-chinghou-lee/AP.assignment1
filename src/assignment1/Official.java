package assignment1;

import java.util.ArrayList;

public class Official extends Participants {
	public String officialID;
	public String officialName;
	public int officialAge;
	public String officialState;
	public String officialType;

	public Official(String id, String name, int age, String state, String type) {
		super(id, name, age, state, type);
		this.officialID = id;
		this.officialName = name;
		this.officialAge = age;
		this.officialState = state;
		this.officialType = type;
	}

	public static void addOfficial() {
		ArrayList<Official> participant = new ArrayList<Official>();
		participant.add(new Official("OF01", "Gavin", 45, "VIC", "Referee"));
		participant.add(new Official("OF02", "fred", 41, "NSW", "Referee"));
		participant.add(new Official("OF03", "Peter", 52, "NSW", "Referee"));
		participant.add(new Official("OF04", "Messi", 39, "VIC", "Referee"));
	}
}
