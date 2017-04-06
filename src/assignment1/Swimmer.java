package assignment1;

public class Swimmer extends Athlete {

	private String swimmerID;
	private String swimmeName;
	private int swimmerAge;
	private String swimmerState;
	private String athleteType;

	public Swimmer(String swimmerID, String swimmeName, int swimmerAge, String swimmerState, String athleteType) {
		super(swimmerID, swimmeName, swimmerAge, swimmerState, athleteType);
		this.swimmerID = swimmerID;
		this.swimmeName = swimmeName;
		this.swimmerAge = swimmerAge;
		this.swimmerState = swimmerState;
		this.athleteType = athleteType;
	}

	public String toString() {
		return swimmerID + "\t" + "\t" + swimmeName + "\t" + "\t" + swimmerAge + "\t" + "\t" + swimmerState;
	}

	public int compete() {
		int minTime = 100;
		int maxTime = 200;
		int randomNum = (int) (Math.random() * (maxTime - minTime + 1)) + minTime;
		return randomNum;
	}
}
