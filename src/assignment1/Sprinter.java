package assignment1;

public class Sprinter extends Athlete {
		public double minTime = 10;
		public double maxTime = 20;
		
		public Sprinter(String id, String name, int age, String state,String type) {
			super(id, name, age, state, type);
		}
		
		public double compete(){
			double randomNum = Math.random()*(maxTime - minTime +1) + minTime;
			return randomNum;
		}


}
