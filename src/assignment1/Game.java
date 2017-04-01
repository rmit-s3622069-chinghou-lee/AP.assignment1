package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	private int raceID;
	
	private ParticipantsDatabase pd = new ParticipantsDatabase();
	private Driver driver = new Driver();
	
	public Game(int raceID){
		this.raceID = raceID;
	}

	public int getRaceID(){
		return raceID;
	}
	
	public void setRaceID(int raceID) {
		this.raceID = raceID;
	}
	

	public int getUserSelection(){
		return driver.gameSelect();
	}
	
	public String generateRaceID(int option){
		if (option == 1){
			
		}
		return null;
	}
	

	public ArrayList<Participant> getList() {
		return pd.getParticipant();
	}

	public void printAthletes(int option) {
		for (int i = 0; i < pd.getParticipant().size(); i++) {
			String checkType = pd.getParticipant().get(i).getType();
			String id = pd.getParticipant().get(i).getID();
			String name = pd.getParticipant().get(i).getName();
			int age = pd.getParticipant().get(i).getAge();
			String state = pd.getParticipant().get(i).getState();
			String type = pd.getParticipant().get(i).getType();

			if (option == 1 && checkType.equals("Swimmer")) {
				System.out.println(id + name + age + state + type);
			} else if (option == 2 && checkType.equals("Runner")) {
				System.out.println(id + name + age + state + type);
			} else if (option == 3 && checkType.equals("Cyclist")) {
				System.out.println(id + name + age + state + type);
			}
		}
	}
}
