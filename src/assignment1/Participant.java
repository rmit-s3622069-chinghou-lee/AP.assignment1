package assignment1;

public abstract class Participant {
	
	private String athleteID; // represent athlete's ID
	private String athleteName; // represent athlete's name
	private int athleteAge; // represent athlete's age
	private String athleteState; // represent athlete's state
	private String athleteType; // represent athlete's type
	
	// Athlete's constructor
	public Participant(String id, String name, int age, String state, String type) {
		this.athleteID = id;
		this.athleteName = name;
		this.athleteAge = age;
		this.athleteState = state;
		this.athleteType = type;
	}
	
	// get athlete's ID
	public String getID() {
		return athleteID;
	}

	//get athlete's name
	public String getName() {
		return athleteName;
	}
	
	//get athlete's age
	public int getAge() {
		return athleteAge;
	}

	// get athlete's state
	public String getState() {
		return athleteState;
	}
	
	// get athlete's type
	public String getType(){
		return athleteType;
	}
	

}
