import java.util.Scanner;
import java.util.Random;

public class Jar {
	
	int userGuess = 0;
	int maxItemsAllowed = 0;
	int randomNumber = 0;
	int guessCount = 0;
	String item = " ";
	String adminChooseItemMessage = "ADMINISTRATOR SETUP:\nWhat item would you like tp put in the jar?\n";
	
	public void adminSetup() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf(adminChooseItemMessage);
		item = scanner.next();
		item = item.toUpperCase();
		System.out.printf("Pick the maximum number of %s to put in the jar\n", item);
		maxItemsAllowed = scanner.nextInt();
 }
	
	public void fillJar() {
		Random random = new Random();
	    randomNumber = random.nextInt(maxItemsAllowed);
	}
	
	public void userGuess() {
		Scanner scanner2 = new Scanner(System.in);
		userGuess = scanner2.nextInt();
	}
	
	public void correctGuess() {
		System.out.printf("You got it in %s attempts(s).", guessCount);
	}
	
	public void incorrectGuess() {
		guessCount++;
		System.out.println("Incorrect - Please try again\n");
		Scanner scanner3 = new Scanner(System.in);
		userGuess = scanner3.nextInt();
	}
}
	

