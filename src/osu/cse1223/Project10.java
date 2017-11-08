/*
 * Project10.java
 * 
 *   A program that plays and scores a round of the game Poker Dice.  In this game,
 *   five dice are rolled.  The player is allowed to select a number of those five dice
 *   to re-roll.  The dice are re-rolled and then scored as if they were a poker hand.  
 *   The following hands MUST be scored in this assignment:
 *   	* High card
 *   	* One Pair
 *   	* Two Pair
 *   	* Three of a Kind
 *   	* Full House
 *   	* Four of a Kind
 *   	* Five of a Kind
 *   For extra credit, you may also implement:
 *   	* Straight
 * 
 * @author ENTER YOUR NAME HERE
 * 
 */
package osu.cse1223;
import java.util.Scanner;


public class Project10 {

	public static int[] rolledDice = {0, 0, 0, 0, 0};
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//The Gives the player a rolled dice
		rollDice(rolledDice);
		
		//Shows the player the current dice.
		System.out.println("Your current dice: " + diceToString(rolledDice));
		
		promptForReroll(rolledDice, scan);
		
		resetDice(rolledDice);
		
		System.out.println("Your final dice: " + diceToString(rolledDice));
		
		
	}
	
	// Given an array of integers as input, sets every element of the array to zero.
	private static void resetDice(int[] dice) {
		for(int i = 0; i < dice.length; i++)
		{
			if(dice[i] == 0)
			{
				dice[i] = (int)(Math.random()*10)+1;
			}
		}
	}
	
	// Given an array of integers as input, checks each element of the array.  If the value
	// of that element is zero, generate a number between 1 and 10 and replace the zero with
	// it.  Otherwise, leave it as is and move to the next element.
	private static void rollDice(int[] dice) {
		
		for(int i = 0; i < dice.length;i++)
		{
			int roll = (int)(Math.random()*10)+1;
			
			dice[i] = roll;
		}
		
	}
	
	// Given an array of integers as input, create a formatted String that contains the
	// values in the array in the order they appear in the array.  For example, if the 
	// array contains the values [0, 3, 7, 5, 2] then the String returned by this method
	// should be "0 3 7 5 2".
	private static String diceToString(int[] dice) {
		
		String s = "";
		
		for(int i: dice)
		{
			s = s + i + " ";
		}
		
		return s;
		
	}
	
	
	// Given an array of integers and a Scanner as input, prompt the user with a message
	// to indicate which dice should be re-rolled.  If the user enters a valid index (between
	// 0 and the total number of dice -1) then set the die at that index to zero.  If the 
	// user enters a -1, end the loop and return to the calling program.  If the user enters
	// any other invalid index, provide an error message and ask again for a valid index.
	private static void promptForReroll(int[] dice, Scanner inScanner) {
		
		while(true)
		{
			System.out.print("Select a die to re-roll (-1 to keep remaining dice): ");
			int x = inScanner.nextInt();
			
			if(x == -1)
			{
				System.out.println("Keeping remaining dice...");
				System.out.println("Rerolling...");
				break;
			}
			else if(x >= 0 && x <= 4)
			{
				dice[x] = 0;
				System.out.println("Your current dice: " + diceToString(dice));
			}
			else
			{
				System.out.println("Error: Index must be between 0 and 4 (-1 to quit)!");
			}
		}
	}
	
	// Given a Scanner as input, prompt the user to play again.  The only valid entries
	// from the user are 'Y' or 'N', in either upper or lower case.  If the user enters
	// a 'Y' the method should return a value of true to the calling program.  If the user
	// enters a 'N' the method should return a value of false.  If the user enters anything
	// other than Y or N (including an empty line), an error message should be displayed
	// and the user should be prompted again until a valid response is received.
	private static boolean promptForPlayAgain(Scanner inScanner) {

		return true;
	}
	
	// Given an array of integers, determines the result as a hand of Poker Dice.  The
	// result is determined as:
	//	* Five of a kind - all five integers in the array have the same value
	//	* Four of a kind - four of the five integers in the array have the same value
	//	* Full House - three integers in the array have the same value, and the remaining two
	//					integers have the same value as well (Three of a kind and a pair)
	//	* Three of a kind - three integers in the array have the same value
	//	* Two pair - two integers in the array have the same value, and two other integers
	//					in the array have the same value
	//	* One pair - two integers in the array have the same value
	//	* Highest value - if none of the above hold true, the Highest Value in the array
	//						is used to determine the result
	//
	//	The method should evaluate the array and return back to the calling program a String
	//  containing the score from the array of dice.
	//
	//  EXTRA CREDIT: Include in your scoring a Straight, which is 5 numbers in sequence
	//		[1,2,3,4,5] or [2,3,4,5,6] or [3,4,5,6,7] etc..
	private static String getResult(int[] dice) {


		return "";
	}
	
	// Given an array of integers as input, return back an array with the counts of the
	// individual values in it.  You may assume that all elements in the array will have 
	// a value between 1 and 10.  For example, if the array passed into the method were:
	//   [1, 2, 3, 3, 7]
	// Then the array of counts returned back by this method would be:
	// [1, 1, 2, 0, 0, 0, 1, 0, 0, 0]
	// (Where index 0 holds the counts of the value 1, index 1 holds the counts of the value
	//  2, index 2 holds the counts of the value 3, etc.)
	// HINT:  This method is very useful for determining the score of a particular hand
	//  of poker dice.  Use it as a helper method for the getResult() method above.
	
	/*
	private static int[] getCounts(int[] dice) {

		
	}
	*/
	



}
