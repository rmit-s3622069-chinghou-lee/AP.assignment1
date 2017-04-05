package assignment1;

public class Race extends Game {

	private int gameRounds;
	private Participant participant;
	private Official official;
	private double completeTime;
	private int athleteScore;

	private Database Database = new Database();

	public Race(int gameRounds, Participant participant, Official official, double completeTime, int athleteScore) {
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

	public double getCompleteTime() {
		return completeTime;
	}

	public double setCompleteTime(int raceType) {
		if (raceType == 1) {
			Swimmer s = new Swimmer(null, null, 0, null, null);
			completeTime = s.compete(raceType);
		} else if (raceType == 2) {
			Sprinter r = new Sprinter(null, null, 0, null, null);
			completeTime = r.compete(raceType);
		} else if (raceType == 3) {
			Cyclist c = new Cyclist(null, null, 0, null, null);
			completeTime = c.compete(raceType);
		}else{
			System.out.println("Error\n");
		}
		return completeTime;
	}

	public int getAthleteScore() {
		return athleteScore;
	}
	
	

	public String toSring() {
		System.out.println("Result for race: " + gameRounds);
		System.out.println("Referee for this race is: " + official);
		return participant.getName() + "\t" + completeTime + "\t" + athleteScore;

	}

}
