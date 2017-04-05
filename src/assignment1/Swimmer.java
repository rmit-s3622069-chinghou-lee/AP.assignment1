package assignment1;

public class Swimmer extends Athlete {
	
	private String swimmerID; 
	private String swimmeName; 
	private int swimmerAge; 
	private String swimmerState;
	private String swimmerType;

	public double minTime = 100;
	public double maxTime = 200;
	
	public Swimmer(String swimmerID, String swimmeName, int swimmerAge, String swimmerState,String swimmerType) {
		super(swimmerID, swimmeName, swimmerAge, swimmerState, swimmerType);
		this.swimmerID = swimmerID;
		this.swimmeName =swimmeName;
		this.swimmerAge = swimmerAge;
		this.swimmerState = swimmerState;
		this.swimmerType = swimmerType;
	}
	
	public String toString(){
		return swimmerID + "\t" + "\t" + swimmeName + "\t" + "\t" + swimmerAge + "\t" + "\t" + swimmerState;
	}
	
	public double compete(){
		double randomNum = Math.random()*(maxTime - minTime +1) + minTime;
		return randomNum;
	}
}
