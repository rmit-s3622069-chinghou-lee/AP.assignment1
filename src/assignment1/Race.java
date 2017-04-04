package assignment1;

public class Race extends Game {

	private int gameRounds;
	private Participant participant;
	private Official official;
	private int completeTime;
	private int athleteScore;

	private Database Database = new Database();

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

	public void setGameRounds(int raceType) {
		this.gameRounds = addGameRound(raceType);
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

	public int getCompleteTime() {
		return completeTime;
	}

	public int getAthleteScore() {
		return athleteScore;
	}

}
