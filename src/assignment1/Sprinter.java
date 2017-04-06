package assignment1;

public class Sprinter extends Athlete {
	private String sprinterID;
	private String sprinterName;
	private int sprinterAge;
	private String sprinterState;
	private String sprinterType;
	public double minTime = 10;
	public double maxTime = 20;

	public Sprinter(String sprinterID, String sprinterName, int sprinterAge, String sprinterState,
			String sprinterType) {
		super(sprinterID, sprinterName, sprinterAge, sprinterState, sprinterType);
		this.sprinterID = sprinterID;
		this.sprinterName = sprinterName;
		this.sprinterAge = sprinterAge;
		this.sprinterState = sprinterState;
		this.sprinterType = sprinterType;
	}

	public String toString() {
		return sprinterID + "\t" + "\t" + sprinterName + "\t" + "\t" + sprinterAge + "\t" + "\t" + sprinterState;
	}

	@Override
	public double compete() {
		double randomNum = Math.random() * (maxTime - minTime + 1) + minTime;
		return randomNum;
	}
}
