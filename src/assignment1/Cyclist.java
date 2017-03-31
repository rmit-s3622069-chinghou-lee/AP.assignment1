package assignment1;

import java.util.ArrayList;

public class Cyclist extends Athlete {
	public double minTime = 500;
	public double maxTime = 800;
	
	public Cyclist(String id, String name, int age, String state,String type) {
		super(id, name, age, state, type);
	}
	
	public double compete(){
		double randomNum = Math.random()*(maxTime - minTime +1) + minTime;
		return randomNum;
	}

}
