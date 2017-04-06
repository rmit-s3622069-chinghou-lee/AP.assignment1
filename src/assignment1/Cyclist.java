package assignment1;

public class Cyclist extends Athlete {
	private String cyclistID;
	private String cyclistName;
	private int cyclistAge;
	private String cyclistState;
	private String athleteType;

	public Cyclist(String cyclistID, String cyclistName, int cyclistAge, String cyclistState, String athleteType) {
		super(cyclistID, cyclistName, cyclistAge, cyclistState, athleteType);
		this.cyclistID = cyclistID;
		this.cyclistName = cyclistName;
		this.cyclistAge = cyclistAge;
		this.cyclistState = cyclistState;
		this.athleteType = athleteType;
	}

	public String toString() {
		return cyclistID + "\t" + "\t" + cyclistName + "\t" + "\t" + cyclistAge + "\t" + "\t" + cyclistState;
	}

	public double compete() {
		double minTime = 500;
		double maxTime = 800;
		double randomNum = Math.random() * (maxTime - minTime + 1) + minTime;
		return randomNum;
	}

}
