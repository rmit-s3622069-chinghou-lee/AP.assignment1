package assignment1;

import java.util.Scanner;

/*
 * Driver program for the Ozlympic
 */
public class Driver {

	public void run() {
		menu(); // Ozlympic Menu
	}

	// start Ozylimpic
	public int menu() {
		int option;
		Scanner scanner = new Scanner(System.in);

		// display the main menu
		do {
			String menu[] = { "Ozlympic Game", 
					"========================", 
					"1. Select a game to run",
					"2. Predict the winner of the game", 
					"3. Start the game",
					"4. Display the final results of all games", 
					"5. Display the points of all athletes", 
					"6. Exit" };
			for (int i = 0; i < menu.length; i++)
				System.out.println(menu[i]);

			System.out.print("Enter a option: ");
			option = scanner.nextInt(); // user input
		} while (option < 1 || option > 6);
		return option;
	}
}
