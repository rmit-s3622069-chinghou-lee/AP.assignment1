package assignment1;

public class Sprinter extends Athlete {
	private String sprinterID;
	private String sprinterName;
	private int sprinterAge;
	private String sprinterState;
	private String athleteType;


	public Sprinter(String sprinterID, String sprinterName, int sprinterAge, String sprinterState,
			String athleteType) {
		super(sprinterID, sprinterName, sprinterAge, sprinterState, athleteType);
		this.sprinterID = sprinterID;
		this.sprinterName = sprinterName;
		this.sprinterAge = sprinterAge;
		this.sprinterState = sprinterState;
		this.athleteType = athleteType;
	}

	public String toString() {
		return sprinterID + "\t" + "\t" + sprinterName + "\t" + "\t" + sprinterAge + "\t" + "\t" + sprinterState;
	}

	@Override
	public int compete() {
		int minTime = 10;
		int maxTime = 20;
		int randomNum = (int) (Math.random()*(maxTime - minTime +1)) + minTime;
		return randomNum;
	}
}
