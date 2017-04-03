package assignment1;

import java.util.ArrayList;

public class Official extends Participant {
	private int score;
	private double completeTime;

	public Official(String id, String name, int age, String state, String type) {
		super(id, name, age, state, type);
	}

	public void countScore(){
		// if participant with shortest time get 5 points
		// if participant with between longest - shortest time get 2 points
		// if participant with longest time get 1 points
	}

}
