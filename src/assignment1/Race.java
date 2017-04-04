package assignment1;

public class Race extends Game {

	private int athleteSelect;
	private Participant participant;
	private Official official;
	private int completeTime;
	private int athleteScore;

	private Database Database = new Database();

	public Race(int athleteSelect, Participant participant, Official official, int completeTime, int athleteScore) {
		this.athleteSelect = athleteSelect;
		this.participant = participant;
		this.official = official;
		this.completeTime = completeTime;
		this.athleteScore = athleteScore;
	}

	public Participant getParticipant() {
		return participant;
	}

	public Official getOfficial() {
		return official;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public void setOfficial(Official official) {
		this.official = official;
	}

	public int getCompleteTime() {
		return completeTime;
	}

	public int getAthleteScore() {
		return athleteScore;
	}

	public int compete(int raceType) {
		// raceType determine athlete and generate random time
		// for loop and return random time
		return athleteSelect;

	}

}
