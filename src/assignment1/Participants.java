package assignment1;

public abstract class Participants {
	
	public String userID; // represent participant's ID
	public String userName; // represent participant's name
	public int userAge; // represent participant's age
	public String userState; // represent participant's state
	public String userType; // represent participant's type
	
	// Participant's constructor
	public Participants(String id, String name, int age, String state, String type) {
		this.userID = id;
		this.userName = name;
		this.userAge = age;
		this.userState = state;
		this.userType = type;
	}
	
	// get participant's ID
	public String getID() {
		return userID;
	}

	//get participant's name
	public String getName() {
		return userName;
	}
	
	//get participant's age
	public int getAge() {
		return userAge;
	}

	// get participant's state
	public String getState() {
		return userState;
	}
	
	// get participant's type
	public String getType(){
		return userType;
	}
	

}
