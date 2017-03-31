package assignment1;

public abstract class Participant {

	private String userID; // represent participant's ID
	private String userName; // represent participant's name
	private int userAge; // represent participant's age
	private String userState; // represent participant's state
	private String userType; // represent participant's type
	private double competeTime; // represent participant's time
	private ParticipantsDatabase pd;

	// Participant constructor invoked by subclasses using super()
	public Participant(String id, String name, int age, String state, String type) { 
		this.userID = id;
		this.userName = name;
		this.userAge = age;
		this.userState = state;
		this.userType = type;
	} // end Participant constructor
	
	public String getID() {
		return userID; // get participant's ID
	} // end method getID
 
	public String getName() {
		return userName; // get participant's name
	} // end method getName

	public int getAge() {
		return userAge; // get participant's age
	} // end method getAge

	public String getState() {
		return userState; // get participant's state
	} // end method getState

	public String getType() {
		return userType; // get participant's type
	} // end method getType
	
	public ParticipantsDatabase getParticipantsDatabase(){ // return reference to Participants' Database
		return pd;
	} // end method getParticipantsDatabase
	
} // end class Participant
