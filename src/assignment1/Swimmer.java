package assignment1;

import java.util.ArrayList;

public class Swimmer extends Athlete {

	public double minTime = 100;
	public double maxTime = 200;
	
	public Swimmer(String id, String name, int age, String state,String type) {
		super(id, name, age, state, type);
	}
	
	public double compete(){
		double randomNum = Math.random()*(maxTime - minTime +1) + minTime;
		return randomNum;
	}
}
