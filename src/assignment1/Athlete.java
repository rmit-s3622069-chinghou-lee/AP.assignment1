package assignment1;

abstract public class Athlete extends Participant {
	
	private String atheleteType;

	public Athlete(String id, String name, int age, String state, String type) {
		super(id, name, age, state, type);
		this.atheleteType = type;
	}
	
	abstract public double compete();

}
