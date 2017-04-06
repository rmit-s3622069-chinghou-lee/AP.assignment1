package assignment1;

public class SuperAthlete extends Participant{
	private String superAthleteID;
	private String superAthleteName;
	private int superAthleteAge;
	private String superAthleteState;
	private String superAthleteType;
	
	public SuperAthlete(String superAthleteID, String superAthleteName, int superAthleteAge, String superAthleteState,String superAthleteType) {
		super(superAthleteID, superAthleteName, superAthleteAge, superAthleteState, superAthleteType);
		this.superAthleteID =superAthleteID;
		this.superAthleteName = superAthleteName;
		this.superAthleteAge = superAthleteAge;
		this.superAthleteState = superAthleteState;
		this.superAthleteType = superAthleteType;
	}
	
	public String toString(){
		return superAthleteID + "\t" + "\t" + superAthleteName + "\t" + "\t" + superAthleteAge + "\t" + "\t" + superAthleteState;
	}

	public double compete() {
		// TODO Auto-generated method stub
		return 0;
	}
}
