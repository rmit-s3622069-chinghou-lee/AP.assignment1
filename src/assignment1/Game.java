package assignment1;

import java.util.Scanner;

public class Game {

	private int raceID = 0;
	
	private ParticipantsDatabase pd = new ParticipantsDatabase();
	
	public Game(int raceID){
		this.raceID = raceID;
	}

	public int getRaceID(){
		return raceID;
	}
	
	public void setRaceID(int raceID) {
		this.raceID = raceID;
	}
	
	public String generateRaceID(int option){
		if (option == 1){
			
		}
		return null;
	}
	
	public int gameSelect() {
		boolean validInput = false;

		do {
			validInput = true;
			try {
				String menu[] = { "Select a sport to play: ", "1. Swimming race", "2. Running race",
						"3. Cycling race" };
				for (int i = 0; i < menu.length; i++)
					System.out.println(menu[i]); // display the main menu

				System.out.print("Enter a option: ");
				Scanner scanner = new Scanner(System.in);
				raceID = scanner.nextInt(); // user insert input
				
				if (raceID == 1 || raceID ==2 || raceID ==3) {
					System.out.println("");
				} else {
					System.out.println("Please insert a valid input!");
					System.out.println("");
					validInput = false;
				}
			} catch (Exception e) {
				System.out.println("Not a valid Input. Please try again!");
				System.out.println("");
				validInput = false;
			}
		} while (!validInput);

		return raceID;
	}

	public int gamePrediction() {
		int userPredict = 0;
		boolean validInput = false;
		
		pd.printAthletes(raceID);
		do {
			try {
				System.out.println("Please predict the winner by entering the athlete's ID: ");
				Scanner scanner = new Scanner(System.in);
				userPredict = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Please insert valid athlete's ID!");
			}
		} while (!validInput);

		return userPredict;
	}

	public void gameStart() {
		System.out.println("gameStart");

	}

	public void displayFinalResult() {
		System.out.println("displayFinalResult");
	}

	public void displayAthletePoints() {
		System.out.println("displayAthletePoints");

	}
	
}
