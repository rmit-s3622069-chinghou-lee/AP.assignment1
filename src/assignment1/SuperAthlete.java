package assignment1;

public class SuperAthlete extends Athlete {
	private String superAthleteID;
	private String superAthleteName;
	private int superAthleteAge;
	private String superAthleteState;
	private String athleteType;

	public SuperAthlete(String superAthleteID, String superAthleteName, int superAthleteAge, String superAthleteState,
			String athleteType) {
		super(superAthleteID, superAthleteName, superAthleteAge, superAthleteState, athleteType);
		this.superAthleteID = superAthleteID;
		this.superAthleteName = superAthleteName;
		this.superAthleteAge = superAthleteAge;
		this.superAthleteState = superAthleteState;
		this.athleteType = athleteType;
	}

	public String toString() {
		return superAthleteID + "\t" + "\t" + superAthleteName + "\t" + "\t" + superAthleteAge + "\t" + "\t"
				+ superAthleteState;
	}

	@Override
	public int compete() {
		// TODO Auto-generated method stub
		return 0;
	}
}
