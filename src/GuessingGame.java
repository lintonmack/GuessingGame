public class GuessingGame {

	public static void main(String[] args) {
		Jar j = new Jar();
		if (args.length == 0) {
			j.adminSetup();
			j.fillJar();
			System.out.printf("How many %s are in the jar?\n Pick a number between 1 and %s\n", j.item, j.maxItemsAllowed);
			j.userGuess();
			do {
				j.incorrectGuess();
			} while (j.userGuess != j.randomNumber); 
			j.correctGuess();
		}
	}

}
