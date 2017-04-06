package assignment1;

public class Race extends Game {

	private String gameRounds;
	private Participant participant;
	private Official official;
	private int completeTime;
	private int athleteScore;

	public Race(String gameRounds, Participant participant, Official official, int completeTime, int athleteScore) {
		this.gameRounds = gameRounds;
		this.participant = participant;
		this.official = official;
		this.completeTime = completeTime;
		this.athleteScore = athleteScore;
	}

	public String getGameRounds() {
		return gameRounds;
	}

	public void setGameRounds(String gameRounds) {
		this.gameRounds = gameRounds;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Official getOfficial() {
		return official;
	}

	public void setOfficial(Official official) {
		this.official = official;
	}

	public double setCompleteTime(double completeTime) {
		return completeTime;
	}

	public int getCompleteTime() {
		return completeTime;
	}

	public int getAthleteScore() {
		return athleteScore;
	}

	public void setAthleteScore(int athleteScore) {
		this.athleteScore = athleteScore;
	}

	public String toRaceResult() {
		return participant.getParticipantID() + "\t" + "\t" + participant.getParticipantName() + "\t" + "\t"
				+ participant.getParticipantAge() + "\t" + "\t" + participant.getParticipantState() + "\t" + "\t"
				+ getCompleteTime();

	}

	public String toString() {
		return participant.getParticipantID() + "\t" + "\t" + participant.getParticipantName() + "\t" + "\t"
				+ getAthleteScore();
	}

}
