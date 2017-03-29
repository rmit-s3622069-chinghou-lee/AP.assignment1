package assignment1;

import java.util.ArrayList;

public class Runner extends Participant {
		public String runnerID;
		public String runnerName;
		public int runnerAge;
		public String runnerState;
		public String runnerType;
		public double minTime = 10;
		public double maxTime = 20;
		
		public Runner(String id, String name, int age, String state,String type) {
			super(id, name, age, state, type);
			this.runnerID = id;
			this.runnerName =name;
			this.runnerAge = age;
			this.runnerState =state;
			this.runnerType = type;
		}
		
		public void addRunner() {
			ArrayList<Runner> participant = new ArrayList<Runner>();
			participant.add(new Runner("RU01", "Haile", 35, "NT", "Runner" ));
			participant.add(new Runner("RU02", "Paula", 30, "NSW", "Runner"));
			participant.add(new Runner("RU03", "Joan", 32, "Queensland", "Runner"));
			participant.add(new Runner("RU04", "Meb", 27, "VIC", "Runner"));
		}
		
		public double compete(){
			double randomNum = Math.random()*(maxTime - minTime +1) + minTime;
			return randomNum;
		}


}
