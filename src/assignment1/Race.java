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
	
	public void setAthleteScore(int athleteScore){
		this.athleteScore = athleteScore;
	}

	public int getCompete(int raceType) {
		int competeTime = 0;
		if (raceType == 1) {
			Swimmer s = new Swimmer(null, null, 0, null, null);
			competeTime = (int) s.compete();
		} else if (raceType == 1) {
			Sprinter r = new Sprinter(null, null, 0, null, null);
			competeTime = (int) r.compete();
		} else if (raceType == 1) {
			Cyclist c = new Cyclist(null, null, 0, null, null);
			competeTime = (int) c.compete();
		}
		return competeTime;

	}

	public String toString() {
		return getParticipant().getParticipantID() + "\t" + "\t" + getParticipant().getParticipantName();

	}

}
