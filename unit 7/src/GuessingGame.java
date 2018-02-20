//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int response = 0;
	private int randomNum;
	private int counter = 0;

	public GuessingGame(int stop)
	{
		
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
			counter = 0;
			Random ran = new Random();
			System.out.print("Guessing Game - How many numbers? ");
			upperBound = keyboard.nextInt();
			System.out.print("Enter a number between 1 and " + upperBound + " ");
			response = keyboard.nextInt();
			int x = ran.nextInt(upperBound) + 1;
			randomNum = x;
			
			while (response != randomNum){
				System.out.print("Enter a number between 1 and " + upperBound + " ");
				response = keyboard.nextInt();
				if (response > upperBound){
					System.out.print("number out of range!");
				}
				else {
					counter = counter + 1;
				}
			}
			
			counter = counter + 1;
			
	}//end playGame

	public String toString()
	{
		float percent = (counter *100.0f / upperBound);
		String output= "It took " + counter + " guesses to guess " + counter + "\n" +
						"You guessed wrong " + percent + " percent of the time";
		return output;
	}
}