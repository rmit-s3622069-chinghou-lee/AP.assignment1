package assignment1;

public class Race extends Game {

	private int gameRounds;
	private Participant participant;
	private Official official;
	private int completeTime;
	private int athleteScore;
	private Athlete athlete;

	public Race(int gameRounds, Participant participant, Official official, int completeTime, int athleteScore) {
		this.gameRounds = gameRounds;
		this.participant = participant;
		this.official = official;
		this.completeTime = completeTime;
		this.athleteScore = athleteScore;
	}

	public int getGameRounds() {
		return gameRounds;
	}

	public void setGameRounds(int gameRounds) {
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

	public Athlete athlete() {
		return athlete;
	}

	public double setCompleteTime(int raceType) {
		double completeTime = 0;
		if (raceType >= 1 && raceType <= 3) {
			completeTime = athlete().compete();
		} else {
			System.out.println("Error\n");
		}
		return (int) completeTime;
	}

	public int getCompleteTime() {
		return completeTime;
	}

	public int getAthleteScore() {
		return athleteScore;
	}

	public String toString() {
		return getParticipant().getParticipantID() + "\t" + "\t" + getParticipant().getParticipantName();

	}

}
