package assignment1;

import java.util.ArrayList;

public class Cyclist extends Athlete {
	public double minTime = 500;
	public double maxTime = 800;
	
	public Cyclist(String id, String name, int age, String state,String type) {
		super(id, name, age, state, type);
	}

	
	public static void addCyclist() {
		ArrayList<Cyclist> participant = new ArrayList<Cyclist>();
		participant.add(new Cyclist("CY01", "Gavin", 45, "VIC", "Cyclist" ));
		participant.add(new Cyclist("CY02", "fred", 41, "NSW", "Cyclist"));
		participant.add(new Cyclist("CY03", "Peter", 52, "NSW", "Cyclist"));
		participant.add(new Cyclist("CY04", "Messi", 39, "VIC", "Cyclist"));
	}
	
	public double compete(){
		double randomNum = Math.random()*(maxTime - minTime +1) + minTime;
		return randomNum;
	}

}
