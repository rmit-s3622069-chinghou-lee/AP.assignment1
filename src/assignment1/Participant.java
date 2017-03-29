package assignment1;

public abstract class Participant {

	public String userID; // represent participant's ID
	public String userName; // represent participant's name
	public int userAge; // represent participant's age
	public String userState; // represent participant's state
	public String userType; // represent participant's type
	public double minTime = 0;
	public double maxTime = 0;

	public Participant(String id, String name, int age, String state, String type) { // Participant's
																						// constructor
		this.userID = id;
		this.userName = name;
		this.userAge = age;
		this.userState = state;
		this.userType = type;
	}

	public String getID() {
		return userID; // get participant's ID
	}

	public String getName() {
		return userName; // get participant's name
	}

	public int getAge() {
		return userAge; // get participant's age
	}

	public String getState() {
		return userState; // get participant's state
	}

	public String getType() {
		return userType; // get participant's type
	}
	
	public double compete(){
		double randomNum = Math.random()*(maxTime - minTime +1) + minTime;
		return randomNum;
	}

}
