import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int randomNumber = random.nextInt(6)+1;
		
		System.out.println("Drawing a number...");
		
		Thread.sleep(3000);
		
		int playerGuess;
		int totalGuesses = 0;
		do {
			if (totalGuesses > 0) {
				System.out.println("You missed, try again:");
			}
			System.out.print("Try to find out what number was drawn between 1 and 6: ");
			playerGuess = sc.nextInt();
			totalGuesses += 1;
		} while (randomNumber != playerGuess && totalGuesses < 2);
		
		System.out.print("The number drawn was " + randomNumber + ".");
		if (playerGuess == randomNumber) {
			System.out.println(" Congratulations you won!");
		} else {
			System.out.println(" Sorry, you lost!");
		}
		
	}

}
