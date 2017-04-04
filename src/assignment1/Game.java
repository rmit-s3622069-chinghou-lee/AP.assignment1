package assignment1;

import java.util.*;

public class Game {
	private int gameRounds;
	private int participantJoin;
	final static int minAthlete = 4;
	final static int maxAthlete = 8;

	private Database Database = new Database();

	private ArrayList<Participant> Athlete = Database.getAllParticipants();;
	private ArrayList<Participant> Participant;
	private ArrayList<Participant> GameParticipant;
	private ArrayList<Race> Race;
	
	public ArrayList<Race> setRacePoints(){
		Race.get(0).setGameRounds(5);
		Race.get(1).setGameRounds(2);
		Race.get(2).setGameRounds(1);
		return Race;
		
	}
	
	public void gameStart(int raceType) {
		loadParticipant(raceType);
		

	}
	
	public void loadParticipant(int raceType){
		Participant = Participant(raceType);
		Race = new ArrayList<Race>();
		if (raceType ==1){
			Swimmer s = new Swimmer(null, null, 0, null, null);
			for (int i = 0; i <Participant.size();i++){
				Race.add(new Race(gameRounds, Participant.get(i), Database.getOfficial().get(i), s.compete(), 0));
				//System.out.println(gameRounds + Participant.toString() + Database.getOfficial().get(i) + s.compete()+ 0);
			}Race.forEach(System.out::println);			
		}else if (raceType == 2){
				Sprinter r = new Sprinter(null, null, 0, null, null);
				for (int i = 0; i <Participant.size();i++){
					Race.add(new Race(gameRounds, Participant.get(i), Database.getOfficial().get(i), r.compete(), 0));
				}
		}else if (raceType == 3){
			Cyclist c = new Cyclist(null, null, 0, null, null);
			for (int i = 0; i <Participant.size();i++){
				Race.add(new Race(gameRounds, Participant.get(i), Database.getOfficial().get(i), c.compete(), 0));
			}
		}else{
			System.out.println("Please select a valid game to run!");
		}
	}

	public ArrayList<Participant> Participant(int raceType) {
		Participant = new ArrayList<Participant>();
		if (raceType == 1) { // swimming
			Participant.addAll(Database.getSwimmer());
			Participant.addAll(Database.getSuperAthlete());
		} else if (raceType == 2) { // runner
			Participant.addAll(Database.getRunner());
			Participant.addAll(Database.getSuperAthlete());
		} else if (raceType == 3) {
			Participant.addAll(Database.getCyclist());
			Participant.addAll(Database.getSuperAthlete());
		} else {
			participantCheck();
		}
		return Participant;
	}

	public void participantCheck() {
		if (Participant.size() < minAthlete || Participant.size() > maxAthlete) {
			System.out.println("\nThere is not enough athlete to run the game!");
			System.out.println("Please pick another game\n");
			Participant.clear();
			gameSelect();
		}
	}

	public int gameSelect() {
		int gameSelectInput = 0;
		boolean validInput = false;

		do {
			validInput = true;
			try {
				String menu[] = { "Select a sport to play: ", "========================", "1. Swimming race",
						"2. Running race", "3. Cycling race" };
				for (int i = 0; i < menu.length; i++)
					System.out.println(menu[i]); // display the sport selection
				// menu

				System.out.print("Enter a option: ");
				Scanner scanner = new Scanner(System.in);
				gameSelectInput = scanner.nextInt(); // user insert input

				if (gameSelectInput == 1) {
					addGameRound(gameSelectInput);
					System.out.println("\nCurrent sport: Swimming Race\n");
				} else if (gameSelectInput == 2) {
					addGameRound(gameSelectInput);
					System.out.println("\nCurrent sport: Running Race\n");
				} else if (gameSelectInput == 3) {
					addGameRound(gameSelectInput);
					System.out.println("\nCurrent sport: Cycling Race\n");
				} else {
					System.out.println("\nPlease insert a valid input!\n");
					validInput = false;
				}
			} catch (Exception e) {
				System.out.println("\nNot a valid Input. Please try again!\n");
				validInput = false;
			}
		} while (!validInput);

		return gameSelectInput;
	}

	public int addGameRound(int raceType) {
		boolean gameRound = false;

		do {
			if (raceType >= 1 && raceType <= 3) {
				gameRounds += 1;
				break;
			} else {
				System.out.println("\nError\n!");
				gameSelect(); // return to Menu
			}
		} while (!gameRound);
		return gameRounds;
	}

	public int gamePrediction(int raceType) {
		int userPredict = 0;
		boolean validInput = false;

		do {
			printAthleteList(raceType);
			try {
				System.out.println("\nPlease predict the winner by entering the athlete's ID: ");
				Scanner scanner = new Scanner(System.in);
				userPredict = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Please insert valid athlete's ID!");
				validInput = false;
			}
			break;
		} while (!validInput);
		return userPredict;

	}

	public void printAthleteList(int raceType) {
		boolean printLoop = false;

		System.out.println("No." + "\t" + "Athlete ID" + "\t" + "Athlete Name" + "\t" + "Athlete Age" + "\t"
				+ "Athlete State" + "\t");
		do {
			for (int i = 0, No = 1; i < Athlete.size(); i++, No++) {
				String checkType = Athlete.get(i).getType();
				String id = Athlete.get(i).getID();
				String name = Athlete.get(i).getName();
				int age = Athlete.get(i).getAge();
				String state = Athlete.get(i).getState();

				if (raceType == 1 && checkType.equals("Swimmer")) {
					System.out.println(No + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state);
				} else if (raceType == 2 && checkType.equals("Runner")) {
					System.out.println(No + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state);
				} else if (raceType == 3 && checkType.equals("Cyclist")) {
					System.out.println(No + "\t" + id + "\t" + "\t" + name + "\t" + "\t" + age + "\t" + "\t" + state);
				} else {
					printLoop = true; // end the loop
				}
			}
		} while (!printLoop);
	}

	public void displayFinalResult() {
		System.out.println("displayFinalResult");
	}

	public void displayAthletePoints() {
		System.out.println("displayAthletePoints");

	}

}
