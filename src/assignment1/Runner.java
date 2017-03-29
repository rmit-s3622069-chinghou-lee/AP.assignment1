package assignment1;

import java.util.ArrayList;

public class Runner extends Participants {
		public String runnerID;
		public String runnerName;
		public int runnerAge;
		public String runnerState;
		public String runnerType;
		
		public Runner(String id, String name, int age, String state,String type) {
			super(id, name, age, state, type);
			this.runnerID = id;
			this.runnerName =name;
			this.runnerAge = age;
			this.runnerState =state;
			this.runnerType = type;
		}
		
		public static void addRunner() {
			ArrayList<Runner> participant = new ArrayList<Runner>();
			participant.add(new Runner("CY01", "Gavin", 45, "VIC", "Runner" ));
			participant.add(new Runner("CY02", "fred", 41, "NSW", "Runner"));
			participant.add(new Runner("CY03", "Peter", 52, "NSW", "Runner"));
			participant.add(new Runner("CY04", "Messi", 39, "VIC", "Runner"));
		}


}
